package com.example.final_project.work.bl.model.entity.restaurant;

import javax.persistence.*;

@Entity
@Table(name = "restaurant_items")
public class RestaurantMenuItem {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long Id;

    @Column(name = "item_name", nullable = false, unique = true)
    private String itemName;

    @Column(name = "item_stock", nullable = false)
    private Integer stock;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name = "restaurantMenu",
            referencedColumnName = "id"
    )
    private RestaurantMenu restaurantMenu;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public RestaurantMenu getRestaurantMenu() {
        return restaurantMenu;
    }

    public void setRestaurantMenu(RestaurantMenu restaurantMenu) {
        this.restaurantMenu = restaurantMenu;
    }
}
