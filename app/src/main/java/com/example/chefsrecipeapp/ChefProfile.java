package com.example.chefsrecipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ChefProfileActivity extends AppCompatActivity {

    private ImageView chefImage;
    private TextView chefName, chefDescription;
    private Button createRecipeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef_profile);

        // Inicializar componentes
        chefImage = findViewById(R.id.chefImage);
        chefName = findViewById(R.id.chefName);
        chefDescription = findViewById(R.id.chefDescription);
        createRecipeButton = findViewById(R.id.createRecipeButton);

        // Carregar dados do Firebase
        loadChefData();

        // Configurar botão para criar receita
        createRecipeButton.setOnClickListener(v -> {
            Intent intent = new Intent(ChefProfileActivity.this, CreateRecipeActivity.class);
            startActivity(intent);
        });
    }

    private void loadChefData() {
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        if (currentUser != null) {
            String userId = currentUser.getUid();
            DatabaseReference userRef = FirebaseDatabase.getInstance().getReference("Users").child(userId);

            userRef.get().addOnCompleteListener(task -> {
                if (task.isSuccessful() && task.getResult().exists()) {
                    String name = task.getResult().child("name").getValue(String.class);
                    String description = task.getResult().child("description").getValue(String.class);

                    chefName.setText(name != null ? name : "Unknown Chef");
                    chefDescription.setText(description != null ? description : "No background provided.");
                }
            });
        }
    }
}