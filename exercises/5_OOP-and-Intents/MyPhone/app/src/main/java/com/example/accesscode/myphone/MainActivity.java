package com.example.accesscode.myphone;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* DialerActivity */
        Button dialerButton = (Button) findViewById(R.id.dialer_button);
        dialerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Dialer clicked", Toast.LENGTH_SHORT).show();

                Intent dialerActivity = new Intent(MainActivity.this, DialerActivity.class);
                startActivity(dialerActivity);


            }
        });
        /* EmailActivity */
        Button emailButton = (Button) findViewById(R.id.email_button);
        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Email clicked", Toast.LENGTH_SHORT).show();
                 /*
                    Use Explicit Intent to start EmailActivity here.
                 */
                Intent emailActivity = new Intent(MainActivity.this, EmailActivity.class);
                startActivity(emailActivity);

            }
        });
    }


}