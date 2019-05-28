package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {

	@PostMapping
	public String createBlog(@RequestParam("title") String title, @RequestParam("description") String description) {
		return "createBlog";
	}
	
	
	
}
