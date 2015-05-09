package com.example.joe.inthestars;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;

/**
 * Created by Jose on 5/8/15.
 */
public class SignsInfo extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){


    }

    //for each button clicked display the sign's information
    public static void buttonClicked(Button clicked){
    if (clicked.getId() == R.id.aries_button){
        // aries info
    }else if (clicked.getId() == R.id.taurus_button){
        //taurus info
    }else if(clicked.getId() == R.id.gemini_button){
        //gemini info
    }else if(clicked.getId() == R.id.cancer_button){
        //cancer info
    }else if(clicked.getId() == R.id.leo_button){
        //leo info
    }else if(clicked.getId() == R.id.virgo_button){
        //virgo info
    }else if(clicked.getId() == R.id.libra_button){
        //libra info
    }else if(clicked.getId() == R.id.scorpio_button){
        //scorpio info
    }else if(clicked.getId() == R.id.sag_button){
        // sag info
    }else if(clicked.getId() == R.id.cap_button){
        //capricorn info
    }else if(clicked.getId() == R.id.aquarius_button){
        //aquarius info
    }else if (clicked.getId() == R.id.pisces_button) {
        //pisces info
    }
}
}
