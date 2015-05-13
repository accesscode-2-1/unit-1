package lukesterlee.c4q.nyc.horoscope;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.List;


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerCallbacks, SignItemCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;
    private Toolbar mToolbar;
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(mToolbar);

        // This is for Google AdMob ads.
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.fragment_drawer);

        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setup(R.id.fragment_drawer, (DrawerLayout) findViewById(R.id.drawer), mToolbar);
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


    @Override
    public void onBackPressed() {
        if (mNavigationDrawerFragment.isDrawerOpen())
            mNavigationDrawerFragment.closeDrawer();
        else
            super.onBackPressed();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
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
    public void onSignItemSelected(int position) {
        DescriptionFragment description = new DescriptionFragment();
        Bundle argument = new Bundle();
        argument.putInt(DescriptionFragment.POSITION, position);
        description.setArguments(argument);

        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        transaction.replace(R.id.container, description).addToBackStack(null).commit();
    }

    public void onSectionAttached(int number) {


        switch (number) {
            case 0:
                mTitle = getString(R.string.menu0);
                break;
            case 1:
                mTitle = getString(R.string.menu1);
                break;
            case 2:
                mTitle = getString(R.string.menu2);
                break;
            case 3:
                mTitle = getString(R.string.menu3);
        }
    }
}
