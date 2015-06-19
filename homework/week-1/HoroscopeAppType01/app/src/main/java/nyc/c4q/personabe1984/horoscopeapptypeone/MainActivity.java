package nyc.c4q.personabe1984.horoscopeapptypeone;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * An feature which displays the option to choose one of several different types of "signs".
 * When the sign is selected, display information about the sign.
 A feature where a user can enter their birthdate and receive information about what their sign is.
 A feature where a user can select two signs and the app will display information about romantic compatibility.
 A game. The game will display a birthdate and will give the user a few seconds' countdown to guess what sign
 the birthdate corresponds to. After some number of tries, the game finishes and display the results to the user.
 Different verticial and horizontal layouts throughout the app.

 */


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
