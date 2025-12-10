package com.example.navigation_manriqueticonaborja;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.navigation_manriqueticonaborja.Activities.AddMealsActivity;
import com.example.navigation_manriqueticonaborja.Activities.DeleteMealActivity;
import com.example.navigation_manriqueticonaborja.Activities.ListMealActivity;
import com.example.navigation_manriqueticonaborja.Activities.SearchMealActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Boton agregar Meal
        Button btAddMeal = findViewById(R.id.btAddmeals);
        btAddMeal.setOnClickListener(v -> {
            Intent intentStart = new Intent(MainActivity.this, AddMealsActivity.class);
            intentStart.putExtra("Title", "Paella Valenciana");
            intentStart.putExtra("Category", "Comida Española");
            intentStart.putExtra("Description", "Arroz tradicional español");
            startActivity(intentStart);
        });

        Button btDeleteMeal = findViewById(R.id.btDeletemeals);
        btDeleteMeal.setOnClickListener(v ->{
            startActivity(new Intent(this, DeleteMealActivity.class));
        });

        Button btListMeal = findViewById(R.id.btListallmeals);
        btListMeal.setOnClickListener(v ->{
            startActivity(new Intent(this, ListMealActivity.class));
        });

        Button btSearchMeal = findViewById(R.id.btListmealsbytitle);
        btSearchMeal.setOnClickListener(v ->{
            startActivity(new Intent(this, SearchMealActivity.class));
        });
    }
}

