package com.example.chefsrecipeapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RatingBar;

public class RecipesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        // Inicialize componentes (pode ser útil para lógica futura)
        EditText searchBar = findViewById(R.id.searchBar);
        TextView topRatedTitle = findViewById(R.id.topRatedTitle);
        RatingBar ratingBar1 = findViewById(R.id.ratingBar1);

        // Configurações ou dados dinâmicos podem ser carregados aqui
    }
}