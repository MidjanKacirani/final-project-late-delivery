package com.example.final_project.work.ui.controller;

import com.example.final_project.work.bl.model.entity.restaurant.RestaurantMenu;
import com.example.final_project.work.bl.model.enums.STATUS;
import com.example.final_project.work.bl.services.ClientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/order")
    public String order(@RequestBody RestaurantMenu restaurantMenu){
        return clientService.order(restaurantMenu);
    }

    @GetMapping("/check-order-status")
    public STATUS checkOrderStatus(Long Id)
    {
        return clientService.checkOrderStatus(Id);
    }


}
