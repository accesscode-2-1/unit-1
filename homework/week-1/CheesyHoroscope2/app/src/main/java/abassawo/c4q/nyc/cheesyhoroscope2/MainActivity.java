package abassawo.c4q.nyc.cheesyhoroscope2;


import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;


public class MainActivity extends ActionBarActivity
        implements AdapterView.OnItemSelectedListener{

    private ListView mDrawerList;
    private ArrayAdapter<String> mAdapter;
    ActionBarDrawerToggle mDrawerToggle;
    private DatePicker.OnDateChangedListener l;
    private DrawerLayout mDrawerLayout;
    private String mActivityTitle;
    private Intent detailIntent = null;
    private Intent astroIntent = null;
    private String astroSign;
    private Button astroButton;
    DatePicker picker;
    private int month, day, year;
    int zMonth, zDay, zYear;
    private Calendar myCalendar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerList = (ListView) findViewById(R.id.navList);
        mActivityTitle = getTitle().toString();
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);


        addNavBar();
        setupDrawer();
        addButtonListener();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        Spinner dateSpinner = (Spinner) findViewById(R.id.signs_spinner);
        setCurrentDateOnView();
        dateSpinner.setOnItemSelectedListener(this);
        DatePicker picker = (DatePicker) findViewById(R.id.datePicker);

        astroIntent = new Intent(MainActivity.this, AstroReading.class);



        Button button = (Button) findViewById(R.id.openButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(detailIntent);
            }
        });

    }

    public void setCurrentDateOnView(){
        picker = (DatePicker) findViewById(R.id.datePicker);
        final Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);
        picker.init(year, month, day, l);
    }

    private void addNavBar() {
        String[] navArray = {"Learn about Horoscopes","Romantic Compatibility", "Horoscope Game"};
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, navArray);
        mDrawerList.setAdapter(mAdapter);

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//             switch (position) {
//                 case 0: {
//
//                 }
                Toast.makeText(MainActivity.this, "Time for an upgrade!", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void setupDrawer(){
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                R.string.drawer_open, R.string.drawer_close) {
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

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String zodiacSign;
        zodiacSign = parent.getItemAtPosition(position).toString();   //Get sign
        Log.d("getItem", zodiacSign);
        detailIntent = new Intent(MainActivity.this, AstroDetail.class);
        detailIntent.putExtra("zodiac_sign", zodiacSign);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void addButtonListener(){  //Button listener for Astrobutton (searching sign by bday)
        astroButton = (Button) findViewById(R.id.astroButton);
        astroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                astroSign = Zodiac.getZodiacSign(month, day);
                Log.d("month " , " " + zMonth);
                Log.d("day   ", " " + zDay);
                astroIntent.putExtra("zodiac_obj", astroSign);
                Log.d("astro sign", astroSign);
                startActivity(astroIntent);

            }
        });
//For selecting zodiac sign by birthday
        l = new DatePicker.OnDateChangedListener(){
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                zYear = year;
                month = monthOfYear;
                day= dayOfMonth;
                Log.d("day " , "day  " + zDay);
                picker.init(zYear, month, day, l);
            }
        };




    }
}

