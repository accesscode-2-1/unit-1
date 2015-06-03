package nyc.c4q.rosmaryfc.horoscopeshw20150508;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Locale;

//todo: create a submenu in navigation for sign with all signs underneath
//todo: possible to create a frag from main screen? so it won't be so blank
//

public class MainActivity extends Activity {
    private String[] mSignTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSignTitles = getResources().getStringArray(R.array.signs_array);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        // Set the adapter for the list view
        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                R.layout.drawer_list_item, mSignTitles));
        // Set the list's click listener
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

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

    /* The click listener for ListView in the navigation drawer */
    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }
    }

    private void selectItem(int position) {
        // update the menu_main content by replacing fragments
        android.app.Fragment fragment = new SignFragment();
        Bundle args = new Bundle();
        args.putInt(SignFragment.ARG_SIGN_NUMBER, position);
        fragment.setArguments(args);

        android.app.FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();

        // update selected item and title, then close the drawer
        mDrawerList.setItemChecked(position, true);
        setTitle(mSignTitles[position]);
        mDrawerLayout.closeDrawer(mDrawerList);
    }

    /**
     * Fragment that appears in the "content_frame", shows a planet
     */
    public static class SignFragment extends android.app.Fragment {
        public static final String ARG_SIGN_NUMBER = "sign_number";

        public SignFragment() {
            // Empty constructor required for fragment subclasses
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_signs, container, false);
            int i = getArguments().getInt(ARG_SIGN_NUMBER);
            String sign = getResources().getStringArray(R.array.signs_array)[i];

            int imageId = getResources().getIdentifier(sign.toLowerCase(Locale.getDefault()),
                    "drawable", getActivity().getPackageName());
            ((ImageView) rootView.findViewById(R.id.image)).setImageResource(imageId);

            //todo: would like to create a method to set string in relation to sign
            if(sign.equals("Capricorn")){
                ((TextView) rootView.findViewById(R.id.sign_info)).setText(R.string.capricorn);
            } else if(sign.equals("Aquarius")){
                ((TextView) rootView.findViewById(R.id.sign_info)).setText(R.string.aquarius);
            }else if(sign.equals("Pisces")){
                ((TextView) rootView.findViewById(R.id.sign_info)).setText(R.string.pisces);
            }else if(sign.equals("Aries")){
                ((TextView) rootView.findViewById(R.id.sign_info)).setText(R.string.aries);
            }else if(sign.equals("Taurus")){
                ((TextView) rootView.findViewById(R.id.sign_info)).setText(R.string.taurus);
            }else if(sign.equals("Gemini")){
                ((TextView) rootView.findViewById(R.id.sign_info)).setText(R.string.gemini);
            }else if(sign.equals("Cancer")){
                ((TextView) rootView.findViewById(R.id.sign_info)).setText(R.string.cancer);
            }else if(sign.equals("Leo")){
                ((TextView) rootView.findViewById(R.id.sign_info)).setText(R.string.leo);
            }else if(sign.equals("Virgo")){
                ((TextView) rootView.findViewById(R.id.sign_info)).setText(R.string.virgo);
            }else if(sign.equals("Libra")){
                ((TextView) rootView.findViewById(R.id.sign_info)).setText(R.string.libra);
            }else if(sign.equals("Scorpio")){
                ((TextView) rootView.findViewById(R.id.sign_info)).setText(R.string.scorpio);
            }else if(sign.equals("Sagittarius")){
                ((TextView) rootView.findViewById(R.id.sign_info)).setText(R.string.sagittarius);
            }
            getActivity().setTitle(sign);
            return rootView;
        }

    }

}