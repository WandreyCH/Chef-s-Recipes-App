package com.example.chefsrecipeapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RatingBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HomeScreenActivity extends AppCompatActivity {

    private RecyclerView recipeRecyclerView;
    private RecipeAdapter adapter;  // O Adapter que você criará

    EditText searchBar;
    TextView topRatedTitle;
    RatingBar ratingBar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        // Inicialize componentes (pode ser útil para lógica futura)
         searchBar = findViewById(R.id.searchBar);
         topRatedTitle = findViewById(R.id.topRatedTitle);
         ratingBar1 = findViewById(R.id.ratingBar1);

        recipeRecyclerView = findViewById(R.id.recipeRecyclerView);
        recipeRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Simulando dados (serão substituídos por dados reais do backend futuramente)
        List<ChefRecipes> topRatedRecipes = new ArrayList<>();
        topRatedRecipes.add(new ChefRecipes("Pasta Carbonara", 4.8f, R.drawable.chef));
        topRatedRecipes.add(new ChefRecipes("Sushi Deluxe", 4.7f, R.drawable.chef));
        topRatedRecipes.add(new ChefRecipes("Chocolate Cake", 4.9f, R.drawable.chef));
        topRatedRecipes.add(new ChefRecipes("Grilled Salmon", 4.6f, R.drawable.chef));

        // Configura o Adapter
        adapter = new RecipeAdapter(topRatedRecipes);
        recipeRecyclerView.setAdapter(adapter);
    }
}