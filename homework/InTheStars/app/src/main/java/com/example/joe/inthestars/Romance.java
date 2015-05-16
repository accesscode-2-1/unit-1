package com.example.joe.inthestars;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.widget.EditText;

/**
 * Created by Jose on 5/8/15.
 */
public class Romance extends ActionBarActivity {
    private EditText enterBday;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.romance);

        enterBday = (EditText) findViewById(R.id.enter_bday);

    }
}
