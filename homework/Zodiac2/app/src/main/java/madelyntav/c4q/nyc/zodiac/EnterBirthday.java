package madelyntav.c4q.nyc.zodiac;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.os.CountDownTimer;

public class EnterBirthday extends ActionBarActivity {


    String birthdayMonth;
    int birthdayDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_birthday);

    }
        @TargetApi(Build.VERSION_CODES.LOLLIPOP)

        public void chooseSign(View v){

            EditText nbirthdayMonth= (EditText) findViewById(R.id.editMonth);
            birthdayMonth=nbirthdayMonth.getText().toString();

            EditText nbirthdayDay=(EditText) findViewById(R.id.editDay);
            birthdayDay = Integer.parseInt(nbirthdayDay.getText().toString());

            Resources res = getResources();
            ImageView imageView=(ImageView) findViewById(R.id.imageView);


        if ((birthdayMonth.equalsIgnoreCase("january") && (birthdayDay >= 21 && birthdayDay <= 31) || ((birthdayMonth.equalsIgnoreCase("february") && (birthdayDay >= 1 && birthdayDay <= 21))))) {
            Drawable draw = getDrawable(R.drawable.aquarius);
            imageView.setImageDrawable(draw);

        } else if ((birthdayMonth.equalsIgnoreCase("february") && (birthdayDay >= 22 && birthdayDay <= 29) || ((birthdayMonth.equalsIgnoreCase("march") && (birthdayDay >= 1 && birthdayDay <= 20))))) {
            Drawable draw = getDrawable(R.drawable.pisces);
            imageView.setImageDrawable(draw);
        } else if ((birthdayMonth.equalsIgnoreCase("march") && (birthdayDay >= 21 && birthdayDay <= 31) || ((birthdayMonth.equalsIgnoreCase("april") && (birthdayDay >= 1 && birthdayDay <= 19))))) {
            Drawable draw = getDrawable(R.drawable.aries);
            imageView.setImageDrawable(draw);
        } else if ((birthdayMonth.equalsIgnoreCase("april") && (birthdayDay >= 20 && birthdayDay <= 30) || ((birthdayMonth.equalsIgnoreCase("may") && (birthdayDay >= 1 && birthdayDay <= 20))))) {
            Drawable draw = getDrawable(R.drawable.taurus);
            imageView.setImageDrawable(draw);
        }else if ((birthdayMonth.equalsIgnoreCase("may") && (birthdayDay >= 21 && birthdayDay <= 31) || ((birthdayMonth.equalsIgnoreCase("june") && (birthdayDay >= 1 && birthdayDay <= 21))))) {
            Drawable draw = getDrawable(R.drawable.gemini);
            imageView.setImageDrawable(draw);
        }else if ((birthdayMonth.equalsIgnoreCase("june") && (birthdayDay >= 22 && birthdayDay <= 30) || ((birthdayMonth.equalsIgnoreCase("july") && (birthdayDay >= 1 && birthdayDay <= 22))))) {
            Drawable draw = getDrawable(R.drawable.cancer);
            imageView.setImageDrawable(draw);
        }else if ((birthdayMonth.equalsIgnoreCase("july") && (birthdayDay >= 23 && birthdayDay <= 31) || ((birthdayMonth.equalsIgnoreCase("august") && (birthdayDay >= 1 && birthdayDay <= 22))))) {
            Drawable draw = getDrawable(R.drawable.leo);
            imageView.setImageDrawable(draw);
        }else if ((birthdayMonth.equalsIgnoreCase("august") && (birthdayDay >= 23 && birthdayDay <= 31) || ((birthdayMonth.equalsIgnoreCase("september") && (birthdayDay >= 1 && birthdayDay <= 22))))) {
            Drawable draw = getDrawable(R.drawable.virgo);
            imageView.setImageDrawable(draw);
        }else if ((birthdayMonth.equalsIgnoreCase("september") && (birthdayDay >= 23 && birthdayDay <= 30) || ((birthdayMonth.equalsIgnoreCase("october") && (birthdayDay >= 1 && birthdayDay <= 23))))) {
            Drawable draw = getDrawable(R.drawable.libra);
            imageView.setImageDrawable(draw);
        }else if ((birthdayMonth.equalsIgnoreCase("october") && (birthdayDay >= 24 && birthdayDay <= 31) || ((birthdayMonth.equalsIgnoreCase("november") && (birthdayDay >= 1 && birthdayDay <= 20))))) {
            Drawable draw = getDrawable(R.drawable.scorpio);
            imageView.setImageDrawable(draw);
        }else if ((birthdayMonth.equalsIgnoreCase("november") && (birthdayDay >= 21 && birthdayDay <= 30) || ((birthdayMonth.equalsIgnoreCase("december") && (birthdayDay >= 1 && birthdayDay <= 22))))) {
            Drawable draw = getDrawable(R.drawable.sagittarius);
            imageView.setImageDrawable(draw);
        }else if ((birthdayMonth.equalsIgnoreCase("december") && (birthdayDay >= 23 && birthdayDay <= 31) || ((birthdayMonth.equalsIgnoreCase("january") && (birthdayDay >= 1 && birthdayDay <= 20))))) {
            Drawable draw = getDrawable(R.drawable.capricorn);
            imageView.setImageDrawable(draw);
        } else {
            Drawable draw = getDrawable(R.drawable.alien);
            imageView.setImageDrawable(draw);
        }

    }
}



