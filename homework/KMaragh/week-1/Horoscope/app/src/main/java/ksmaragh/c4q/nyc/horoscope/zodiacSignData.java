package ksmaragh.c4q.nyc.horoscope;

/**
 * Created by kadeemmaragh on 5/10/15.
 */
<<<<<<< HEAD
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
=======
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class zodiacSignData extends ActionBarActivity {

    TextView signInfo,signName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac_sign_data);

        signName = (TextView) findViewById(R.id.zodiacSign);
        signInfo = (TextView) findViewById(R.id.zodiacInfo);

        Bundle extras = getIntent().getExtras();
        String text;

        if(extras != null){
<<<<<<< HEAD
            text = extras.getString("info");
=======
            text = extras.getString("words");
>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500
            signInfo.setText(text);
            text = extras.getString("name");
            signName.setText(text);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_zodiac_sign_data, menu);
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
