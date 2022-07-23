package com.example.final_project.RESTcontroller;

import com.example.final_project.model.request.UserDetailsRequestModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    @PostMapping
    public String createUser(@RequestBody UserDetailsRequestModel userDetailsRequestModel)
    {
        return "Create user method was called";
    }


}
