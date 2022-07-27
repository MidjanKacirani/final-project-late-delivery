package com.example.final_project.work.bl.model.entity.order;

import com.example.final_project.work.bl.model.entity.restaurant.RestaurantMenu;
import com.example.final_project.work.bl.model.enums.STATUS;

import javax.persistence.*;
import javax.persistence.Id;
import java.util.Date;


@Entity
@Table(name = "order_details")
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long Id;

    @Column(name = "is_visible", nullable = false)
    private Boolean is_visible;

    @Column(nullable = false)
    private Date orderDate;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order_id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_menu_id", referencedColumnName = "Id")
    private RestaurantMenu restaurant_menu_id;


    @Enumerated(value = EnumType.STRING)
    @Column(name = "status", nullable = false)
    private STATUS status;

    //getters and setters


    public RestaurantMenu getRestaurantMenu() {
        return restaurant_menu_id;
    }

    public void setRestaurantMenu(RestaurantMenu restaurantMenu) {
        this.restaurant_menu_id = restaurantMenu;
    }

    public Order getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Order order_id) {
        this.order_id = order_id;
    }


    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Boolean getIs_visible() {
        return is_visible;
    }

    public void setIs_visible(Boolean is_visible) {
        this.is_visible = is_visible;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public RestaurantMenu getRestaurant_menu_id() {
        return restaurant_menu_id;
    }

    public void setRestaurant_menu_id(RestaurantMenu restaurant_menu_id) {
        this.restaurant_menu_id = restaurant_menu_id;
    }
}
