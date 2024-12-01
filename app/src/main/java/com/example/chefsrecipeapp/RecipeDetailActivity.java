package com.example.chefsrecipeapp;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class RecipeDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);

        // Referências aos componentes
        ImageView recipeImage = findViewById(R.id.recipeImage);
        TextView recipeName = findViewById(R.id.recipeName);
        TextView userComment = findViewById(R.id.userComment);
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        TextView ingredientsList = findViewById(R.id.ingredientsList);

        // Dados simulados (substitua por dados reais)
        recipeName.setText("Spaghetti Carbonara");
        userComment.setText("User: \"Absolutely delicious!\"");
        ratingBar.setRating(4.5f);
        ingredientsList.setText("• Spaghetti\n• Eggs\n• Parmesan cheese\n• Pancetta\n• Black pepper");

        // Para a imagem, você pode carregar uma imagem real aqui
        recipeImage.setImageResource(R.drawable.sample_dish1);
    }
}