package com.example.binusezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Pretzel extends AppCompatActivity {

    EditText quantity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pretzel);
        quantity = (EditText)findViewById(R.id.pretzelQuantity);
    }

    public void goBack(View view){
        Intent intent = new Intent(this, SnacksMenu.class);
        startActivity(intent);
    }

    public void goBuy(View view){
        String quantityString = quantity.getText().toString();
        int quantityInt = Integer.parseInt(quantityString);
        MenuStorage.menuOrderFile.set(5, MenuStorage.menuOrderFile.get(5) + quantityInt);
        Intent intent = new Intent(this, SnacksMenu.class);
        startActivity(intent);
    }

}
