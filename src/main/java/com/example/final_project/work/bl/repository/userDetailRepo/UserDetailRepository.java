package com.example.final_project.work.bl.repository.userDetailRepo;

import com.example.final_project.work.bl.model.entity.user.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetails, Long> {
}
