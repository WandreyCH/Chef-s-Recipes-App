package com.example.chefsrecipeapp;

public class UserClass {

    public String name, email, role;

    public UserClass() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public UserClass(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

}
