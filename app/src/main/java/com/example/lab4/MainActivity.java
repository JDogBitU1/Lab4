package com.example.lab4;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPref;
    EditText userEmail;
    EditText userPassword;
    Button LoginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sharedPref = getSharedPreferences("Shares", Context.MODE_PRIVATE);

        userEmail = (EditText)findViewById(R.id.typeEmail);
        userPassword = (EditText)findViewById(R.id.typePassword);
        LoginButton = (Button)findViewById(R.id.LoginButton); //<-- Initialize here

        LoginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);

                String data1 = "jason.tomkins@gmail.com";
                Intent passData_intent = new Intent(MainActivity.this, ProfileActivity.class);
                passData_intent.putExtra("firstData", data1);
                startActivity(passData_intent);
            }
        });
    }
}

