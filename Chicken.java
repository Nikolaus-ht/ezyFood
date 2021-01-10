package com.example.binusezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Chicken extends AppCompatActivity {

    EditText quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);
        quantity = (EditText)findViewById(R.id.chickenQuantity);
    }

    public void goBack(View view){
        Intent intent = new Intent(this, FoodsMenu.class);
        startActivity(intent);
    }

    public void goBuy(View view){
        String quantityString = quantity.getText().toString();
        int quantityInt = Integer.parseInt(quantityString);
        MenuStorage.menuOrderFile.set(4, MenuStorage.menuOrderFile.get(4) + quantityInt);
        Intent intent = new Intent(this, FoodsMenu.class);
        startActivity(intent);
    }

}
