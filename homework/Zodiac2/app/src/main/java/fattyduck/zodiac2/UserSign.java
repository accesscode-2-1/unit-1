package fattyduck.zodiac2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class UserSign extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign);
        Button bday = (Button)findViewById(R.id.bdayButton);
        bday.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        EditText bmonth = (EditText) findViewById(R.id.monthedit);
                        int month = Integer.parseInt(bmonth.getText().toString());
                        EditText date = (EditText) findViewById(R.id.dateEdit);
                        int dateInt = Integer.parseInt(date.getText().toString());
                        TextView text = (TextView)findViewById(R.id.userNotes);
                        if(month==1){
                            if(dateInt>19){
                                text.setText(getString(R.string.AquariusSign));
                            }else{
                                text.setText(getString(R.string.CapricornSign));
                            }
                        }else  if(month==2){
                            if(dateInt>18){
                                text.setText(getString(R.string.PiscesSign));
                            }else{
                                text.setText(getString(R.string.AquariusSign));
                            }
                        }else  if(month==3){
                            if(dateInt>20){
                                text.setText(getString(R.string.AriesSign));
                            }else{
                                text.setText(getString(R.string.PiscesSign));
                            }
                        }else  if(month==4){
                            if(dateInt>19){
                                text.setText(getString(R.string.TaurusSign));
                            }else{
                                text.setText(getString(R.string.AriesSign));
                            }
                        }else  if(month==5){
                            if(dateInt>20){
                                text.setText(getString(R.string.GeminiSign));
                            }else{
                                text.setText(getString(R.string.TaurusSign));
                            }
                        }else  if(month==6){
                            if(dateInt>20){
                                text.setText(getString(R.string.CancerSign));
                            }else{
                                text.setText(getString(R.string.GeminiSign));
                            }
                        }else  if(month==7){
                            if(dateInt>22){
                                text.setText(getString(R.string.LeoSign));
                            }else{
                                text.setText(getString(R.string.CancerSign));
                            }
                        }else  if(month==8){
                            if(dateInt>22){
                                text.setText(getString(R.string.VirgoSign));
                            }else{
                                text.setText(getString(R.string.LeoSign));
                            }
                        }else  if(month==9){
                            if(dateInt>22){
                                text.setText(getString(R.string.LibraSign));
                            }else{
                                text.setText(getString(R.string.VirgoSign));
                            }
                        }else  if(month==10){
                            if(dateInt>22){
                                text.setText(getString(R.string.ScorpiusSign));
                            }else{
                                text.setText(getString(R.string.LibraSign));
                            }
                        }else  if(month==11){
                            if(dateInt>21){
                                text.setText(getString(R.string.SagittariusSign));
                            }else{
                                text.setText(getString(R.string.ScorpiusSign));
                            }
                        }else  if(month==12){
                            if(dateInt>21){
                                text.setText(getString(R.string.CapricornSign));
                            }else {
                                text.setText(getString(R.string.AquariusSign));
                            }
                        }else{
                            text.setText("Wrong");
                        }
                    }
                }
        );
        bday.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View V){
                        TextView text = (TextView)findViewById(R.id.userNotes);
                        Random rand = new Random();
                        int i = rand.nextInt(3);
                        if(i==0){
                            text.setText(getString(R.string.lucky));
                        }else if(i==1){
                            text.setText(getString(R.string.soso));
                        }else{
                            text.setText(getString(R.string.unlucky));
                        }
                        return true;
                    }
                }
        );

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_user_sign, menu);
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
