package com.example.accesscode.myphone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*
Import the MyPhone project.

In MainActivity, add explicit intents to start the DialerActivity and EmailActivity. Add the Activities to the AndroidManifest.xml.

In DialerActivity, add an implicit intent to open up the phone dialer when the user wants to make a call.

In EmailActivity, add an implicit intent to open up an email activity and send an email to you (yes, you - put your email address as the recipient!).
 */

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
                /*
                    Use Explicit Intent to start DialerActivity here.
                 */
                Intent dialer = new Intent(getApplicationContext(), DialerActivity.class);
                startActivity(dialer);
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
                Intent Email = new Intent(getApplicationContext(), EmailActivity.class);
                startActivity(Email);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
