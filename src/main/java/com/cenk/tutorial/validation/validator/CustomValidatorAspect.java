package com.cenk.tutorial.validation.validator;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Cengizhan Ozcan
 */
@Aspect
@Component
public class CustomValidatorAspect {

    @Before ("@annotation(validator)")
    public void validatorHandler(JoinPoint joinPoint, Validator validator) throws IllegalAccessException, InstantiationException {
        if(validator == null){
            throw new RuntimeException("Empty validator exist!!!");
        }

        Class<? extends CustomValidator> customValidator = validator.customValidator();
        Object object = customValidator.newInstance();
        Object[] args = joinPoint.getArgs();
        ((CustomValidator) object).validate(args[0]);
    }
}
