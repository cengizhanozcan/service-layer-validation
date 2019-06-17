package com.cenk.tutorial.validation.user.service;

import com.cenk.tutorial.validation.user.model.User;
import com.cenk.tutorial.validation.user.validation.DeleteValidator;
import com.cenk.tutorial.validation.user.validation.UserSaveOrUpdateValidator;
import com.cenk.tutorial.validation.validator.Validator;
import org.springframework.stereotype.Service;

/**
 * @author Cengizhan Ozcan
 */
@Service
public class UserService {

    @Validator(customValidator = UserSaveOrUpdateValidator.class)
    public User saveOrUpdate(User user){
        System.out.println("User: " + user.getName());
        return user;
    }

    @Validator(customValidator = DeleteValidator.class)
    public Boolean delete(Long userId){
        System.out.println("Deleted User Id: " + userId);
        return true;
    }
}
