package de.kisner.ticr.factory.xml;

import de.kisner.ticr.model.xml.Blog;

public class XmlBlogFactory
{	
	public static Blog build(String code){return build(code,null);}
	
	public static Blog build(String code, String name)
	{
		Blog blog = new Blog();
		blog.setCode(code);
		blog.setName(name);
		return blog;
	}
}
