package com.example.chefsrecipeapp;

public class ChefProfile extends User {
    private String chefDescription;

    // Default constructor for Firebase
    public ChefProfile() {
        super();
    }

    public ChefProfile(String name, String email, String chefDescription) {
        super(name, email, "Chef"); // Define "Chef" como o role fixo
        this.chefDescription = chefDescription;
    }

    public String getChefDescription() {
        return chefDescription;
    }

    public void setChefDescription(String chefDescription) {
        this.chefDescription = chefDescription;
    }
}