package abassawo.c4q.nyc.cheesyhoroscope2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import java.util.ArrayList;


public class ZodiacRomance extends ActionBarActivity {

    private ArrayList<String> compatibles;
    private Spinner.OnClickListener l;
    private Intent compatIntent;
    private String zodiacSign1;
    private String zodiacSign2;

    //hashmap w. key - zodiac sign, and v - array of other zodiac signs

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac_romance);

        Spinner spinner1 = (Spinner) findViewById(R.id.signs_spinner);
        Spinner spinner2 = (Spinner) findViewById(R.id.signs_spinner2);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                zodiacSign1 = parent.getItemAtPosition(position).toString();
                //compatIntent.
                //STORE STRING CHOSEN AND MAKE NEW ZODIAC OBJECT
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                zodiacSign2 = parent.getItemAtPosition(position).toString();
                //STORE STRING CHOSEN AND MAKE NEW ZODIAC OBJECT
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        l = new View.OnClickListener(){ //main search button
            @Override
            public void onClick(View v) {
                //todo Check if both objects are compatible
            }
        };
        //aries.addRomanceMatch(cancer);
        // parse sign from both dropdowns.
//        if (compatible){
//
//        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_zodiac_romance, menu);
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

    public boolean isCompatibile(Zodiac x, Zodiac y){
     boolean compatible = false;
        return compatible;
    }



            Zodiac aries = new Zodiac("Aries");
            Zodiac taurus = new Zodiac("Taurus");
            Zodiac gemini = new Zodiac("Gemini");
            Zodiac cancer = new Zodiac("Cancer");
            Zodiac leo = new Zodiac("Leo");
            Zodiac virgo = new Zodiac("Virgo");
            Zodiac libra = new Zodiac("Libra");
            Zodiac scorpio = new Zodiac("Scorpio");
            Zodiac sagittarius = new Zodiac("Sagittarius");
            Zodiac capricorn = new Zodiac("Capricorn");
            Zodiac aquarius = new Zodiac("Aquarius");
            Zodiac pisces = new Zodiac("Pisces");



}


