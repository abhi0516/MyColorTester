package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ReviewInfoScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_info_screen);
    }

    public void recalledName(View view){
//        EditText userFirstName = findViewById(R.id.userFirstName);
//        EditText userLastName = findViewById(R.id.userLastName);
//        EditText userAddress = findViewById(R.id.userAddress);
//        EditText userCity = findViewById(R.id.userCity);
//        EditText userState = findViewById(R.id.userState);

//        EditText cardNum = findViewById(R.id.cardNumber);
//        EditText cardCVC = findViewById(R.id.userCVC);
//        EditText userZip = findViewById(R.id.userZIP);
        TextView resultScreen = findViewById(R.id.displayAllInfoScreen);

        String firstName = ShipmentInfo.fName;
        String lastName = ShipmentInfo.lName;
        String address = ShipmentInfo.address;
        String city = ShipmentInfo.city;
        String state = ShipmentInfo.state;
        String zip = PaymentInfo.zip;
        String cardNumber = PaymentInfo.cardNumber;
        String cardCVC = PaymentInfo.cvc;

        resultScreen.setText(firstName + " " + lastName + "\n" + address + " " + city + " " + state + ", " );
        //resultScreen.setText(firstName);
    }








}