package com.blog.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.blog.form.PersonForm;

public class PersonValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		if (clazz.isAssignableFrom(PersonForm.class)) {
			return true;
		}
		return false;
	}

	public void validate(Object target, Errors errors) {
		PersonForm form = (PersonForm) target;

		if (form.getName() == null || form.getName().trim().length() == 0) {
			errors.rejectValue("name", "name.blank");
		}
		if (form.getEmail() == null || form.getEmail().trim().length() == 0) {
			errors.rejectValue("email", "email.blank");
		}

		if (form.getPassword() == null || form.getPassword().trim().length() == 0) {
			errors.rejectValue("password", "password.blank");
		}
	}

}
