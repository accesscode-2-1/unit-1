package com.example.c4q_anthony_mcbride.ac_05_03;

import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends ActionBarActivity {

    private TextView theTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "onCreate");

        theTextView = (TextView) findViewById(R.id.the_textview);

        // This would only happen if the onCreate method was already called (Anytime after you initially start the application)
        if (savedInstanceState != null && savedInstanceState.containsKey("time")){
            // Calls on the outState key that was saved into the onSavedInstanceState method
            theTextView.setText(savedInstanceState.getString("time"));
        }
        else {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            String timeString = format.format(new Date());
            theTextView.setText(timeString);
        }
    }
    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MainActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("MainActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("MainActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("MainActivity", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("MainActivity", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("MainActivity", "onDestroy");
    }
// outState operates like a HashMap in that it uses k/v relationships
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("time", theTextView.getText().toString());
    }
}
