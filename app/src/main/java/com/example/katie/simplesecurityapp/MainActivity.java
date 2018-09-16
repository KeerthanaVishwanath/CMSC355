package com.example.katie.simplesecurityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final int MY_REQUEST = 1;
    TextView submitMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.Unlock);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyApp","This is the message to pop up.");

                Toast.makeText(getApplicationContext(),"Hi!", Toast.LENGTH_SHORT).show();
                Intent acs = getIntent();
                acs = new Intent(MainActivity.this, AccessControlScreen.class);
                startActivityForResult(acs,1);
            }


        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode==RESULT_OK){
            submitMessage = (TextView) findViewById(R.id.message);
            submitMessage.setText("The App is Unlocked!");
        }
        else {
            submitMessage = (TextView) findViewById(R.id.message);
            submitMessage.setText("Welcome to the App! The App is Locked!");
        }

    }
}
