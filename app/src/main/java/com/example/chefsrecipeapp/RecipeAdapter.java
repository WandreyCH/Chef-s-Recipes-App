package com.example.chefsrecipeapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder> {

    private List<ChefRecipes> recipeList;

    public RecipeAdapter(List<ChefRecipes> recipeList) {
        this.recipeList = recipeList;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_item, parent, false);
        return new RecipeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        ChefRecipes recipe = recipeList.get(position);
        holder.recipeName.setText(recipe.getRecipeName());
        holder.recipeDescription.setText(recipe.getRecipeDescription());

        // Exibindo os ingredientes como uma string separada por vírgulas
        StringBuilder ingredients = new StringBuilder();
        for (String ingredient : recipe.getRecipeIngredients()) {
            ingredients.append(ingredient).append(", ");
        }
        // Remover a vírgula extra no final
        if (ingredients.length() > 0) {
            ingredients.setLength(ingredients.length() - 2);
        }
        holder.recipeIngredients.setText(ingredients.toString());

        // Para a imagem da receita (se disponível, você pode configurar de acordo com seu design)
        // Exemplo simples de como configurar uma imagem:
        holder.recipeImage.setImageResource(R.drawable.chef);  // Usar uma imagem padrão ou personalizar conforme necessário
    }

    @Override
    public int getItemCount() {
        return recipeList.size();
    }

    public static class RecipeViewHolder extends RecyclerView.ViewHolder {
        ImageView recipeImage;
        TextView recipeName, recipeDescription, recipeIngredients;

        public RecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            recipeImage = itemView.findViewById(R.id.recipeImage);
            recipeName = itemView.findViewById(R.id.recipeName);
            recipeDescription = itemView.findViewById(R.id.recipeDescription);
            recipeIngredients = itemView.findViewById(R.id.recipeIngredients);
        }
    }
}