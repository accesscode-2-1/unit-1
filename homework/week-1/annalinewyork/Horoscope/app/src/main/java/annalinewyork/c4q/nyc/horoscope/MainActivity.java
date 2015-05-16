package annalinewyork.c4q.nyc.horoscope;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    Button signbutton;
    Button findbutton;
    Button romanticbutton;
    Button gamebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signbutton = (Button) findViewById(R.id.signButton);
        signbutton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent signbutton = new Intent(getApplicationContext(), SignActivity.class);
                        startActivity(signbutton);
                    }
                }
        );


        findbutton = (Button) findViewById(R.id.findButton);
        findbutton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent findbutton = new Intent(getApplicationContext(), FindActivity.class);
                        startActivity(findbutton);
                    }
                }

        );

        romanticbutton = (Button) findViewById(R.id.romanticButton);
        romanticbutton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent romanticbutton = new Intent(getApplicationContext(), RomanticActivity.class);
                        startActivity(romanticbutton);
                    }
                }
        );

        gamebutton = (Button) findViewById(R.id.gameButton);
        gamebutton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent gamebutton = new Intent(getApplicationContext(), GameActivity.class);
                        startActivity(gamebutton);
                    }
                }
        );
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
