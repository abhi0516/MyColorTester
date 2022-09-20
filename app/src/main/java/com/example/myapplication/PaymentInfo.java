package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PaymentInfo extends AppCompatActivity {

    public static String zip;
    public static String cvc;
    public static String cardNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_info);
    }

    public void switchScreens(View v) {
        EditText cardNum = findViewById(R.id.cardNumber);
        EditText cardCVC = findViewById(R.id.userCVC);
        EditText userZip = findViewById(R.id.userZIP);

        zip = userZip.getText().toString();
        cvc = cardCVC.getText().toString();
        cardNumber = cardNum.getText().toString();
        Intent intent = new Intent(PaymentInfo.this, ReviewInfoScreen.class);
        startActivity(intent);
    }



}