package com.blog.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.blog.bo.PersonBo;

@Repository
public class PersonDaoImpl implements PersonDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public int addPerson(PersonBo personBo) {
		return (int) hibernateTemplate.save(personBo);

	}

}
