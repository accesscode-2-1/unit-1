package gmsyrimis.c4q.nyc.horoscope;

import android.app.Activity;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
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
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    private NavigationDrawerFragment mNavigationDrawerFragment;
    private CharSequence mTitle;
    private TextView zodiacDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zodiacDescription = (TextView) findViewById(R.id.zodiac_description);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));

        Button checkSign = (Button) findViewById(R.id.check_sign);
        Button signMatch = (Button) findViewById(R.id.sign_match);
        Button guessSign = (Button) findViewById(R.id.guess_sign);

        checkSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getFragmentManager();
                CheckSign check = new CheckSign();
                fragmentManager.beginTransaction()
                        .replace(R.id.container, check)
                        .commit();
            }
        });
        guessSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getFragmentManager();
                GuessSign guess = new GuessSign();
                fragmentManager.beginTransaction()
                        .replace(R.id.container, guess)
                        .commit();
            }
        });
        signMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getFragmentManager();
                Compatibility match = new Compatibility();
                fragmentManager.beginTransaction()
                        .replace(R.id.container, match)
                        .commit();
            }
        });

    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                .commit();
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                zodiacDescription.setText(getString(R.string.aries_description));
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                zodiacDescription.setText(getString(R.string.taurus_description));
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                zodiacDescription.setText(getString(R.string.gemini_description));
                break;
            case 4:
                mTitle = getString(R.string.title_section4);
                zodiacDescription.setText(getString(R.string.cancer_description));
                break;
            case 5:
                mTitle = getString(R.string.title_section5);
                zodiacDescription.setText(getString(R.string.leo_description));
                break;
            case 6:
                mTitle = getString(R.string.title_section6);
                zodiacDescription.setText(getString(R.string.virgo_description));
                break;
            case 7:
                mTitle = getString(R.string.title_section7);
                zodiacDescription.setText(getString(R.string.libra_description));
                break;
            case 8:
                mTitle = getString(R.string.title_section8);
                zodiacDescription.setText(getString(R.string.scorpio_description));
                break;
            case 9:
                mTitle = getString(R.string.title_section9);
                zodiacDescription.setText(getString(R.string.sagittarius_description));
                break;
            case 10:
                mTitle = getString(R.string.title_section10);
                zodiacDescription.setText(getString(R.string.capricorn_description));
                break;
            case 11:
                mTitle = getString(R.string.title_section11);
                zodiacDescription.setText(getString(R.string.aquarius_description));
                break;
            case 12:
                mTitle = getString(R.string.title_section12);
                zodiacDescription.setText(getString(R.string.pisces_description));
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }




    public static class PlaceholderFragment extends Fragment {

        private static final String ARG_SECTION_NUMBER = "section_number";

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

}
