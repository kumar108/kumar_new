package com.blog.dao;

import java.util.List;

import com.blog.entities.Blog;

public interface BlogDao {
	public int createBlog(Blog blog);
	public List<Blog> getBlogs();
}
