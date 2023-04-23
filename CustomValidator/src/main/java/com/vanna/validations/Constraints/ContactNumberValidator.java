package com.vanna.validations.Constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactNumberValidator implements ConstraintValidator<ContactNumber, String>{

	@Override
	public boolean isValid(String phonenumber, ConstraintValidatorContext context) {
		
		return phonenumber !=null && phonenumber.matches("[0-9]+") && (phonenumber.length()>8) && (phonenumber.length() < 14);
	}

}
