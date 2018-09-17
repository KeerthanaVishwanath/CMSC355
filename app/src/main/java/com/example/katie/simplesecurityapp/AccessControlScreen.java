package com.example.katie.simplesecurityapp;
//searched android documentation for click listener code and professor's code for reference regarding intents
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
//Toolbar import came with the creation of this activity page
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class AccessControlScreen extends AppCompatActivity {

    //The toolbar code came with the creation of this activity page
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_control_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //created a stringbuilder in order to store the numbers necessary to form the security code for retrieval when Submit is hit
        final StringBuilder code = new StringBuilder();
        //created a button called "1" for the number 1
        Button button1 = (Button) findViewById(R.id.NumberOne);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code.append("1");
                }
        });
        //created a button called "2" for the number 2
        Button button2 = (Button) findViewById(R.id.NumberTwo);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code.append("2");
            }
        });
        //created a button called "3" for the number 3
        Button button3 = (Button) findViewById(R.id.NumberThree);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code.append("3");
            }
        });
        //created a button called "4" for the number 4
        Button button4 = (Button) findViewById(R.id.NumberFour);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code.append("4");
            }
        });
        //created a button called "Submit" for the Submit action
        /*Submit button compares whether stored code from the stringbuilder is equal to the string which indicates the code
            If it is equal, the intent will switch back to the Welcome Screen (MainActivity) with the message of "The App is Unlocked."
            If it is not equal, the intent will switch back to the Welcome Screen (MainActivity) with the original message.
        */
        Button submit = (Button) findViewById(R.id.Submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
