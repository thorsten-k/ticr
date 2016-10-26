package de.kisner.ticr.model.xml;

import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.kisner.ticr.test.TicrXmlTestBootstrap;

public class TestXmlBlog extends AbstractXmlTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlBlog.class);
	
	@BeforeClass public static void initFiles(){setXmlFile(dirSuffix, Blog.class);}
    
    @Test
    public void xml() throws FileNotFoundException
    {
    	Blog actual = create(true);
    	Blog expected = JaxbUtil.loadJAXB(fXml.getAbsolutePath(), Blog.class);
    	assertJaxbEquals(expected, actual);
    }
       
    public static Blog create(boolean withChilds)
    {
    	Blog xml = new Blog();
    	xml.setCode("myCode");
    	xml.setName("myName");
    	
    	if(withChilds)
    	{
    		
    	}
    	return xml;
    }
    
    public void save() {save(create(true),fXml);}
	
	public static void main(String[] args)
    {
		TicrXmlTestBootstrap.init();
			
		TestXmlBlog.initFiles();	
		TestXmlBlog test = new TestXmlBlog();
		test.save();
    }
}