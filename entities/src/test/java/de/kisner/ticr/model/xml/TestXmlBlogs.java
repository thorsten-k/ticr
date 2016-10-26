package de.kisner.ticr.model.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.kisner.ticr.test.TicrXmlTestBootstrap;

public class TestXmlBlogs extends AbstractXmlTicrTest<Blogs>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlBlogs.class);
	
	public TestXmlBlogs(){super(Blogs.class);}
	public static Blogs create(boolean withChildren){return (new TestXmlBlogs()).build(withChildren);}
       
    public Blogs build(boolean withChilds)
    {
    	Blogs xml = new Blogs();
    	
    	if(withChilds)
    	{
    		xml.getBlog().add(TestXmlBlog.create(false));
    		xml.getBlog().add(TestXmlBlog.create(false));
    	}
    	return xml;
    }
	
	public static void main(String[] args)
    {
		TicrXmlTestBootstrap.init();	
		TestXmlBlogs test = new TestXmlBlogs();
		test.saveReferenceXml();
    }
}