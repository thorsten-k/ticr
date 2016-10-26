package de.kisner.ticr.api;

import java.util.Date;
import java.util.List;

import com.tumblr.jumblr.types.Blog;
import com.tumblr.jumblr.types.Post;

public interface TumblrPostDownloadTracker
{
	void updateBlogs(List<Blog> blogs);
	
	int size(Blog blog);
	Date lastModification(Blog blog);
	
	boolean isNewBlog(Post post, boolean updateTracker);
}