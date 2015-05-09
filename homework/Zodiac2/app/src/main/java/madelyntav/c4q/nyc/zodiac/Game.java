package madelyntav.c4q.nyc.zodiac;

import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.text.BreakIterator;
import java.util.Random;


public class Game extends ActionBarActivity {

    private CountDownTimer countDownTimer;
    public TextView text;
    private final long startTime = 30000 * 1000;
    private final long interval = 1 * 1000;


    String birthdayMonth;
    int birthdayDay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void starTimer(){

        text = (TextView) this.findViewById(R.id.timer);
        countDownTimer = new MyCountDownTimer(startTime, interval);
        countDownTimer.start();
        text.setText(String.valueOf(startTime / 1000));

    }


    public void revealRandomDate(View v) {

        //starTimer();

        String months = "January February March April May June July August September October November December";
        String[] monthsArray = months.split(" ");
        String[] days = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};

        Random gen = new Random();
        // since we can access arrays via index, let's generate some random numbers for the indices
        birthdayDay = Integer.parseInt(days[gen.nextInt() % days.length]);
        birthdayMonth = monthsArray[gen.nextInt() % monthsArray.length];

        String randomDate = birthdayMonth + " " + birthdayDay;
        TextView dayView = (TextView) findViewById(R.id.dayView);
        dayView.setText(randomDate);
    }

    public void randomBirthday(View v) {

        EditText answer = (EditText) findViewById(R.id.answer);
        String answered = answer.getText().toString();
        TextView dayView = (TextView) findViewById(R.id.dayView);

        if ((birthdayMonth.equalsIgnoreCase("january") && (birthdayDay >= 21 && birthdayDay <= 31) || ((birthdayMonth.equalsIgnoreCase("february") && (birthdayDay >= 1 && birthdayDay <= 21))))) {
            if (answered.equalsIgnoreCase("aquarius")) {
                dayView.setText("CORRECT!");
            }

        } else if ((birthdayMonth.equalsIgnoreCase("february") && (birthdayDay >= 22 && birthdayDay <= 29) || ((birthdayMonth.equalsIgnoreCase("march") && (birthdayDay >= 1 && birthdayDay <= 20))))) {
            if (answered.equalsIgnoreCase("pisces")) {
                dayView.setText("CORRECT!");
            }

        } else if ((birthdayMonth.equalsIgnoreCase("march") && (birthdayDay >= 21 && birthdayDay <= 31) || ((birthdayMonth.equalsIgnoreCase("april") && (birthdayDay >= 1 && birthdayDay <= 19))))) {
            if (answered.equalsIgnoreCase("aries")) {
                dayView.setText("CORRECT!");
            }

        } else if ((birthdayMonth.equalsIgnoreCase("april") && (birthdayDay >= 20 && birthdayDay <= 30) || ((birthdayMonth.equalsIgnoreCase("may") && (birthdayDay >= 1 && birthdayDay <= 20))))) {
            if (answered.equalsIgnoreCase("taurus")) {
                dayView.setText("CORRECT!");
            }

        } else if ((birthdayMonth.equalsIgnoreCase("may") && (birthdayDay >= 21 && birthdayDay <= 31) || ((birthdayMonth.equalsIgnoreCase("june") && (birthdayDay >= 1 && birthdayDay <= 21))))) {
            if (answered.equalsIgnoreCase("gemini")) {
                dayView.setText("CORRECT!");
            }
        } else if ((birthdayMonth.equalsIgnoreCase("june") && (birthdayDay >= 22 && birthdayDay <= 30) || ((birthdayMonth.equalsIgnoreCase("july") && (birthdayDay >= 1 && birthdayDay <= 22))))) {
            if (answered.equalsIgnoreCase("cancer")) {
                dayView.setText("CORRECT!");
            }

        } else if ((birthdayMonth.equalsIgnoreCase("july") && (birthdayDay >= 23 && birthdayDay <= 31) || ((birthdayMonth.equalsIgnoreCase("august") && (birthdayDay >= 1 && birthdayDay <= 22))))) {
            if (answered.equalsIgnoreCase("leo")) {
                dayView.setText("CORRECT!");
            }

        } else if ((birthdayMonth.equalsIgnoreCase("august") && (birthdayDay >= 23 && birthdayDay <= 31) || ((birthdayMonth.equalsIgnoreCase("september") && (birthdayDay >= 1 && birthdayDay <= 22))))) {
            if (answered.equalsIgnoreCase("virgo")) {
                dayView.setText("CORRECT!");
            }

        } else if ((birthdayMonth.equalsIgnoreCase("september") && (birthdayDay >= 23 && birthdayDay <= 30) || ((birthdayMonth.equalsIgnoreCase("october") && (birthdayDay >= 1 && birthdayDay <= 23))))) {
            if (answered.equalsIgnoreCase("libra")) {
                dayView.setText("CORRECT!");
            }


        } else if ((birthdayMonth.equalsIgnoreCase("october") && (birthdayDay >= 24 && birthdayDay <= 31) || ((birthdayMonth.equalsIgnoreCase("november") && (birthdayDay >= 1 && birthdayDay <= 20))))) {
            if (answered.equalsIgnoreCase("scorio")) {
                dayView.setText("CORRECT!");
            }

        } else if ((birthdayMonth.equalsIgnoreCase("november") && (birthdayDay >= 21 && birthdayDay <= 30) || ((birthdayMonth.equalsIgnoreCase("december") && (birthdayDay >= 1 && birthdayDay <= 22))))) {
            if (answered.equalsIgnoreCase("sagittarius")) {
                dayView.setText("CORRECT!");
            }

        } else if ((birthdayMonth.equalsIgnoreCase("december") && (birthdayDay >= 23 && birthdayDay <= 31) || ((birthdayMonth.equalsIgnoreCase("january") && (birthdayDay >= 1 && birthdayDay <= 20))))) {
            if (answered.equalsIgnoreCase("capricorn")) {
                dayView.setText("CORRECT!");
            }

        } else
            dayView.setText("Wrong!");

    }

}

