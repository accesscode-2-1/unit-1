package jorgereina1986.c4q.nyc.horoscope;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Date;


public class SearchActivity extends ActionBarActivity {

    DatePicker getDate;
    Button enter;
    int month;
    int day;
    String sign;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        getDate = (DatePicker) findViewById(R.id.datePicker);
        enter = (Button) findViewById(R.id.enter);
        result = (TextView) findViewById(R.id.yourSign);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                month = getDate.getMonth()+1;
                day = getDate.getDayOfMonth();
                sign = findSign(month, day);
                result.setText(sign);
            }
        });

    }

    public static String findSign(int month, int day) {

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return "Aries";
        else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return "Taurus";
        else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) return "Gemini";
        else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) return "Cancer";
        else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) return "Leo";
        else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) return "Virgo";
        else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) return "Libra";
        else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) return "Scorpio";
        else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) return "Sagittarius";
        else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) return "Capricorn";
        else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) return "Aquarius";
        else return "Pisces";
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
