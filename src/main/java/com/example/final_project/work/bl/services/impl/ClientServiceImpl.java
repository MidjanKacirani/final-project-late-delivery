package com.example.final_project.work.bl.services.impl;

import com.example.final_project.work.bl.model.entity.order.Order;
import com.example.final_project.work.bl.model.entity.order.OrderDetails;
import com.example.final_project.work.bl.model.entity.restaurant.RestaurantMenu;
import com.example.final_project.work.bl.model.enums.STATUS;
import com.example.final_project.work.bl.repository.roles.clientRepo.ClientOrderDetailsRepository;
import com.example.final_project.work.bl.repository.roles.clientRepo.ClientOrderRepository;
import com.example.final_project.work.bl.repository.roles.clientRepo.ClientRestaurantMenuRepository;
import com.example.final_project.work.bl.services.ClientService;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private ClientRestaurantMenuRepository clientRestaurantMenuRepository;
    private ClientOrderDetailsRepository clientOrderDetailsRepository;
    private ClientOrderRepository clientOrderRepository;

    public ClientServiceImpl
            (
            ClientRestaurantMenuRepository clientRestaurantMenuRepository,
            ClientOrderDetailsRepository clientOrderDetailsRepository,
            ClientOrderRepository clientOrderRepository)
    {
        this.clientRestaurantMenuRepository = clientRestaurantMenuRepository;
        this.clientOrderDetailsRepository = clientOrderDetailsRepository;
        this.clientOrderRepository = clientOrderRepository;
    }

    @Override
    public List<RestaurantMenu> retrieveAllActiveMenu() {
        return null;
    }

    @Override
    public String order(RestaurantMenu restaurantMenu) {
        clientOrderDetailsRepository.save(new OrderDetails(restaurantMenu));
        return "Order placed!";
    }

    @Override
    public STATUS checkOrderStatus(Long orderId) {

        Optional<OrderDetails> orderDetails = clientOrderDetailsRepository.findById(orderId);
       return orderDetails.get().getStatus();

    }

    @Override
    public List<OrderDetails> seeAllMyOrders() {
        return null;
    }
}
