package com.example.final_project.course.ui.model.response;

public class UserRest {
    /**
     * UserId is different from the autoIncrement value of the db user ID
     */
    private String userId;
    private String email;

    private String name;

    private String surname;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
