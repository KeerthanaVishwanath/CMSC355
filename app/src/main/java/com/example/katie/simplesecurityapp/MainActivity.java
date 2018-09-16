package com.example.katie.simplesecurityapp;
//searched android documentation for click listener code and professor's code for reference regarding intents
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private final int MY_REQUEST = 1;
    //will display the message on the Welcome Screen
    TextView submitMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creates a button to unlock and access the AccessControlScreen
        Button button = (Button) findViewById(R.id.Unlock);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goes from the MainActivity--the welcome screen, to the AccessControlScreen activity
                Intent acs = getIntent();
                acs = new Intent(MainActivity.this, AccessControlScreen.class);
                startActivityForResult(acs,1);
            }


        });
    }
    //Displays the appropriate message depending on the result
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
