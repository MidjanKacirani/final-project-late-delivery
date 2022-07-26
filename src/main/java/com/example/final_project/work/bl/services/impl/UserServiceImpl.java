package com.example.final_project.work.bl.services.impl;

import com.example.final_project.work.bl.model.entity.user.User;
import com.example.final_project.work.bl.repository.userRepo.UserRepository;
import com.example.final_project.work.bl.services.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;


    private UserServiceImpl(final UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public User storeUser(User user) {
       return this.userRepository.save(user);
    }
}
