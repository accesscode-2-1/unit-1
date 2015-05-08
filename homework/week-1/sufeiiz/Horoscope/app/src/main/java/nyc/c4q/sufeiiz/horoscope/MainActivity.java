package nyc.c4q.sufeiiz.horoscope;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    // Fragment managing the behaviors, interactions and presentation of the navigation drawer.
    private NavigationDrawerFragment mNavigationDrawerFragment;

    // Used to store the last screen title. For use in {@link #restoreActionBar()}.
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }

    // horoscope buttons
    public void aries(View v) {
        Intent intent = new Intent(this, AriesActivity.class);
        startActivity(intent);
    }
    public void taurus(View v) {
        Intent intent = new Intent(this, TaurusActivity.class);
        startActivity(intent);
    }
    public void gemini(View v) {
        Intent intent = new Intent(this, GeminiActivity.class);
        startActivity(intent);
    }
    public void cancer(View v) {
        Intent intent = new Intent(this, CancerActivity.class);
        startActivity(intent);
    }
    public void leo(View v) {
        Intent intent = new Intent(this, LeoActivity.class);
        startActivity(intent);
    }
    public void virgo(View v) {
        Intent intent = new Intent(this, VirgoActivity.class);
        startActivity(intent);
    }
    public void scorpio(View v) {
        Intent intent = new Intent(this, ScorpioActivity.class);
        startActivity(intent);
    }
    public void libra(View v) {
        Intent intent = new Intent(this, LibraActivity.class);
        startActivity(intent);
    }
    public void sagittarius(View v) {
        Intent intent = new Intent(this, SagittariusActivity.class);
        startActivity(intent);
    }
    public void capricorn(View v) {
        Intent intent = new Intent(this, CapricornActivity.class);
        startActivity(intent);
    }
    public void aquarius(View v) {
        Intent intent = new Intent(this, AquariusActivity.class);
        startActivity(intent);
    }
    public void pisces(View v) {
        Intent intent = new Intent(this, PiscesActivity.class);
        startActivity(intent);
    }


    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = MainFragment.newInstance(position + 1);
                break;
            case 1:
                fragment = BirthdayFragment.newInstance(position + 1);
                break;
            case 2:
                fragment = CompatibilityFragment.newInstance(position + 1);
                break;
            case 3:
                fragment = GameFragment.newInstance(position + 1);
                break;
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .addToBackStack(null)
                .commit();
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                break;
            case 4:
                mTitle = getString(R.string.title_section4);
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    public static class MainFragment extends Fragment {
        private static final String ARG_SECTION_NUMBER = "section_number";

        public static MainFragment newInstance(int sectionNumber) {
            MainFragment fragment = new MainFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public MainFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MainActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }
}
