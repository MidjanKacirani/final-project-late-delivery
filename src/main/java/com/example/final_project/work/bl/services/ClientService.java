package com.example.final_project.work.bl.services;

import com.example.final_project.work.bl.model.entity.order.OrderDetails;
import com.example.final_project.work.bl.model.entity.restaurant.Restaurant;
import com.example.final_project.work.bl.model.entity.restaurant.RestaurantMenu;
import com.example.final_project.work.bl.model.enums.STATUS;

import java.util.List;

public interface ClientService {

    List<RestaurantMenu> retrieveAllActiveMenu();

    String order(RestaurantMenu restaurantMenu);

    STATUS checkOrderStatus(Long Order_id);

    List<OrderDetails> seeAllMyOrders();


}
