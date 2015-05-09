package fattyduck.zodiac2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import fattyduck.zodiac2.R;


public class DisplaySign extends ActionBarActivity {
    //this is the Display class (Sign Info)
    Spinner drop;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_sign);
        drop=(Spinner)findViewById(R.id.sp);
        text=(TextView)findViewById(R.id.zodiacinfo);
        //the setmovement method is to allow my text view to scroll
        text.setMovementMethod(new ScrollingMovementMethod());
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.zodiacArray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        drop.setAdapter(adapter);
        drop.setOnItemSelectedListener(new display());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_sign, menu);
        return true;
    }
    public class display implements AdapterView.OnItemSelectedListener{
        //this is to set text to whatever the dropbox is.
        public void onItemSelected(AdapterView<?> parent,View arg1, int pos, long id ){
            String str = parent.getItemAtPosition(pos).toString();
            if(str.equals("Aries")){
                text.setText(getString(R.string.AriesInfo));
            }else if(str.equals("Taurus")){
                text.setText(getString(R.string.TaurusInfo));
            }else if(str.equals("Gemini")){
                text.setText(getString(R.string.GeminiInfo));
            }else if(str.equals("Cancer")){
                text.setText(getString(R.string.CancerInfo));
            }else if(str.equals("Leo")){
                text.setText(getString(R.string.LeoInfo));
            }else if(str.equals("Virgo")){
                text.setText(getString(R.string.VirgoInfo));
            }else if(str.equals("Libra")){
                text.setText(getString(R.string.LibraInfo));
            }else if(str.equals("Scorpio")){
                text.setText(getString(R.string.ScorpiusInfo));
            }else if(str.equals("Sagittarius")){
                text.setText(getString(R.string.SagittariusInfo));
            }else if(str.equals("Capricorn")){
                text.setText(getString(R.string.CapricornInfo));
            }else if(str.equals("Aquarius")){
                text.setText(getString(R.string.AquariusInfo));
            }else if(str.equals("Pisces")){
                text.setText(getString(R.string.PiscesInfo));
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
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
