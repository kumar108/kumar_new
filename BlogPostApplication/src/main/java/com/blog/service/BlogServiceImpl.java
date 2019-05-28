package com.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.blog.dao.BlogDao;
import com.blog.entities.Blog;

public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogDao blogDao;

	@Override
	public int createBlog(Blog blog) {

		return blogDao.createBlog(blog);

	}

	@Override
	public List<Blog> getBlogs() {
		return blogDao.getBlogs();
	}

}
