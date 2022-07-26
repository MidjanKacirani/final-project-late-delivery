package com.example.final_project.work.bl.model.entity.user;

import com.example.final_project.work.bl.model.enums.ROLES;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long Id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false, unique = true)
    private String password;


    @Enumerated(value = EnumType.STRING)
    @Column(name = "role", nullable = false)
    private ROLES role;

    @OneToOne(mappedBy = "user", fetch = FetchType.EAGER)
    private UserDetails userDetails;


    //getters and setters


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ROLES getRole() {
        return role;
    }

    public void setRole(ROLES role) {
        this.role = role;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

}
