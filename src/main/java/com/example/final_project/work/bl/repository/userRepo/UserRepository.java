package com.example.final_project.work.bl.repository.userRepo;

import com.example.final_project.work.bl.model.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
