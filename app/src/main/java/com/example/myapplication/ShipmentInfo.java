package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ShipmentInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shipment_info);
    }

    public void switchScreens(View v) {
        Intent intent = new Intent(ShipmentInfo.this, PaymentInfo.class);
        startActivity(intent);

    }


}