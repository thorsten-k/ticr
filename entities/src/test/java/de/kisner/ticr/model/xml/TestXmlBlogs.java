package de.kisner.ticr.model.xml;

import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.kisner.ticr.test.TicrXmlTestBootstrap;

public class TestXmlBlogs extends AbstractXmlTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlBlogs.class);
	
	@BeforeClass public static void initFiles(){setXmlFile(dirSuffix, Blogs.class);}
    
    @Test
    public void xml() throws FileNotFoundException
    {
    	Blogs actual = create(true);
    	Blogs expected = JaxbUtil.loadJAXB(fXml.getAbsolutePath(), Blogs.class);
    	assertJaxbEquals(expected, actual);
    }
       
    public static Blogs create(boolean withChilds)
    {
    	Blogs xml = new Blogs();
    	
    	if(withChilds)
    	{
    		xml.getBlog().add(TestXmlBlog.create(false));
    		xml.getBlog().add(TestXmlBlog.create(false));
    	}
    	return xml;
    }
    
    public void save() {save(create(true),fXml);}
	
	public static void main(String[] args)
    {
		TicrXmlTestBootstrap.init();
			
		TestXmlBlogs.initFiles();	
		TestXmlBlogs test = new TestXmlBlogs();
		test.save();
    }
}