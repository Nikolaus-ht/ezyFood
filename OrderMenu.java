package com.example.binusezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OrderMenu extends AppCompatActivity {

    TextView quantity, quantity1, quantity2, quantity3, quantity4, quantity5, totalPriceShow;
    String quantityNumber, quantityNumber1, quantityNumber2, quantityNumber3, quantityNumber4, quantityNumber5;

    Button buttonRemove;

    int totalPrice= 0;
    int[] price = {100,100,150,150,200,150};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_menu);
        quantity = (TextView) findViewById(R.id.quantityList);
        quantityNumber = MenuStorage.menuOrderFile.get(0).toString();
        quantity.setText(quantityNumber);

        quantity1 = (TextView) findViewById(R.id.quantityList1);
        quantityNumber1 = MenuStorage.menuOrderFile.get(1).toString();
        quantity1.setText(quantityNumber1);

        quantity2 = (TextView) findViewById(R.id.quantityList2);
        quantityNumber2 = MenuStorage.menuOrderFile.get(2).toString();
        quantity2.setText(quantityNumber2);

        quantity3 = (TextView) findViewById(R.id.quantityList3);
        quantityNumber3 = MenuStorage.menuOrderFile.get(3).toString();
        quantity3.setText(quantityNumber3);

        quantity4 = (TextView) findViewById(R.id.quantityList4);
        quantityNumber4 = MenuStorage.menuOrderFile.get(4).toString();
        quantity4.setText(quantityNumber4);

        quantity5 = (TextView) findViewById(R.id.quantityList5);
        quantityNumber5 = MenuStorage.menuOrderFile.get(5).toString();
        quantity5.setText(quantityNumber5);

        buttonRemove = (Button)findViewById(R.id.buttonReduce);

        for(int i=0;i < 6; i++){
            totalPrice += MenuStorage.menuOrderFile.get(i) * price[i];
        }

        totalPriceShow = (TextView)findViewById(R.id.totalPriceShow);
        totalPriceShow.setText(String.format("%d", totalPrice));
    }

    public void goPayNow(View view){
        Intent intent = new Intent(this, PayNow.class);
        startActivity(intent);
    }

    public void goReduceAirMineral(View view){
        if(MenuStorage.menuOrderFile.get(0) > 0) {
            MenuStorage.menuOrderFile.set(0, MenuStorage.menuOrderFile.get(0) - 1);
            quantityNumber = MenuStorage.menuOrderFile.get(0).toString();
            quantity.setText(quantityNumber);
            totalPrice-= 100;
            totalPriceShow.setText(String.format("%d", totalPrice));
        }
    }

    public void goReduceJusAlpukat(View view){
        if(MenuStorage.menuOrderFile.get(1) > 0) {
            MenuStorage.menuOrderFile.set(1, MenuStorage.menuOrderFile.get(1) - 1);
            quantityNumber1 = MenuStorage.menuOrderFile.get(1).toString();
            quantity1.setText(quantityNumber1);
            totalPrice-= 100;
            totalPriceShow.setText(String.format("%d", totalPrice));
        }
    }

    public void goReduceJusApel(View view){
        if(MenuStorage.menuOrderFile.get(2) > 0) {
            MenuStorage.menuOrderFile.set(2, MenuStorage.menuOrderFile.get(2) - 1);
            quantityNumber2 = MenuStorage.menuOrderFile.get(2).toString();
            quantity2.setText(quantityNumber2);
            totalPrice-= 150;
            totalPriceShow.setText(String.format("%d", totalPrice));
        }
    }

    public void goReduceJusMangga(View view){
        if(MenuStorage.menuOrderFile.get(3) > 0) {
            MenuStorage.menuOrderFile.set(3, MenuStorage.menuOrderFile.get(3) - 1);
            quantityNumber3 = MenuStorage.menuOrderFile.get(3).toString();
            quantity3.setText(quantityNumber3);
            totalPrice-= 150;
            totalPriceShow.setText(String.format("%d", totalPrice));
        }
    }

    public void goReduceChicken(View view){
        if(MenuStorage.menuOrderFile.get(4) > 0) {
            MenuStorage.menuOrderFile.set(4, MenuStorage.menuOrderFile.get(4) - 1);
            quantityNumber4 = MenuStorage.menuOrderFile.get(4).toString();
            quantity4.setText(quantityNumber4);
            totalPrice-= 200;
            totalPriceShow.setText(String.format("%d", totalPrice));
        }
    }

    public void goReducePretzel(View view){
        if(MenuStorage.menuOrderFile.get(5) > 0) {
            MenuStorage.menuOrderFile.set(5, MenuStorage.menuOrderFile.get(5) - 1);
            quantityNumber5 = MenuStorage.menuOrderFile.get(5).toString();
            quantity5.setText(quantityNumber5);
            totalPrice-= 150;
            totalPriceShow.setText(String.format("%d", totalPrice));
        }
    }
}
