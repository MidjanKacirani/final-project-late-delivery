package com.example.final_project.work.bl.model.entity.restaurant;

import com.example.final_project.work.bl.model.entity.order.OrderDetails;

import javax.persistence.*;

@Entity
@Table(name = "restaurant_menu")
public class RestaurantMenu {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "menu_name", nullable = false, unique = true)
    private String name;

    @Column(name = "is_visible", nullable = false)
    private Boolean is_visible;

    @OneToOne(mappedBy = "restaurant_menu", fetch = FetchType.EAGER)
    private OrderDetails orderDetails;

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
}
