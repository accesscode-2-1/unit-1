package ksmaragh.c4q.nyc.horoscope;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;
import java.util.TimeZone;


public class birthdayZodiac extends ActionBarActivity {

    private Spinner monthSpin, daySpin;
    private Button btnSubmit;
    private TextView signName, signInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_zodiac);

        addListenerOnButton();
        //addListenerOnSpinnerItemSelection();
    }


//    public void addListenerOnSpinnerItemSelection() {
//        monthSpin = (Spinner) findViewById(R.id.months);
//        monthSpin.setOnItemSelectedListener(new CustomeOnItemSelectedListener());
//    }

    // get the selected dropdown list value
    public void addListenerOnButton() {

        monthSpin = (Spinner) findViewById(R.id.months);
        daySpin = (Spinner) findViewById(R.id.days);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        signName = (TextView) findViewById(R.id.signName);
        signInfo = (TextView) findViewById(R.id.zodiacInfo);

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

//                Toast.makeText(birthdayZodiac.this,
//                        "OnClickListener : " +
//                                "\nMonth : " + String.valueOf(monthSpin.getSelectedItem()) +
//                                "\nDay : " + String.valueOf(daySpin.getSelectedItem()),
//                        Toast.LENGTH_SHORT).show();

                int month = convertMonth(String.valueOf(monthSpin.getSelectedItem()));
                int day = Integer.parseInt(String.valueOf(daySpin.getSelectedItem()));
                String sign = findZodiacSign(month,day);
            }

        });
    }

    public String findZodiacSign(int month, int day){
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.set(2015, month, day);
        int calendarDay = calendar.get(Calendar.DAY_OF_YEAR);


        if(calendarDay >= 20 && calendarDay <= 50)
            return "Aquarius";
        else if(calendarDay >= 51 && calendarDay <= 80)
            return "Pisces";
        else if(calendarDay >= 81 && calendarDay <= 110)
            return "Aries";
        else if(calendarDay >= 111 && calendarDay <= 141)
            return "Taurus";
        else if(calendarDay >= 142 && calendarDay <= 172)
            return "Gemini";
        else if(calendarDay >= 173 && calendarDay <= 204)
            return "Cancer";
        else if(calendarDay >= 205 && calendarDay <= 235)
            return "Leo";
        else if(calendarDay >= 236 && calendarDay <= 266)
            return "Virgo";
        else if(calendarDay >= 267 && calendarDay <= 296)
            return "Libra";
        else if(calendarDay >= 297 && calendarDay <= 326)
            return "Scorpio";
        else if(calendarDay >= 327 && calendarDay <= 356)
            return "Sagitarius";
        else
            return "Capricorn";
    }

    public String zodiacSignInfo(String sign){
        if(sign.equals("Aquarius"))
            return "Aquarius";
        else if(sign.equals("Pisces"))
            return "Pisces";
        else if(sign.equals("Aries"))
            return "Aries";
        else if(sign.equals("Taurus"))
            return "Taurus";
        else if(sign.equals("Gemini"))
            return "Gemini";
        else if(sign.equals("Cancer"))
            return "Cancer";
        else if(sign.equals("Leo"))
            return "Leo";
        else if(sign.equals("Virgo"))
            return "Virgo";
        else if(sign.equals("Libra"))
            return "Libra";
        else if(sign.equals("Scorpio"))
            return "Scorpio";
        else if(sign.equals("Sagitarius"))
            return "Sagitarius";
        else if(sign.equals("Capricorn"))
            return "Capricorn";
        else
            return "Not a sign";
    }



    public int convertMonth(String month){
        if(month.equals("January"))
            return 1;
        else if(month.equals("February"))
            return 2;
        else if(month.equals("March"))
            return 3;
        else if(month.equals("April"))
            return 4;
        else if(month.equals("May"))
            return 5;
        else if(month.equals("June"))
            return 6;
        else if(month.equals("July"))
            return 7;
        else if(month.equals("August"))
            return 8;
        else if(month.equals("September"))
            return 9;
        else if(month.equals("October"))
            return 10;
        else if(month.equals("November"))
            return 11;
        else if(month.equals("December"))
            return 12;
        else
            return 0;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_birthday_zodiac, menu);
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
