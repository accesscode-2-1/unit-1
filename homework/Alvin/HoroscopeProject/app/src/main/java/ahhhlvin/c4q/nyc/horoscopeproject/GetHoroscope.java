package ahhhlvin.c4q.nyc.horoscopeproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;


public class GetHoroscope extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_horoscope);

        final TextView horoscope = (TextView) findViewById(R.id.getHoroscopeView);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayList<String> list2 = new ArrayList<String>();

        list2.add("Select horoscope sign");
        list2.add("Capricorn");
        list2.add("Aries");
        list2.add("Taurus");
        list2.add("Gemini");
        list2.add("Cancer");
        list2.add("Leo");
        list2.add("Libra");
        list2.add("Virgo");
        list2.add("Scorpio");
        list2.add("Sagittarius");
        list2.add("Pisces");
        list2.add("Aquarius");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list2);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);


        Button button = (Button) findViewById(R.id.getHoroscopeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                horoscope.setText(getHoroscope(spinner.getSelectedItem().toString()));
            }
        });


    }

    public static String getHoroscope(String sign) {
        if (sign.equalsIgnoreCase("Aries"))
        {
            return "You are smart.";
        } else if  (sign.equalsIgnoreCase("Taurus")) {
            return "You are kind.";
        }  else if  (sign.equalsIgnoreCase("Gemini")) {
            return "You are funy.";
        }  else if  (sign.equalsIgnoreCase("Cancer")) {
            return "You are lucky.";
        }  else if  (sign.equalsIgnoreCase("Leo")) {
            return "You are beautiful.";
        }  else if  (sign.equalsIgnoreCase("Virgo")) {
            return "You are thoughtful.";
        }  else if  (sign.equalsIgnoreCase("Libra")) {
            return "You are hardworking.";
        }  else if  (sign.equalsIgnoreCase("Scorpio")) {
            return "You are persistent.";
        }  else if  (sign.equalsIgnoreCase("Sagittarius")) {
            return "You are sly.";
        }  else if  (sign.equalsIgnoreCase("Capricorn")) {
            return "You are cunning.";
        }  else if  (sign.equalsIgnoreCase("Aquarius")) {
            return "You are artistic.";
        }  else if  (sign.equalsIgnoreCase("Pisces"))
        {
            return "You are logical.";
        } else {
            return "Please try again.";
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_get_horoscope, menu);
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