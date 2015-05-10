package ahhhlvin.c4q.nyc.horoscopeproject;

import android.app.Fragment;
import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;



public class MainActivity2 extends ActionBarActivity {


    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title = (TextView) findViewById(R.id.textView2);
        title.setText("horoscope \nit \nout.");


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        mTitle = getTitle();


        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

        if (savedInstanceState == null) {
            selectItem(0);
        }


    }


    private void selectItem(int position) {
        // update the main content by replacing fragments
        Fragment fragment;

        if (position == 0) {
            fragment = new getHoroscope();
        } else if (position == 1) {
            fragment = new getHoroscopeSign();
        } else if (position == 2) {
            fragment = new horoscopeCompatibility();
        } else {
            fragment = new horoscopeGame();
        }

        Bundle args = new Bundle();
        args.putInt(getHoroscope.ARG_LIST_NUMBER, position);
        fragment.setArguments(args);


        Bundle args2 = new Bundle();
        args.putInt(getHoroscopeSign.ARG_LIST_NUMBER, position);
        fragment.setArguments(args2);


        Bundle args3 = new Bundle();
        args.putInt(horoscopeCompatibility.ARG_LIST_NUMBER, position);
        fragment.setArguments(args3);


        Bundle args4 = new Bundle();
        args.putInt(horoscopeGame.ARG_LIST_NUMBER, position);
        fragment.setArguments(args4);

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();


        // update selected item and title, then close the drawer
        mDrawerList.setItemChecked(position, true);
        mDrawerLayout.closeDrawer(R.id.drawer_layout);
    }


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


    public static class getHoroscope extends Fragment {
        public static final String ARG_LIST_NUMBER = "list_number";

        public getHoroscope() {
            // Empty constructor required for fragment subclasses
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // this is the default screen that opens when the app is opened up
            View rootView = inflater.inflate(R.layout.fragment_get_horoscope, container, false);


            int i = getArguments().getInt(ARG_LIST_NUMBER);
            String listItem = getResources().getStringArray(R.array.titles)[i];
            getActivity().setTitle(listItem);

            return rootView;
        }
    }


    public static class getHoroscopeSign extends Fragment {
        public static final String ARG_LIST_NUMBER = "list_number";

        public getHoroscopeSign() {
            // Empty constructor required for fragment subclasses
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // this is the default screen that opens when the app is opened up
            View rootView = inflater.inflate(R.layout.fragment_get_horoscope_sign, container, false);


            int i = getArguments().getInt(ARG_LIST_NUMBER);
            String listItem = getResources().getStringArray(R.array.titles)[i];
            getActivity().setTitle(listItem);

            return rootView;
        }
    }


    public static class horoscopeCompatibility extends Fragment {
        public static final String ARG_LIST_NUMBER = "list_number";

        public horoscopeCompatibility() {
            // Empty constructor required for fragment subclasses
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // this is the default screen that opens when the app is opened up
            View rootView = inflater.inflate(R.layout.fragment_horoscope_compatibility, container, false);


            int i = getArguments().getInt(ARG_LIST_NUMBER);
            String listItem = getResources().getStringArray(R.array.titles)[i];
            getActivity().setTitle(listItem);

            return rootView;
        }
    }


    public static class horoscopeGame extends Fragment {
        public static final String ARG_LIST_NUMBER = "list_number";

        public horoscopeGame() {
            // Empty constructor required for fragment subclasses
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // this is the default screen that opens when the app is opened up
            View rootView = inflater.inflate(R.layout.fragment_horoscope_game, container, false);


            int i = getArguments().getInt(ARG_LIST_NUMBER);
            String listItem = getResources().getStringArray(R.array.titles)[i];
            getActivity().setTitle(listItem);

            return rootView;
        }
    }
}