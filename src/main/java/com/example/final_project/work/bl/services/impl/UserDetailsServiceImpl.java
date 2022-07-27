package com.example.final_project.work.bl.services.impl;

import com.example.final_project.work.bl.model.entity.user.User;
import com.example.final_project.work.bl.model.entity.user.UserDetails;
import com.example.final_project.work.bl.repository.userDetailRepo.UserDetailRepository;
import com.example.final_project.work.bl.repository.userRepo.UserRepository;
import com.example.final_project.work.bl.services.UserDetailService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailService {


    private UserDetailRepository userDetailRepository;
    private UserRepository userRepository;

    public UserDetailsServiceImpl(UserDetailRepository userDetailRepository, UserRepository userRepository) {
        this.userDetailRepository = userDetailRepository;
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails storeUserDetails(UserDetails userDetails, Long Id) {
        Optional<User> user = userRepository.findById(Id);
        if(user.isPresent()){
            userDetails.setUser(user.get());
        }else{
            throw new RuntimeException("User doesn't exists!");
        }
       return userDetailRepository.save(userDetails);
    }
}
