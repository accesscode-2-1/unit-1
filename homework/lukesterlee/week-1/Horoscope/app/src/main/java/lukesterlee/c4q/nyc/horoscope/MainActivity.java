package lukesterlee.c4q.nyc.horoscope;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.widget.DrawerLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks, SignFragment.OnSignSelectedListener {

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

        // This is for Google AdMob ads.
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments

        Fragment fragment = new Fragment();
        Bundle args;

        switch (position) {
            case 0 :
                fragment = new SignFragment();
                args = new Bundle();
                args.putInt("position", 0);
                fragment.setArguments(args);
                break;
            case 1 :
                fragment = new FindMySignFragment();
                args = new Bundle();
                args.putInt("position", 1);
                fragment.setArguments(args);
                break;
            case 2 :
                fragment = new RomanticFragment();
                args = new Bundle();
                args.putInt("position", 2);
                fragment.setArguments(args);
                break;
            case 3 :
                fragment = new GameFragment();
                args = new Bundle();
                args.putInt("position", 3);
                fragment.setArguments(args);
                break;
        }



        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 0:
                mTitle = Data.menus[0];
                break;
            case 1:
                mTitle = Data.menus[1];
                break;
            case 2:
                mTitle = Data.menus[2];
                break;
            case 3:
                mTitle = Data.menus[3];
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

    @Override
    // When you click a sign icon, it will show the description.
    public void onSignSelected(int position) {

        DescriptionFragment description = new DescriptionFragment();
        Bundle argument = new Bundle();
        argument.putInt(DescriptionFragment.POSITION, position);
        description.setArguments(argument);

        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        transaction.replace(R.id.container, description).addToBackStack(null).commit();


    }

}
