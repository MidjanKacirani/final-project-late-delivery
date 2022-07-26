package com.example.final_project.work.bl.services.impl;

import com.example.final_project.work.bl.model.entity.user.UserDetails;
import com.example.final_project.work.bl.repository.userDetailRepo.UserDetailRepository;
import com.example.final_project.work.bl.services.UserDetailService;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailService {


    private UserDetailRepository userDetailRepository;

    public UserDetailsServiceImpl(UserDetailRepository userDetailRepository) {
        this.userDetailRepository = userDetailRepository;
    }

    @Override
    public UserDetails storeUserDetails(UserDetails userDetails) {
       return userDetailRepository.save(userDetails);
    }
}
