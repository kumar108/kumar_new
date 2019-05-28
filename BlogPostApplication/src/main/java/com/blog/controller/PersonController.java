package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.blog.entities.Person;
import com.blog.form.LoginForm;
import com.blog.form.PersonForm;
import com.blog.service.PersonService;
import com.blog.validator.PersonValidator;

@Controller
public class PersonController {

	@Autowired
	private PersonValidator personValidator;

	@Autowired
	private PersonService personService;

	@GetMapping("/register.htm")
	public String showRegisterPerson(Model model) {
		PersonForm person = new PersonForm();
		model.addAttribute("personForm", person);
		return "Registration";
	}

	@PostMapping("/register.htm")
	public String addPerson(@ModelAttribute("person") PersonForm person, BindingResult errors) {

		personValidator.validate(person, errors);
		if (errors.hasErrors()) {
			return "Registration";
		}
		Person per = new Person();
		per.setName(person.getName());
		per.setEmail(person.getEmail());
		per.setPassword(person.getPassword());
		personService.addPerson(per);

		return "createBlog";

	}

	@GetMapping("/login.htm")
	public String showLoginPage(Model model) {
		LoginForm login = new LoginForm();
		model.addAttribute("loginForm", login);
		return "loginPage";
	}

	@PostMapping("/login.htm")
	public String showBlogs(@ModelAttribute("person") Person person, BindingResult errors) {

		if (person.getEmail().equals("Kiran") && person.getPassword().equals("kiran")) {
			return "showBlogs";
		}

		else {
			return "loginPage";
		}
	}

}
