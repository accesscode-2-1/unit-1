package jorgereina1986.c4q.nyc.horoscope;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Random;


public class GameActivity extends ActionBarActivity {

    TextView randomDate;
    int randomMonth;
    int randomDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public static String Question() {
        String date;
        int dayOfYear, month, day;

        Calendar cal = Calendar.getInstance();
        Random random = new Random();
        dayOfYear = random.nextInt(365);

        cal.set(Calendar.DAY_OF_YEAR, dayOfYear);
        month = cal.get(Calendar.MONTH) + 1;
        day = cal.get(Calendar.DATE);
        date = month + "/" + day;

        return date;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
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
