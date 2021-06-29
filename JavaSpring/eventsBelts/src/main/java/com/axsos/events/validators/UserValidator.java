package com.axsos.events.validators;



import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.axsos.events.models.User;


@Component
public class UserValidator implements Validator{
	
    // 1
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }
    
    // 2
    @Override
    public void validate(Object target, Errors errors) {
        User u = (User) target;    
        if (!u.getConfirmPassword().equals(u.getPassword())) {
            errors.rejectValue("passwordConfirmation", "Match");
        }         
    }	
}
