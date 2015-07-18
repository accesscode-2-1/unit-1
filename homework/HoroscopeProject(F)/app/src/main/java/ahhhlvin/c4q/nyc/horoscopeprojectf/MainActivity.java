package ahhhlvin.c4q.nyc.horoscopeprojectf;

import android.app.Fragment;
import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Locale;


public class MainActivity extends ActionBarActivity {


    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    private CharSequence mTitle;
    private String[] mListTitles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mListTitles = getResources().getStringArray(R.array.titles);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        mTitle = getTitle();

        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                R.layout.drawer_list_item, mListTitles));

        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

        if (savedInstanceState == null) {
            selectItem(0);
        }

    }


    /* The click listener for ListView in the navigation drawer */
    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }
    }


    private void selectItem(int position) {
        // update the main content by replacing fragments
        Fragment fragment;

        if (position == 0) {
            fragment = new HomeScreenFragment();
            Toast toast = Toast.makeText(getApplicationContext(), "→ swipe right to get started", Toast.LENGTH_LONG);
            toast.show();

        } else if (position == 1) {
            fragment = new GetHoroscopeFragment();

        } else if (position == 2) {
            fragment = new GetHoroscopeSignFragment();

        } else if (position == 3) {
            fragment = new HoroscopeCompatibilityFragment();

        } else {
            fragment = new HoroscopeGameFragment();
        }

        Bundle args = new Bundle();
        args.putInt(HomeScreenFragment.ARG_LIST_NUMBER, position);
        fragment.setArguments(args);


        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();


        // update selected item and title, then close the drawer
        mDrawerList.setItemChecked(position, true);
        mDrawerLayout.closeDrawer(mDrawerList);
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggles
        mDrawerToggle.onConfigurationChanged(newConfig);
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("time", HoroscopeGameFragment.time.getText().toString());
        outState.putString("month", HoroscopeGameFragment.calendar.getDisplayName(HoroscopeGameFragment.calendar.MONTH, HoroscopeGameFragment.calendar.LONG, Locale.ENGLISH));
        outState.putInt("date", HoroscopeGameFragment.calendar.get(HoroscopeGameFragment.calendar.DATE));
        outState.putInt("year", HoroscopeGameFragment.calendar.get(HoroscopeGameFragment.calendar.YEAR));
    }

}

