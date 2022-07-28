package com.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<Password,String> {

	public boolean isValid(String s, ConstraintValidatorContext cvc) {
		
		boolean result=s.contains("jtp");
		return result;
	}
	
}
