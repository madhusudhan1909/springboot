package com.example.demo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EmployeeTypeValidator.class)
public @interface ValidateEmployeeType {

    public String message()default "Invaid employeeType: IT should be either Permanent Or temporary";

        Class<?>[] groups() default {};

        Class<? extends Payload>[] payload() default {};

    }

