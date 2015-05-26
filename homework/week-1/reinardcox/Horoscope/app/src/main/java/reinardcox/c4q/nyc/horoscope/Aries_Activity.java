package reinardcox.c4q.nyc.horoscope;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;

import java.io.IOException;
import java.net.MalformedURLException;


public class Aries_Activity extends AppCompatActivity {

    TextView _display;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aries_layout);
        _display = (TextView) findViewById(R.id.output_aries_display);

        _display.setText(checkSignReadings());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public String checkSignReadings() {

        try {
            HoroscopeAPI api = new HoroscopeAPI(10000);
            String reading = "";

            reading = api.getHoroscopeReading(HoroscopeSign.Libra, HoroscopeReading.Love);
            return reading;
        } catch (MalformedURLException ex) {
            System.out.println("Cannot connect to server");
        } catch (IOException ex) {
            System.out.println("Cannot get stream from server");
        } catch (SQLExcpetion ex) {
            System.out.println("Cannot connect to database");
        }
        return null;
    }
}


