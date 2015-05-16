package jvvlives2005.c4q.nyc.horoscopehomework;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
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

        // Font path
        String fontPath = "/Users/c4q-joshelynvivas/Desktop/AccessCode-Unit1/unit-1/homework/week-1/jvvlives2005/HoroscopeHomework/app/src/assets/fonts/Plaster/Plaster-Regular.ttf";

        // text view label

        TextView txtGhost = (TextView) findViewById(R.id.textView2);

        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        // Applying font
        txtGhost.setTypeface(tf);






    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
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
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
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


    public static class Zodiac {

        /**
         * Parses a month and date of the similar to "January 1".
         *
         * @param
         *   string The month and date to parse.
         * @return
         *   A 'Calendar' object with that month and date set.  The year may be any value.
         */
        @SuppressWarnings("deprecation")
        public static Calendar parseMonthAndDate(String string) {
            // We use an older API for parsing, which returns an old (deprecated) 'Date' object.
            SimpleDateFormat format = new SimpleDateFormat("MMMMM dd");
            Date parseDate;
            try {
                parseDate = format.parse(string);
            } catch (ParseException exception) {
                exception.printStackTrace();
                return null;
            }

            // Convert the 'Date' to 'Calendar'.
            Calendar date = Calendar.getInstance();
            date.set(1900, parseDate.getMonth(), parseDate.getDate(), 0, 0, 0);
            date.set(Calendar.MILLISECOND, 0);
            return date;
        }

        public static String getZodiacSign(Calendar date) {
            int year = date.get(Calendar.YEAR);

            // Load lines from the file with zodiac dates.
            ArrayList<String> lines = FileTools.readLinesFromFile("zodiac.csv");
            // Process them.
            for (String line : lines) {
                // Each line is of the form "sign,startDate,endDate".  Split it.
                int comma1 = line.indexOf(',');
                String sign = line.substring(0, comma1);
                int comma2 = line.indexOf(',', comma1 + 1);
                String start = line.substring(comma1 + 1, comma2);
                String end = line.substring(comma2 + 1);

                // Parse the start and end dates to dates.  Make sure to set
                // the year to this year, so that we can compare them to 'date'.
                Calendar startDate = parseMonthAndDate(start);
                startDate.set(Calendar.YEAR, year);
                Calendar endDate = parseMonthAndDate(end);
                endDate.set(Calendar.YEAR, year);
                // Tricky: one sign straddles January 1.  Adjust it either to
                // start in the previous year or end in the next year, depending
                // on if our 'date' is in January or not.
                if (endDate.compareTo(startDate) == -1) {
                    if (date.get(Calendar.MONTH) == Calendar.JANUARY)
                        startDate.add(Calendar.YEAR, -1);
                    else
                        endDate.add(Calendar.YEAR, 1);
                }

                // Now see if our date falls between the start and end for this sign.
                if (date.compareTo(startDate) != -1 && date.compareTo(endDate) != 1)
                    return sign;
            }

            // No match.  :(
            return null;
        }

    }
}
