package com.example.chefsrecipeapp;

import java.util.List;

public class ChefRecipes {
    private String recipeName;
    private String recipeDescription;
    private List<String> recipeIngredients; // Lista de ingredientes
    private String recipePreparation;

    // Construtor
    public ChefRecipes(String recipeName, String recipeDescription, List<String> recipeIngredients, String recipePreparation) {
        this.recipeName = recipeName;
        this.recipeDescription = recipeDescription;
        this.recipeIngredients = recipeIngredients;
        this.recipePreparation = recipePreparation;
    }

    // Getters e Setters
    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

    public List<String> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(List<String> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public String getRecipePreparation() {
        return recipePreparation;
    }

    public void setRecipePreparation(String recipePreparation) {
        this.recipePreparation = recipePreparation;
    }
}