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
        TextView resultScreen = findViewById(R.id.displayAllInfoScreen);

        String firstName = ShipmentInfo.fName;
        String lastName = ShipmentInfo.lName;
        String address = ShipmentInfo.address;
        String city = ShipmentInfo.city;
        String state = ShipmentInfo.state;
        String zip = PaymentInfo.zip;
        String cardNumber = PaymentInfo.cardNumber;
        String cardCVC = PaymentInfo.cvc;
        String cardExpirationDate = PaymentInfo.cardExpiration;

        resultScreen.setText(firstName + " " + lastName + "\n\n" + address + "\n\n" + city + ", "
                + state + " " + zip + "\n\nCard Number: " + cardNumber + "\n\n" + "Security Code: "
                + cardCVC + "\n\n" + "Card Expiration Date: " + cardExpirationDate);
    }
}