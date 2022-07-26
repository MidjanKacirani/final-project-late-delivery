package com.example.final_project.work.bl.repository.roles.adminRepo;

import com.example.final_project.work.bl.model.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository<Entity> extends JpaRepository<Entity, Long> {

}
