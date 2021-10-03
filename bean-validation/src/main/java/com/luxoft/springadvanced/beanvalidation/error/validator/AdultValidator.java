package com.luxoft.springadvanced.beanvalidation.error.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AdultValidator implements ConstraintValidator<Adult, Integer> {
    private static final int MINIMUM_AGE = 18;

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return integer >= MINIMUM_AGE;
    }
}
