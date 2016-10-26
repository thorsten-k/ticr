package de.kisner.ticr.factory.ejb;

import com.tumblr.jumblr.types.Blog;

import de.kisner.ticr.model.ejb.TumblrBlog;

public class EjbBlogFactory
{
	public static TumblrBlog build(String code)
	{
		TumblrBlog ejb = new TumblrBlog();
		ejb.setCode(code);
		return ejb;
	}
	
	public static TumblrBlog build(Blog blog)
	{
		TumblrBlog ejb = new TumblrBlog();
		ejb.setCode(blog.getName());
		ejb.setName(blog.getTitle());
		return ejb;
	}
}