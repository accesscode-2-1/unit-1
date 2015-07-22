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


public class HoroscopeCompatibility extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoscope_compatibility);

        final Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        ArrayList<String> list = new ArrayList<String>();

        list.add("Select horoscope sign");
        list.add("Capricorn");
        list.add("Aries");
        list.add("Taurus");
        list.add("Gemini");
        list.add("Cancer");
        list.add("Leo");
        list.add("Libra");
        list.add("Virgo");
        list.add("Scorpio");
        list.add("Sagittarius");
        list.add("Pisces");
        list.add("Aquarius");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);


        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
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

        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list2);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter2);


        final TextView compatibilityView = (TextView) findViewById(R.id.viewCompatibility);
        Button button = (Button) findViewById(R.id.getCompatibilityButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                compatibilityView.setText(returnCompatibility(spinner1.getSelectedItem().toString(), spinner2.getSelectedItem().toString()));
            }
        });





    }


    public static String returnCompatibility(String sign1, String sign2) {
        String str = "Please try again.";

        if (!sign1.equals("Select horoscope sign") && !sign2.equals("Select horoscope sign") || !sign1.equals("Select horoscope sign") || !sign2.equals("Select horoscope sign")) {
            str = "❤❤❤Both are 100% compatible! :)❤❤❤";
        }

        return str;
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_horoscope_compatibility, menu);
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
