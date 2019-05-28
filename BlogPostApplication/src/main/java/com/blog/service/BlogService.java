package com.blog.service;

import java.util.List;

import com.blog.entities.Blog;

public interface BlogService {
	
	public int createBlog(Blog blog);
	
	public List<Blog> getBlogs();
}
