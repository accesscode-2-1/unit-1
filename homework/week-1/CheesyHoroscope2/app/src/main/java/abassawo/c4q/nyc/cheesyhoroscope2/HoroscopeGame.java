package abassawo.c4q.nyc.cheesyhoroscope2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
//todo: create date randomizer, method that stores date and evaluates the sign that corresponds with it,
//todo: use timer to add constraint to how long user has to guess the sign

public class HoroscopeGame extends ActionBarActivity {
    private Timer gameTimer;
    private TimerTask guess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoscope_game);

        gameTimer = new Timer();
        guess = new TimerTask() {
            @Override
            public void run() {
                //guess stuff
            }
        };
//        gameTimer.scheduleAtFixedRate();
        gameTimer.scheduleAtFixedRate(guess, 15, 11);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_horoscope_game, menu);
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
