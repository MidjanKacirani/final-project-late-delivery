package com.example.final_project.work.bl.repository.roles.adminRepo;

import com.example.final_project.work.bl.model.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAdminRepository extends JpaRepository<User, Long> {

}
