package com.example.chefsrecipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ChefProfileActivity extends AppCompatActivity {

    private ImageView chefImage;
    private EditText chefDescription;
    private Button saveProfileButton, createRecipeButton;
    private FirebaseAuth mAuth;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef_profile);

        mAuth = FirebaseAuth.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference("Users");

        chefImage = findViewById(R.id.chefImage);
        chefDescription = findViewById(R.id.chefDescription);
        saveProfileButton = findViewById(R.id.saveProfileButton);
        createRecipeButton = findViewById(R.id.createRecipeButton);

        saveProfileButton.setOnClickListener(v -> saveProfile());

        createRecipeButton.setOnClickListener(v -> {
            Intent intent = new Intent(ChefProfileActivity.this, CreateRecipeActivity.class);
            startActivity(intent);
        });
    }

    private void saveProfile() {
        String description = chefDescription.getText().toString().trim();

        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            String userId = currentUser.getUid();

            // Save the chef's description and profile image URL (if needed)
            ChefProfile chefProfile = new ChefProfile(description);
            databaseReference.child(userId).child("chefProfile").setValue(chefProfile)
                    .addOnCompleteListener(task -> {
                        if (task.isSuccessful()) {
                            Toast.makeText(ChefProfileActivity.this, "Profile Updated", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(ChefProfileActivity.this, "Failed to Update Profile", Toast.LENGTH_SHORT).show();
                        }
                    });
        }
    }
}