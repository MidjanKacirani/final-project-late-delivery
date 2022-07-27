package com.example.final_project.work.bl.repository.roles.clientRepo;

import com.example.final_project.work.bl.model.entity.order.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientOrderDetailsRepository extends JpaRepository<OrderDetails, Long> {
}
