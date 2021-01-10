package com.example.binusezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FoodsMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods_menu);
    }

    public void goOrderMenu(View view){
        Intent intent = new Intent(this, OrderMenu.class);
        startActivity(intent);
    }

    public void goBackHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void goChicken(View view){
        Intent intent = new Intent(this, Chicken.class);
        startActivity(intent);
    }
}
