package com.example.final_project.model.request;

import com.example.final_project.enums.ROLES;

public class UserDetailsRequestModel {

    private String email;
    private String password;
    private ROLES user_Role;

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
}
