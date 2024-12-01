package com.example.chefsrecipeapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RatingBar;

public class HomeScreenActivity extends AppCompatActivity {

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

        // Configurações ou dados dinâmicos podem ser carregados aqui
    }
}