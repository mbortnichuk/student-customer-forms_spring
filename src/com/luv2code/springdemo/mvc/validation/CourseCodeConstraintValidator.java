package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by mbortnic on 4/4/19.
 */
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

    private String coursePrefix; // validate multiple Strings -> String[]

    @Override
    public void initialize(CourseCode theCourseCode) {
        coursePrefix = theCourseCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
        boolean res;

        if (theCode != null) {
            // Update the isValid(...) method to loop through the course prefixes. In the loop, check to see if the code matches any of the course prefixes.
            res = theCode.startsWith(coursePrefix);
        } else {
            res = true;
        }

        return res;
    }
}
