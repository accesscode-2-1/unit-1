package com.example.c4q_anthony_mcbride.ac_05_10;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by c4q-anthony-mcbride on 5/10/15.
 */
public class mOnClickListener implements View.OnClickListener {
    private int onClick;
    private TextView textView;

    public mOnClickListener(TextView textView){
        this.textView = textView;
        onClick(textView);
    }

    public int clickCount(TextView textView) {

        onClick = Integer.parseInt(textView.getText().toString());
        onClick++;
        return onClick;
    }
    @Override
    public void onClick(View view) {
        int count = clickCount(textView);
        textView.setText(String.valueOf(count));
    }
}
