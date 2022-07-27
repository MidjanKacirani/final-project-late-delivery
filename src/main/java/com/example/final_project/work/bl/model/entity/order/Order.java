package com.example.final_project.work.bl.model.entity.order;

import com.example.final_project.work.bl.model.entity.restaurant.Restaurant;
import com.example.final_project.work.bl.model.entity.user.UserDetails;

import javax.persistence.*;
import javax.persistence.Id;


@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long Id;

    @Column(name="order_name", nullable = false)
    private String orderName;

    @Column(name = "is_visible", nullable = false)
    private Boolean is_visible;

    @OneToOne(mappedBy = "orders", fetch = FetchType.EAGER)
    private OrderDetails orderDetails;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_details_id", referencedColumnName = "id")
    private UserDetails user_details;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_id", referencedColumnName = "id")
    private Restaurant restaurant;


    //getters and setters


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public UserDetails getUserDetails_id() {
        return user_details;
    }

    public void setUserDetails_id(UserDetails userDetails_id) {
        this.user_details = userDetails_id;
    }

    public Restaurant getRestaurant_id() {
        return restaurant;
    }

    public void setRestaurant_id(Restaurant restaurant_id) {
        this.restaurant = restaurant_id;
    }


    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public UserDetails getUser_details() {
        return user_details;
    }

    public void setUser_details(UserDetails user_details) {
        this.user_details = user_details;
    }
}
