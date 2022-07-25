package com.example.final_project.course.ui.model.request;

import com.example.final_project.course.enums.ROLES;

public class UserDetailsRequestModel {

    private String email;
    private String password;
    private ROLES user_Role;
    private String name;
    private String surname;

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

    public ROLES getUser_Role() {
        return user_Role;
    }

    public void setUser_Role(ROLES user_Role) {
        this.user_Role = user_Role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
