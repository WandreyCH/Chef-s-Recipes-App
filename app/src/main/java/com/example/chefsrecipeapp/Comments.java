package com.example.chefsrecipeapp;

public class Comments {
    private String comment;
    private String name;
    private String role;

    // Construtor padrão
    public Comments() {
    }

    // Construtor com parâmetros
    public Comments(String comment, String userName, String userRole) {
        this.comment = comment;
        this.name = userName;
        this.role = userRole;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}