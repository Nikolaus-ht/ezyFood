package com.example.binusezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DrinksMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_menu);
    }

    public void goOrderMenu(View view){
        Intent intent = new Intent(this, OrderMenu.class);
        startActivity(intent);
    }

    public void goBackHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void goAirMineral(View view){
        Intent intent = new Intent(this, AirMineral.class);
        startActivity(intent);
    }

    public void goJusAlpukat(View view){
        Intent intent = new Intent(this, JusAlpukat.class);
        startActivity(intent);
    }

    public void goJusApel(View view){
        Intent intent = new Intent(this, JusApel.class);
        startActivity(intent);
    }

    public void goJusMangga(View view){
        Intent intent = new Intent(this, JusMangga.class);
        startActivity(intent);
    }
}
