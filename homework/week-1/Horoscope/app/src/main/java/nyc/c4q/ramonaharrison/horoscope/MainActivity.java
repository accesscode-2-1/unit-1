package nyc.c4q.ramonaharrison.horoscope;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks, MainFragment.OnFragmentInteractionListener, ListViewFragment.OnFragmentInteractionListener, YourSignFragment.OnFragmentInteractionListener, GameFragment.OnFragmentInteractionListener, ResultFragment.OnFragmentInteractionListener, CompatibilityFragment.OnFragmentInteractionListener, AboutSignFragment.OnFragmentInteractionListener {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;
    private MainFragment mMainFragment;
    private ListViewFragment mListViewFragment;
    private AboutSignFragment mAboutSignFragment;
    private YourSignFragment mYourSignFragment;
    private CompatibilityFragment mCompatibilityFragment;
    private GameFragment mGameFragment;
    private ResultFragment mResultFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;
    final static String TAG = "test"; // TAG for debugging


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up the drawer.
        mNavigationDrawerFragment = (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
        mTitle = getTitle();

        if (savedInstanceState == null) {
            // Place main fragment
            mMainFragment = MainFragment.newInstance();
            FragmentTransaction fx = getSupportFragmentManager().beginTransaction();
            fx.replace(R.id.container, mMainFragment);
            fx.addToBackStack(null);
            fx.commit();
        }

    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentTransaction fx;

        switch (position) {
            case 0:
                mListViewFragment = ListViewFragment.newInstance("", "");
                fx = getSupportFragmentManager().beginTransaction();
                fx.replace(R.id.container, mListViewFragment);
                fx.addToBackStack(null);
                fx.commit();

                break;
            case 1:
                Log.d(TAG, "case 1");
                mYourSignFragment = YourSignFragment.newInstance(0, 0);
                fx = getSupportFragmentManager().beginTransaction();
                fx.replace(R.id.container, mYourSignFragment);
                fx.addToBackStack(null);
                fx.commit();
                break;
            case 2:
                Log.d(TAG, "case 2");
                mCompatibilityFragment = CompatibilityFragment.newInstance("", "");
                fx = getSupportFragmentManager().beginTransaction();
                fx.replace(R.id.container, mCompatibilityFragment);
                fx.addToBackStack(null);
                fx.commit();
                break;
            case 3:
                Log.d(TAG, "case 3");
                mGameFragment = GameFragment.newInstance();
                fx = getSupportFragmentManager().beginTransaction();
                fx.replace(R.id.container, mGameFragment);
                fx.addToBackStack(null);
                fx.commit();
                break;
        }

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

        if (this.mNavigationDrawerFragment != null) {
            if (!mNavigationDrawerFragment.isDrawerOpen()) {
                // Only show items in the action bar relevant to this screen
                // if the drawer is not showing. Otherwise, let the drawer
                // decide what to show in the action bar.
                getMenuInflater().inflate(R.menu.main, menu);
                restoreActionBar();
                return true;
            }
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

    @Override
    public void onFragmentInteraction(int id) {
        mAboutSignFragment = AboutSignFragment.newInstance(id);
        FragmentTransaction fx = getSupportFragmentManager().beginTransaction();
        fx.replace(R.id.container, mAboutSignFragment);
        fx.addToBackStack(null);
        fx.commit();

    }

    @Override
    public void onCompatibilityFragmentInteraction() {
        mResultFragment = ResultFragment.newInstance();
        FragmentTransaction fx = getSupportFragmentManager().beginTransaction();
        fx.replace(R.id.container, mResultFragment);
        fx.addToBackStack(null);
        fx.commit();
    }

    @Override
    public void onYourSignFragmentInteraction(int sign) {
        mAboutSignFragment = AboutSignFragment.newInstance(sign);
        FragmentTransaction fx = getSupportFragmentManager().beginTransaction();
        fx.replace(R.id.container, mAboutSignFragment);
        fx.addToBackStack(null);
        fx.commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onGameFragmentInteraction() {

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

            View rootView = null;
            rootView = inflater.inflate(R.layout.fragment_main, container, false);


            switch(getArguments().getInt(ARG_SECTION_NUMBER)) {
                case 1:
                    rootView = inflater.inflate(R.layout.fragment_list_view_list, container, false);
                    break;
                case 2:
                    rootView = inflater.inflate(R.layout.fragment_your_sign, container, false);
                    break;
                case 3:
                    rootView = inflater.inflate(R.layout.fragment_compatibility, container, false);
                    break;
                case 4:
                    rootView = inflater.inflate(R.layout.fragment_game, container, false);
                    break;
            }
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
