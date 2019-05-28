package com.blog.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.blog.entities.Blog;

@Repository
public class BlogDaoImpl implements BlogDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public int createBlog(Blog blog) {

		return (int) hibernateTemplate.save(blog);

	}

	@Override
	public List<Blog> getBlogs() {

		return hibernateTemplate.execute(new HibernateCallback<List<Blog>>() {
			@Override
			public List<Blog> doInHibernate(Session session) throws HibernateException {
				Query query = null;
				query = session.createQuery("from blog");
				return query.list();
			}

		});

	}

}
