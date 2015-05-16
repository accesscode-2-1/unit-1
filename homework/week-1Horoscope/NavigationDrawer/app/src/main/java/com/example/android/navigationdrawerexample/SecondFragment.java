package com.example.android.navigationdrawerexample;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Yuliya Kaleda on 5/4/15.
 */
public class SecondFragment extends Fragment {

    DatePicker pickerDate;
    TextView info;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_second, container, false);

        info = (TextView) rootView.findViewById(R.id.test);
        pickerDate = (DatePicker) rootView.findViewById(R.id.datePicker);

        Calendar today = Calendar.getInstance();

        //set a DatePicker to the current day
        pickerDate.init(
                today.get(Calendar.YEAR),
                today.get(Calendar.MONTH),
                today.get(Calendar.DAY_OF_MONTH),
                new DatePicker.OnDateChangedListener() {

                    @Override
                    public void onDateChanged(DatePicker view,
                                              int year, int monthOfYear, int dayOfMonth) {

                        info.setText("Your sign is " + MainActivity.displaySign(monthOfYear, dayOfMonth));

                    }
                });

        return rootView;
    }

}
