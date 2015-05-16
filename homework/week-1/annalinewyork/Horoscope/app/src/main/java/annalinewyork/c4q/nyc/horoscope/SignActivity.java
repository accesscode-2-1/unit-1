package annalinewyork.c4q.nyc.horoscope;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by c4q-nali on 5/15/15.
 */
public class SignActivity extends Activity{

    Button buttonAries = (Button)findViewById(R.id.buttonAries);
    Button buttonTaurus = (Button)findViewById(R.id.taurus);
    Button buttonGemini = (Button)findViewById(R.id.gemini);
    Button buttonCancer = (Button)findViewById(R.id.cancer);
    Button buttonLeo = (Button)findViewById(R.id.leo);
    Button buttonVirgo = (Button)findViewById(R.id.virgo);
    Button buttonLibra = (Button)findViewById(R.id.libra);
    Button buttonScorpio = (Button)findViewById(R.id.scorpio);
    Button buttonSaglttarlus = (Button)findViewById(R.id.sagittarius);
    Button buttonCapricom = (Button)findViewById(R.id.capricorn);
    Button buttonAquarius = (Button)findViewById(R.id.aquarius);
    Button buttonPisces = (Button)findViewById(R.id.pisces);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
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
