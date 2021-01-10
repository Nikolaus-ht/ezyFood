package com.example.binusezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PayNow extends AppCompatActivity {

    TextView quantity, quantity1, quantity2, quantity3, quantity4, quantity5, totalPriceShow;
    String quantityNumber, quantityNumber1, quantityNumber2, quantityNumber3, quantityNumber4, quantityNumber5;

    int totalPrice= 0;
    int[] price = {100,100,150,150,200,150};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_now);
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

        for(int i=0;i < 6; i++){
            totalPrice += MenuStorage.menuOrderFile.get(i) * price[i];
        }

        totalPriceShow = (TextView)findViewById(R.id.totalPriceShow);
        totalPriceShow.setText(String.format("%d", totalPrice));
    }

    public void goReset(View view){
        totalPrice = 0;
        for(int i=0;i < 6; i++){
            MenuStorage.menuOrderFile.set(i, 0);
        }
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
