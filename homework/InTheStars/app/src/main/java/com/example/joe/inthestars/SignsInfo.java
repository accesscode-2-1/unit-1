package com.example.joe.inthestars;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jose on 5/8/15.
 */
public class SignsInfo extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){


    }

    //for each button clicked display the sign's information
    public static String buttonClicked(Button clicked){
    if (clicked.getId() == R.id.aries_button){
        // aries info
        return String.valueOf(R.string.ariesInfo);
    }else if (clicked.getId() == R.id.taurus_button){
        //taurus info
        return String.valueOf(R.string.taurusInfo);
    }else if(clicked.getId() == R.id.gemini_button){
        //gemini info
        return String.valueOf(R.string.geminiInfo);
    }else if(clicked.getId() == R.id.cancer_button){
        //cancer info
        return String.valueOf(R.string.cancerInfo);
    }else if(clicked.getId() == R.id.leo_button){
        //leo info
        return String.valueOf(R.string.leoInfo);
    }else if(clicked.getId() == R.id.virgo_button){
        //virgo info
        return String.valueOf(R.string.virgoInfo);
    }else if(clicked.getId() == R.id.libra_button){
        //libra info
        return String.valueOf(R.string.libraInfo);
    }else if(clicked.getId() == R.id.scorpio_button){
        //scorpio info
        return String.valueOf(R.string.scorpioInfo);
    }else if(clicked.getId() == R.id.sag_button){
        // sag info
        return String.valueOf(R.string.sagInfo);
    }else if(clicked.getId() == R.id.cap_button){
        //capricorn info
        return String.valueOf(R.string.capricornInfo);
    }else if(clicked.getId() == R.id.aquarius_button){
        //aquarius info
        return String.valueOf(R.string.aquariusInfo);
    }else if (clicked.getId() == R.id.pisces_button) {
        //pisces info
        return String.valueOf(R.string.piscesInfo);
    }else
        return "UH OH";
}
}
