package com.auto.code.generator.specification;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RequiredValidation implements ConstraintValidator<Required, String> {
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null) {
			System.out.println(value + " is required.");
			return false;
		}
		return true;
	}

	@Override
	public void initialize(Required constraintAnnotation) {
		ConstraintValidator.super.initialize(constraintAnnotation);
	}
}
