package com.example.binusezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AirMineral extends AppCompatActivity {

    EditText quantity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air_mineral);
        quantity = (EditText)findViewById(R.id.airMineralQuantity);
    }

    public void goBack(View view){
        Intent intent = new Intent(this, DrinksMenu.class);
        startActivity(intent);
    }

    public void goBuy(View view){
        String quantityString = quantity.getText().toString();
        int quantityInt = Integer.parseInt(quantityString);
        MenuStorage.menuOrderFile.set(0, MenuStorage.menuOrderFile.get(0) + quantityInt);
        Intent intent = new Intent(this, DrinksMenu.class);
        startActivity(intent);
    }

}
