package com.example.navigation_manriqueticonaborja.Activities;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navigation_manriqueticonaborja.R;

public class ListMealActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_meals);




        ImageView imageViewBack = findViewById(R.id.btBack);
        imageViewBack.setOnClickListener(v ->{
            finish();
        });
    }
}
