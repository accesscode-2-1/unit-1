package jorgereina1986.c4q.nyc.horoscope;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;


public class MainActivity extends ActionBarActivity {

    public static final String TAG = "Horoscope";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TableLayout tl = (TableLayout) findViewById(R.id.tablelayout);


        final ImageView aries = (ImageView) findViewById(R.id.aries_img);
        final ImageView cancer = (ImageView) findViewById(R.id.cancer_img);
        final ImageView aquarius = (ImageView) findViewById(R.id.aquarius_img);
        final ImageView capricorn = (ImageView) findViewById(R.id.capricorn_img);
        final ImageView gemini = (ImageView) findViewById(R.id.gemini_img);
        final ImageView leo = (ImageView) findViewById(R.id.leo_img);
        final ImageView libra = (ImageView) findViewById(R.id.libra_img);
        final ImageView pisces = (ImageView) findViewById(R.id.pisces_img);
        final ImageView sagittarius = (ImageView) findViewById(R.id.sagittarius_img);
        final ImageView scorpio = (ImageView) findViewById(R.id.scorpio_img);
        final ImageView taurus = (ImageView) findViewById(R.id.taurus_img);
        final ImageView virgo = (ImageView) findViewById(R.id.virgo_img);

        aries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,
                        aries.class);
                startActivity(mainIntent);
            }
        });
        cancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,
                        cancer.class);
                startActivity(mainIntent);
            }
        });
        aquarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,
                        aquarius.class);
                startActivity(mainIntent);
            }
        });
        capricorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,
                        capricorn.class);
                startActivity(mainIntent);
            }
        });
        gemini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,
                        gemini.class);
                startActivity(mainIntent);
            }
        });
        leo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,
                        leo.class);
                startActivity(mainIntent);
            }
        });
        libra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,
                        libra.class);
                startActivity(mainIntent);
            }
        });
        pisces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,
                        pisces.class);
                startActivity(mainIntent);
            }
        });
        sagittarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,
                        sagittarius.class);
                startActivity(mainIntent);
            }
        });
        scorpio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,
                        scorpio.class);
                startActivity(mainIntent);
            }
        });
        taurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,
                        taurus.class);
                startActivity(mainIntent);
            }
        });
        virgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,
                        virgo.class);
                startActivity(mainIntent);
            }
        });


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
