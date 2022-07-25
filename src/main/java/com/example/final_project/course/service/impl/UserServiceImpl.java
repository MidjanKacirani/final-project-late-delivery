package com.example.final_project.course.service.impl;

import com.example.final_project.course.dto.UserDto;
import com.example.final_project.course.entity.UserEntity;
import com.example.final_project.course.repository.UserRepository;
import com.example.final_project.course.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto user) {

        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);

        userEntity.setEncryptedPassword("test");
        userEntity.setUserId("testUserId");

         UserEntity storedValue = userRepository.save(userEntity);

        UserDto returnUser = new UserDto();
        BeanUtils.copyProperties(storedValue, returnUser);

        return returnUser;

    }
}
