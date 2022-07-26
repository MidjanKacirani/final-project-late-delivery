package com.example.final_project.work.ui.controller;

import com.example.final_project.work.bl.model.entity.user.User;
import com.example.final_project.work.bl.model.entity.user.UserDetails;
import com.example.final_project.work.bl.services.UserDetailService;
import com.example.final_project.work.bl.services.UserService;
import com.example.final_project.work.bl.services.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;
    private UserDetailService userDetailService;

    public UserController(UserService userService, UserDetailService userDetailService) {
        this.userService = userService;
        this.userDetailService = userDetailService;
    }

    /**
     * Stores one user
     * @param user
     */
    @PostMapping
    public User storeUser(@RequestBody User user)
    {
       return userService.storeUser(user);
    }

    /**
     * Stores the user details for a specific user
     * @param userDetail
     */
    @PostMapping("/{id}")
    public UserDetails storeUserDetail(@RequestBody UserDetails userDetail, @PathVariable("id") String id)
    {
        return userDetailService.storeUserDetails(userDetail);
    }

}
