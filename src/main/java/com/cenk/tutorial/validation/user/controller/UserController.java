package com.cenk.tutorial.validation.user.controller;

import com.cenk.tutorial.validation.user.model.User;
import com.cenk.tutorial.validation.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Cengizhan Ozcan
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User create(@RequestBody User user){
        return userService.saveOrUpdate(user);
    }

    @PutMapping("/")
    public User update(@RequestBody User user){
        return userService.saveOrUpdate(user);
    }

    @DeleteMapping("/")
    public Boolean delete(Long userId){
        return userService.delete(userId);
    }
}
