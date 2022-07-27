package com.example.final_project.work.bl.repository.roles.clientRepo;

import com.example.final_project.work.bl.model.entity.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientOrderRepository extends JpaRepository<Order, Long> {
}
