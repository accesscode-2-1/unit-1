package com.example.android.navigationdrawerexample;

import android.os.CountDownTimer;
import android.widget.TextView;

/**
 * Created by July on 5/6/15.
 */
public class MyTimer2 extends CountDownTimer{

    private TextView mTextField;

    public MyTimer2(long startTime, long interval, TextView mTextField)
    {
        super(startTime, interval);
        this.mTextField = mTextField;
    }

    @Override
    public void onTick(long millisUntilFinished) {
        mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
    }

    @Override
    public void onFinish() {
        mTextField.setText("done!");


    }
}
