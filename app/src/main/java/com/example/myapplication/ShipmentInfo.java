package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ShipmentInfo extends AppCompatActivity {

    public static String fName;
    public static String lName;
    public static String address;
    public static String city;
    public static String state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shipment_info);
    }

    public void switchScreens(View v) {
        EditText userFirstName = findViewById(R.id.userFirstName);
        EditText userLastName = findViewById(R.id.userLastName);
        EditText userAddress = findViewById(R.id.userAddress);
        EditText userCity = findViewById(R.id.userCity);
        EditText userState = findViewById(R.id.userState);

        fName = userFirstName.getText().toString();
        lName = userLastName.getText().toString();
        address = userAddress.getText().toString();
        city = userCity.getText().toString();
        state = userState.getText().toString();


        Intent intent = new Intent(ShipmentInfo.this, PaymentInfo.class);
        startActivity(intent);

    }


}