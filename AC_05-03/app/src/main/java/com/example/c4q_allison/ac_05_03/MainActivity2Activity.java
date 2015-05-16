package com.example.c4q_allison.ac_05_03;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;


public class MainActivity2Activity extends Activity {

    EditText etName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
        Log.e ("SW", "OnCreate");
        etName = ((EditText)this.findViewById(R.id.the_edittext));
        etName.setText("Time to go home!");
    }
    @Override
    protected void onStart(){
        Log.d("MainActivity", "onStart");
        super.onStart();

    }
    @Override
    protected void onRestart(){
        Log.d("MainActivity", "onRestart");
        super.onRestart();

    }
    @Override
    protected void onResume(){
        Log.d("MainActivity", "onResume");
        super.onResume();

    }
    @Override
    protected void onPause(){
        Log.d("MainActivity", "onPause");
        super.onPause();

    }
    @Override
    protected void onStop(){
        Log.d("MainActivity", "onStop");
        super.onStop();

    }
    @Override
    protected void onDestroy(){
        Log.d("MainActivity", "onDestroy");
        super.onDestroy();

    }





}
