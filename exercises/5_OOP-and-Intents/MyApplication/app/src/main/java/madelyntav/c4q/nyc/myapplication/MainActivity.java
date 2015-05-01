package madelyntav.c4q.nyc.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myFirstMethod(View v){
        View myTextView= findViewById(R.id.myFirstTextView);
        myTextView.setVisibility(View.VISIBLE);

    }


}
