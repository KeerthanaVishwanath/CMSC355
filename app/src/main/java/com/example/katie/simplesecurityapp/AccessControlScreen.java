package com.example.katie.simplesecurityapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AccessControlScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_control_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final StringBuilder code = new StringBuilder();
        Button button1 = (Button) findViewById(R.id.NumberOne);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyApp", "This is the message to pop up for 1.");
                Toast.makeText(getApplicationContext(), "You've pressed the number 1!", Toast.LENGTH_SHORT).show();
                code.append("1");
                }
        });
        Button button2 = (Button) findViewById(R.id.NumberTwo);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyApp", "This is the message to pop up for 2.");
                Toast.makeText(getApplicationContext(), "You've pressed the number 2!", Toast.LENGTH_SHORT).show();
                code.append("2");
            }
        });
        Button button3 = (Button) findViewById(R.id.NumberThree);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyApp", "This is the message to pop up for 3.");
                Toast.makeText(getApplicationContext(), "You've pressed the number 3!", Toast.LENGTH_SHORT).show();
                code.append("3");
            }
        });
        Button button4 = (Button) findViewById(R.id.NumberFour);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyApp", "This is the message to pop up for 4.");
                Toast.makeText(getApplicationContext(), "You've pressed the number 4!", Toast.LENGTH_SHORT).show();
                code.append("4");
            }
        });

        Button submit = (Button) findViewById(R.id.Submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyApp", "This is the message to pop up for submit.");
                Toast.makeText(getApplicationContext(), "Submit.", Toast.LENGTH_SHORT).show();
                if(code.toString().equals("1234")){
                    Intent acs2 = getIntent();
                    acs2 = new Intent();
                    acs2.putExtra("result", "The App is Unlocked.");
                    setResult(MainActivity.RESULT_OK, acs2);
                    finish();
                }
                else {
                    Intent acs3 = getIntent();
                    acs3 = new Intent();
                    acs3.putExtra("result", "Welcome to the App! The App is LOCKED!");
                    setResult(MainActivity.RESULT_CANCELED, acs3);
                    finish();

            }}
        });

}}
