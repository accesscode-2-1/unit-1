package ahhhlvin.c4q.nyc.horoscopeproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import ahhhlvin.c4q.nyc.horoscopeproject.R;


public class GetHoroscopeSignActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_horoscope_sign);

        final DatePicker date = (DatePicker) findViewById(R.id.datePicker);
        TextView txt = (TextView) findViewById(R.id.txt);

        final TextView textview = (TextView) findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int birthMonth = date.getMonth()+1;
                int birthDate = date.getDayOfMonth();
                textview.setText(getHoroscopeSign(birthMonth, birthDate));

            }
        });





    }

    public static String getHoroscopeSign(int month, int date) {
        if (month == 3 && date >= 21 && date <= 31 || month == 4 && date >= 1 && date <= 19) {
            return  "Aries";
        } else if (month == 4 && date >= 20 && date <= 30 || month == 5 && date >= 1 && date <= 20) {
            return  "Taurus";
        } else if (month == 5 && date >= 21 && date <= 31 || month == 6 && date >= 1 && date <= 21) {
            return  "Gemini";
        } else if (month == 6 && date >= 22 && date <= 30 || month == 7 && date >= 1 && date <= 22) {
            return  "Cancer";
        } else if (month == 7 && date >= 23 && date <= 31 || month == 8 && date >= 1 && date <= 22) {
            return  "Leo";
        } else if (month == 8 && date >= 23 && date <= 30 || month == 9 && date >= 1 && date <= 22) {
            return  "Virgo";
        } else if (month == 9 && date >= 23 && date <= 31 || month == 10 && date >= 1 && date <= 23) {
            return  "Libra";
        } else if (month == 10 && date >= 24 && date <= 31 || month == 11 && date >= 1 && date <= 20) {
            return  "Scorpio";
        } else if (month == 11 && date >= 21 && date <= 30 || month == 12 && date >= 1 && date <= 22) {
            return  "Sagittarius";
        } else if (month == 12 && date >= 23 && date <= 31 || month == 1 && date >= 1 && date <= 20) {
            return  "Capricorn";
        } else if (month == 1 && date >= 21 && date <= 30 || month == 2 && date >= 1 && date <= 21) {
            return  "Aquarius";
        } else if (month == 2 && date >= 22 && date <= 31 || month == 3 && date >= 1 && date <= 20) {
            return  "Pisces";
        } else {
            return "Please enter a valid birthdate in the specified format";
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_get_horoscope_sign, menu);
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
