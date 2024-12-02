package com.example.chefsrecipeapp;

public class Comments {
    public String comment;
    public String userName;
    public String userRole;

    // Construtor padrão
    public Comments() {
    }

    // Construtor com parâmetros
    public Comments(String comment, String userName, String userRole) {
        this.comment = comment;
        this.userName = userName;
        this.userRole = userRole;
    }
}