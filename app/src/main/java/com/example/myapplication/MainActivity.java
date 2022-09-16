package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchScreens(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }

//    EditText userAddress = findViewById(R.id.userAddress);
//    EditText userFirstName = findViewById(R.id.userFirstName);
//    EditText userLastName = findViewById(R.id.userLastName);
//    EditText userCity = findViewById(R.id.userCity);
//    EditText userState = findViewById(R.id.userState);
//    EditText userZip = findViewById(R.id.userZIP);
//
//    public void displayInfo(View view) {
        // I want to display all of user's personal info and billing info on second screen(billing screen)
        // Program should switch screens once CONTINUE button is pressed

        //The textview displaying all info SHOULD NOT have text
        // concatenate all info in this method
        //add info to string
        //set texview = to that string

}