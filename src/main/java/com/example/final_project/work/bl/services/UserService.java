package com.example.final_project.work.bl.services;

import com.example.final_project.work.bl.model.entity.user.User;
import com.example.final_project.work.bl.model.entity.user.UserDetails;
import org.springframework.stereotype.Service;


public interface UserService {

    User storeUser(User user);


}
