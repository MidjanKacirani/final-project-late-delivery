package com.example.final_project.work.bl.repository.roles.clientRepo;

import com.example.final_project.work.bl.model.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<User, Long> {
}
