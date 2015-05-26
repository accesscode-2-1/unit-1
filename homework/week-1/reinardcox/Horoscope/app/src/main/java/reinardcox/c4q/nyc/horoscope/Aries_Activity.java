package reinardcox.c4q.nyc.horoscope;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;

import java.io.IOException;
import java.net.MalformedURLException;

import horoscopeapi.HoroscopeAPI;
import horoscopeapi.SQLExcpetion;
import horoscopeapi.ZodiacReading;
import horoscopeapi.ZodiacSign;


public class Aries_Activity extends AppCompatActivity {

    TextView _display;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aries_layout);
        _display = (TextView) findViewById(R.id.output_aries_display);
        _display.setText(readingSign());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public String readingSign() {

        String reading = "";

        try {
            HoroscopeAPI api = new HoroscopeAPI(10000);
            reading = api.getZodiacReading(ZodiacSign.Dragon, ZodiacReading.Daily_Zodiac);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            //ex.printStackTrace();
        } catch (SQLExcpetion ex) {
            //ex.printStackTrace();
        }
        return reading;
    }

}


