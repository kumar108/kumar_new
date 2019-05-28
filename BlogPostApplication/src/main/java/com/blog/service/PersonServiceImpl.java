package com.blog.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.blog.bo.PersonBo;
import com.blog.dao.PersonDao;
import com.blog.entities.Person;

public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;

	@Override
	public int addPerson(Person person) {
		PersonBo personBo = new PersonBo();
		personBo.setName(person.getName());
		personBo.setEmail(person.getEmail());
		personBo.setPassword(person.getPassword());

		return personDao.addPerson(personBo);

	}

}
