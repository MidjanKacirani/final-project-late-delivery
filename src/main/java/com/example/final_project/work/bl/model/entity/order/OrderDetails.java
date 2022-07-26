package com.example.final_project.work.bl.model.entity.order;

import com.example.final_project.work.bl.model.entity.restaurant.RestaurantMenu;
import com.example.final_project.work.bl.model.enums.STATUS;

import javax.persistence.*;
import javax.persistence.Id;


@Entity
@Table(name = "order_details")
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long Id;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_menu_id", referencedColumnName = "Id")
    private RestaurantMenu restaurant_menu;


    @Enumerated(value = EnumType.STRING)
    @Column(name = "status", nullable = false)
    private STATUS status;

    //getters and setters


    public RestaurantMenu getRestaurantMenu() {
        return restaurant_menu;
    }

    public void setRestaurantMenu(RestaurantMenu restaurantMenu) {
        this.restaurant_menu = restaurantMenu;
    }

    public Order getOrder_id() {
        return order;
    }

    public void setOrder_id(Order order_id) {
        this.order = order_id;
    }


    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }
}
