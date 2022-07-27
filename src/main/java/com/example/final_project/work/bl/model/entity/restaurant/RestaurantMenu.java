package com.example.final_project.work.bl.model.entity.restaurant;

import com.example.final_project.work.bl.model.entity.order.OrderDetails;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "restaurant_menu")
public class RestaurantMenu {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long Id;

    @Column(name = "menu_name", nullable = false, unique = true)
    private String name;

    @Column(name = "is_visible", nullable = false)
    private Boolean is_visible;

    @Column(name = "opening_hour", nullable = false)
    private Time openingHour;

    @Column(name = "closing_hour", nullable = false)
    private Time closing;

    @Column

    @OneToOne(mappedBy = "restaurant_menu", fetch = FetchType.EAGER)
    private OrderDetails orderDetails;

    @OneToMany(mappedBy = "restaurant_menu", fetch = FetchType.EAGER)
    private List<RestaurantMenuItem> restaurantMenuItemList;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Restaurant getRestaurantId() {
        return restaurant;
    }

    public void setRestaurantId(Restaurant restaurantId) {
        this.restaurant = restaurantId;
    }

    public Boolean getIs_visible() {
        return is_visible;
    }

    public void setIs_visible(Boolean is_visible) {
        this.is_visible = is_visible;
    }

    public Time getOpeningHour() {
        return openingHour;
    }

    public void setOpeningHour(Time openingHour) {
        this.openingHour = openingHour;
    }

    public Time getClosing() {
        return closing;
    }

    public void setClosing(Time closing) {
        this.closing = closing;
    }

    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
