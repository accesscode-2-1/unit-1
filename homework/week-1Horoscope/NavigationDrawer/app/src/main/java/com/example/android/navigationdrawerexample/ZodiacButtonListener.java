package com.example.android.navigationdrawerexample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

/**
 * Created by July on 5/4/15.
 */
public class ZodiacButtonListener implements View.OnClickListener {

    String url;

    public ZodiacButtonListener(String url) {
        this.url = url;
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));

       // get an activity reference
       Activity act = MainActivity.getActivity();
        act.startActivity(i);
    }

        }
