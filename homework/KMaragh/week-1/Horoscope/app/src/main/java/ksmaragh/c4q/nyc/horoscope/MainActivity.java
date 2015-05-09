package ksmaragh.c4q.nyc.horoscope;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView aries, taurus, gemini, cancer, leo, virgo, libra, scorpio, sag, capricorn, aquarius, pisces;
    private ListView mDrawerList;
    private DrawerLayout mDrawerLayout;
    private ArrayAdapter<String> mAdapter;
    private ActionBarDrawerToggle mDrawerToggle;
    private String mActivityTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerList = (ListView)findViewById(R.id.navList);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        mActivityTitle = getTitle().toString();

        addDrawerItems();
        setupDrawer();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        aries = (ImageView) findViewById(R.id.aries);
        taurus = (ImageView) findViewById(R.id.taurus);
        gemini = (ImageView) findViewById(R.id.gemini);
        cancer = (ImageView) findViewById(R.id.cancer);
        leo = (ImageView) findViewById(R.id.leo);
        virgo = (ImageView) findViewById(R.id.virgo);
        libra = (ImageView) findViewById(R.id.libra);
        scorpio = (ImageView) findViewById(R.id.scorpio);
        sag = (ImageView) findViewById(R.id.sagittarius);
        capricorn = (ImageView) findViewById(R.id.capricorn);
        aquarius = (ImageView) findViewById(R.id.aquarius);
        pisces = (ImageView) findViewById(R.id.pisces);

        //Making the images clickable so they can act as buttons
        aries.setOnClickListener(this);
        taurus.setOnClickListener(this);
        gemini.setOnClickListener(this);
        cancer.setOnClickListener(this);
        leo.setOnClickListener(this);
        virgo.setOnClickListener(this);
        libra.setOnClickListener(this);
        scorpio.setOnClickListener(this);
        sag.setOnClickListener(this);
        capricorn.setOnClickListener(this);
        aquarius.setOnClickListener(this);
        pisces.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(), zodiacSignData.class);
        Bundle bundle = new Bundle();

        int signID = v.getId();

        if(signID == aries.getId()) {
            bundle.putString("words","Aries start with the letter A");
            i.putExtras(bundle);
            startActivity(i);
        }
        else if(signID == taurus.getId()) {
            bundle.putString("words","Taurus start with the letter T");
            i.putExtras(bundle);
            startActivity(i);
        }
        else if(signID == gemini.getId()) {
            bundle.putString("words","Gemini start with the letter G");
            i.putExtras(bundle);
            startActivity(i);
        }
        else if(signID == cancer.getId()) {
            bundle.putString("words","Cancer start with the letter C");
            i.putExtras(bundle);
            startActivity(i);
        }
        else if(signID == leo.getId()){
            bundle.putString("words","Leo start with the letter L");
            i.putExtras(bundle);
            startActivity(i);
        }
        else if(signID == virgo.getId()) {
            bundle.putString("words","Virgo start with the letter V");
            i.putExtras(bundle);
            startActivity(i);
        }
        else if(signID == libra.getId()) {
            bundle.putString("words","Libra start with the letter L");
            i.putExtras(bundle);
            startActivity(i);
        }
        else if(signID == scorpio.getId()){
            bundle.putString("words","Scorpio start with the letter S");
            i.putExtras(bundle);
            startActivity(i);
        }
        else if(signID == sag.getId()) {
            bundle.putString("words","Sagitarius start with the letter S");
            i.putExtras(bundle);
            startActivity(i);
        }
        else if(signID == capricorn.getId()) {
            bundle.putString("words","Capricorn start with the letter C");
            i.putExtras(bundle);
            startActivity(i);
        }
        else if(signID == aquarius.getId()){
            bundle.putString("words","Aquarius starts with the letter A");
            i.putExtras(bundle);
            startActivity(i);
        }
        else if(signID == pisces.getId()){
            bundle.putString("words","Pisces start with the letter P");
            i.putExtras(bundle);
            startActivity(i);
        }

    }

    private void addDrawerItems() {
        String[] osArray = { "Android", "iOS", "Windows", "OS X", "Linux" };
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, osArray);
        mDrawerList.setAdapter(mAdapter);

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Time for an upgrade!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void chooseActivity(String activityName){

        //if(activityName.equalsIgnoreCase())

    }

    private void setupDrawer() {
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.drawer_open, R.string.drawer_close) {

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getSupportActionBar().setTitle("Navigation!");
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                getSupportActionBar().setTitle(mActivityTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };

        mDrawerToggle.setDrawerIndicatorEnabled(true);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
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

        // Activate the navigation drawer toggle
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}




