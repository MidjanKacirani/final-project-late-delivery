package com.example.final_project.work.bl.services.impl;

import com.example.final_project.work.bl.model.entity.restaurant.Restaurant;
import com.example.final_project.work.bl.model.entity.user.User;
import com.example.final_project.work.bl.repository.roles.adminRepo.RestaurantAdminRepository;
import com.example.final_project.work.bl.repository.roles.adminRepo.UserAdminRepository;
import com.example.final_project.work.bl.services.AdminService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {

    private UserAdminRepository userAdminRepository;
    private RestaurantAdminRepository restaurantAdminRepository;

    public AdminServiceImpl(UserAdminRepository userAdminRepository, RestaurantAdminRepository restaurantAdminRepository) {
        this.userAdminRepository = userAdminRepository;
        this.restaurantAdminRepository = restaurantAdminRepository;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = userAdminRepository.findAll();
        return users;
    }

    @Override
    public User insertUser(User user) {
        return userAdminRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userAdminRepository.save(user);
    }

    @Override
    public Boolean deleteUserById(Long Id) {
        Optional<User> user = userAdminRepository.findById(Id);
        if (!user.isPresent()) {
            throw new RuntimeException("User not found");
        } else {
            user.get().setIs_visible(Boolean.FALSE);
            this.updateUser(user.get());
            return true;
        }
    }
    @Override
    public List<Restaurant> getAllRestaurant() {
        return restaurantAdminRepository.findAll();
    }

    @Override
    public Restaurant insertRestaurant(Restaurant restaurant) {
        return restaurantAdminRepository.save(restaurant);
    }

    @Override
    public Restaurant updateRestaurant(Restaurant restaurant) {
        return restaurantAdminRepository.save(restaurant);
    }

    @Override
    public Boolean deleteRestaurantById(Long Id) {
        Optional<Restaurant> restaurant = restaurantAdminRepository.findById(Id);
        if (!restaurant.isPresent()) {
            throw new RuntimeException("User not found");
        } else {
            restaurant.get().setIs_visible(Boolean.FALSE);
            this.updateRestaurant(restaurant.get());
            return true;
        }
    }


}
