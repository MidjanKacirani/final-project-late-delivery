package com.example.final_project.work.ui.controller;

import com.example.final_project.work.bl.model.entity.restaurant.Restaurant;
import com.example.final_project.work.bl.model.entity.user.User;
import com.example.final_project.work.bl.model.entity.user.UserDetails;
import com.example.final_project.work.bl.services.AdminService;
import com.example.final_project.work.bl.services.UserDetailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {


    private AdminService adminService;
    private UserDetailService userDetailService;

    public AdminController(AdminService adminService, UserDetailService userDetailService) {
        this.adminService = adminService;
        this.userDetailService = userDetailService;
    }

    @GetMapping("/get-users")
    public List<User> retrieveAllUsers(){
      return  adminService.getAllUsers();
    }

    @PostMapping("/save-user")
    public User saveUser(@RequestBody User user){
       return adminService.insertUser(user);
    }


    @PostMapping("/store-user-detail/{id}")
    public UserDetails storeUserDetail(@RequestBody UserDetails userDetail, @PathVariable(name = "id") Long id)
    {
        return userDetailService.storeUserDetails(userDetail, id);
    }

    @PutMapping("/update-user")
    public User updateUser(@RequestBody User user)
    {
        return adminService.updateUser(user);
    }

    @DeleteMapping("/delete-user/{id}")
    public Boolean deleteUserById(@PathVariable(name = "id") Long Id)
    {
        return adminService.deleteUserById(Id);
    }

    @GetMapping("/get-restaurants")
    public List<Restaurant> retrieveAllRestaurants()
    {
        return adminService.getAllRestaurant();
    }

    @PostMapping("/save-restaurant")
    public Restaurant saveRestaurant(@RequestBody Restaurant restaurant){
        return adminService.insertRestaurant(restaurant);
    }

    @PutMapping("/update-restaurant")
    public Restaurant updateRestaurant(@RequestBody Restaurant restaurant)
    {
        return adminService.insertRestaurant(restaurant);
    }

    @DeleteMapping("/delete-restaurant/{id}")
    public Boolean deleteRestaurantById(@PathVariable(name = "id") Long Id)
    {
        return adminService.deleteRestaurantById(Id);
    }
}
