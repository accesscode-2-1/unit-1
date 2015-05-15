package jvidals1.nyc.c4q.horoscopeapp;

import android.app.Activity;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {

    private DrawerLayout navDrawerLayout;
    private ListView navDrawerList;
    private ActionBarDrawerToggle navToggle;

    private CharSequence navDrawerTitle;
    private CharSequence navTitles;
    private String[] horoscropeTitles;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navTitles = navDrawerTitle = getTitle();
        horoscropeTitles = getResources().getStringArray(R.array.titles_array);
        navDrawerLayout=(DrawerLayout) findViewById(R.id.drawer_layout);
        navDrawerList=(ListView) findViewById(R.id.left_drawer);

        // set a custom shadow that overlays the main content when the drawer opens
        navDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow1, GravityCompat.START);
        // set up the drawer's list view with items and click listener


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
