package com.example.navigation_manriqueticonaborja.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navigation_manriqueticonaborja.R;

public class AddMealsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_meals);

        Intent intent = getIntent();
        String title =  intent.getStringExtra("Title");
        EditText etTitle = findViewById(R.id.etTitle);
        etTitle.setText(title);

        String category = intent.getStringExtra("Category");
        EditText etCategory = findViewById(R.id.etCategory);
        etCategory.setText(category);

        String description = intent.getStringExtra("Description");
        EditText etDescription = findViewById(R.id.etDescription);
        etDescription.setText(description);

        ImageView imageViewBack = findViewById(R.id.btBack);
        imageViewBack.setOnClickListener(v ->{
            finish();
        });

    }
}
