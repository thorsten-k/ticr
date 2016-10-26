package de.kisner.ticr.model.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.kisner.ticr.test.TicrXmlTestBootstrap;

public class TestXmlBlog extends AbstractXmlTicrTest<Blog>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlBlog.class);
	
	public TestXmlBlog(){super(Blog.class);}
	public static Blog create(boolean withChildren){return (new TestXmlBlog()).build(withChildren);}
    
    public Blog build(boolean withChilds)
    {
    	Blog xml = new Blog();
    	xml.setCode("myCode");
    	xml.setName("myName");
    	
    	if(withChilds)
    	{
    		
    	}
    	return xml;
    }
	
	public static void main(String[] args)
    {
		TicrXmlTestBootstrap.init();	
		TestXmlBlog test = new TestXmlBlog();
		test.saveReferenceXml();
    }
}