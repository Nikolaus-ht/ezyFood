package com.example.binusezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class JusAlpukat extends AppCompatActivity {

    EditText quantity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jus_alpukat);
        quantity = (EditText)findViewById(R.id.jusAlpukatQuantity);
    }

    public void goBack(View view){
        Intent intent = new Intent(this, DrinksMenu.class);
        startActivity(intent);
    }

    public void goBuy(View view){
        String quantityString = quantity.getText().toString();
        int quantityInt = Integer.parseInt(quantityString);
        MenuStorage.menuOrderFile.set(1, MenuStorage.menuOrderFile.get(1) + quantityInt);
        Intent intent = new Intent(this, DrinksMenu.class);
        startActivity(intent);
    }

}
