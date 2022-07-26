package com.example.final_project.work.ui.controller;

import com.example.final_project.work.bl.model.entity.user.User;
import com.example.final_project.work.bl.services.UserService;
import com.example.final_project.work.bl.services.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @PostMapping
    public User storeUser(@RequestBody User user)
    {
       return userService.storeUser(user);
    }

}
