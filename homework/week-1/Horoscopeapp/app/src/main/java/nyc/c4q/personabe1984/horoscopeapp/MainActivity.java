package nyc.c4q.personabe1984.horoscopeapp;
/**
 * Create a horoscope app with the following features:

 A navigation drawer.
 An feature which displays the option to choose one of several different types of "signs". When the sign is selected, display information about the sign.
 A feature where a user can enter their birthdate and receive information about what their sign is.
 A feature where a user can select two signs and the app will display information about romantic compatibility.
 A game. The game will display a birthdate and will give the user a few seconds' countdown to guess what sign the birthdate corresponds to. After some number of tries, the game finishes and display the results to the user.
 Different verticial and horizontal layouts throughout the app.
 Get creative with your game and look at this chart on signs.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        //Create an ArrayAdaper using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.horoscope_array, android.R.layout.simple_spinner_item);
        //Specify the layout to use wehn the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner

        spinner.setAdapter(adapter);
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
