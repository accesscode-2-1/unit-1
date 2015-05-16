package nyc.c4q.anthonyfermin.horoscope;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Locale;


public class Main extends ActionBarActivity {

    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;

    private CharSequence mDrawerTitle;
    private CharSequence mTitle;
    private String[] mListTitles;

    // TODO: Add remaining fragment classes and layouts for each position in drawer
    // TODO: set up landscape layouts

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTitle = mDrawerTitle = getTitle();
        mListTitles = getResources().getStringArray(R.array.list_names_array);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        // set a custom shadow that overlays the main content when the drawer opens
        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
        // set up the drawer's list view with items and click listener
        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                R.layout.drawer_list_item, mListTitles));
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

        if (savedInstanceState == null) {
            selectItem(0);
        }

    }


//      NOTE: Causes Null pointer exception
//    @Override
//    public void setTitle(CharSequence title) {
//        mTitle = title;
//        getActionBar().setTitle(mTitle);
//    }

    /**
     * When using the ActionBarDrawerToggle, you must call it during
     * onPostCreate() and onConfigurationChanged()...
     *
     * NOTE: Causes Null pointer exception
     */

//    @Override
//    protected void onPostCreate(Bundle savedInstanceState) {
//        super.onPostCreate(savedInstanceState);
//        // Sync the toggle state after onRestoreInstanceState has occurred.
//        mDrawerToggle.syncState();
//    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggles
        mDrawerToggle.onConfigurationChanged(newConfig);
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

        switch (position) {
            case 0: fragment = new SignInfoFragment();
                    break;
            case 1: fragment = new GetSignFragment();
                    break;
            case 2: fragment = new SignCompatibilityFragment();
                    break;
            default:fragment = new SignInfoFragment();
        }

        Bundle args = new Bundle();
        args.putInt(SignInfoFragment.ARG_LIST_NUMBER, position);
        fragment.setArguments(args);

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();

        // update selected item and title, then close the drawer
        mDrawerList.setItemChecked(position, true);
        mDrawerLayout.closeDrawer(mDrawerList);
    }

    public void zodiacSelect(int zodiac){

        Fragment fragment = new SignDetailFragment();

        Bundle args = new Bundle();
        args.putInt(SignInfoFragment.ARG_LIST_NUMBER, zodiac);
        fragment.setArguments(args);

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
    }



    // passes the number 0 to 11 that corresponds to the zodiac sign contained in the button clicked
    public void signDetail(View v){
        Button button = (Button) v;
        String buttonText = (String) button.getText();
        if(buttonText.equals("")){
            return;
        }
        int zodiacNum = 0;

        String[] zodiacs = getResources().getStringArray(R.array.zodiac_names_array);

        for(int i = 0; i < zodiacs.length; i++){
            if(zodiacs[i].equalsIgnoreCase(buttonText)){
                zodiacNum = i;
            }
        }
        zodiacSelect(zodiacNum);
    }

}
