package fattyduck.zodiac2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class RomanticCalc extends ActionBarActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romantic_calc);

        Button button = (Button)findViewById(R.id.button1);

    }


    public void calculateRoman(View V){
        String[] z = {"aries", "taurus", "gemini", "cancer", "leo","virgo", "libra", "scorpio", "sagittarius", "capricorn", "aquarius", "pisces"};
        EditText et1 = (EditText)findViewById(R.id.editText);
        EditText et2= (EditText)findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById(R.id.romantextView);
        String text = et1.getText().toString();
        String t = et2.getText().toString();
        boolean a = t.equalsIgnoreCase(z[0])|| t.equalsIgnoreCase(z[2])|| t.equalsIgnoreCase(z[4])|| t.equalsIgnoreCase(z[6])|| t.equalsIgnoreCase(z[8])|| t.equalsIgnoreCase(z[10]);
        boolean b = t.equalsIgnoreCase(z[1])|| t.equalsIgnoreCase(z[3])|| t.equalsIgnoreCase(z[5])|| t.equalsIgnoreCase(z[7])|| t.equalsIgnoreCase(z[9])|| t.equalsIgnoreCase(z[11]);

        if(text.equalsIgnoreCase(z[0])){

            if (a) {
                textView.setText(getString(R.string.hcomp));
            }else {
                textView.setText(R.string.lcomp);
            }

        }else if(text.equalsIgnoreCase(z[1])){
            if (b) {
                textView.setText(getString(R.string.hcomp));
            }else {
                textView.setText(R.string.lcomp);
            }

        }else if(text.equalsIgnoreCase(z[2])){
            if (a) {
                textView.setText(getString(R.string.hcomp));
            }else {
                textView.setText(R.string.lcomp);
            }

        }else if(text.equalsIgnoreCase(z[3])){
            if (b) {
                textView.setText(getString(R.string.hcomp));
            }else {
                textView.setText(R.string.lcomp);
            }

        }else if(text.equalsIgnoreCase(z[4])){
            if (a) {
                textView.setText(getString(R.string.hcomp));
            }else {
                textView.setText(R.string.lcomp);
            }

        }else if(text.equalsIgnoreCase(z[5])){
            if (b) {
                textView.setText(getString(R.string.hcomp));
            }else {
                textView.setText(R.string.lcomp);
            }

        }else if(text.equalsIgnoreCase(z[6])){
            if (a) {
                textView.setText(getString(R.string.hcomp));
            }else {
                textView.setText(R.string.lcomp);
            }

        }else if(text.equalsIgnoreCase(z[7])){
            if (b) {
                textView.setText(getString(R.string.hcomp));
            }else {
                textView.setText(R.string.lcomp);
            }

        }else if(text.equalsIgnoreCase(z[8])){
            if (a) {
                textView.setText(getString(R.string.hcomp));
            }else {
                textView.setText(R.string.lcomp);
            }

        }else if(text.equalsIgnoreCase(z[9])){
            if (b) {
                textView.setText(getString(R.string.hcomp));
            }else {
                textView.setText(R.string.lcomp);
            }

        }else if(text.equalsIgnoreCase(z[10])){
            if (a) {
                textView.setText(getString(R.string.hcomp));
            }else {
                textView.setText(R.string.lcomp);
            }

        }else if(text.equalsIgnoreCase(z[11])){
            if (b) {
                textView.setText(getString(R.string.hcomp));
            }else {
                textView.setText(R.string.lcomp);
            }

        }else{
            textView.setText("Invalid input");
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_romantic_calc, menu);
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
