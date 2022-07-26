package com.example.final_project.work.bl.services;

import com.example.final_project.work.bl.model.entity.restaurant.Restaurant;
import com.example.final_project.work.bl.model.entity.user.User;

import java.util.List;

public interface AdminService {

    List<User> getAllUsers();

    User insertUser(User user);

    User updateUser(User user);

    Boolean deleteUserById(Long Id);

    List<Restaurant> getAllRestaurant();

    Restaurant insertRestaurant(Restaurant restaurant);

    Restaurant updateRestaurant(Restaurant restaurant);

    Boolean deleteRestaurantById(Long Id);

}
