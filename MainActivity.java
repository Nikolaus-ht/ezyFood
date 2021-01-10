package com.example.binusezyfood;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goDrinkMenu(View view){
        Intent intent = new Intent(this, DrinksMenu.class);
        startActivity(intent);
    }

    public void goFoodMenu(View view){
        Intent intent = new Intent(this, FoodsMenu.class);
        startActivity(intent);
    }

    public void goSnackMenu(View view){
        Intent intent = new Intent(this, SnacksMenu.class);
        startActivity(intent);
    }

    public void goTopUpMenu(View view){
        Intent intent = new Intent(this, TopUpMenu.class);
        startActivity(intent);
    }

    public void goOrderMenu(View view){
        Intent intent = new Intent(this, OrderMenu.class);
        startActivity(intent);
    }
}
