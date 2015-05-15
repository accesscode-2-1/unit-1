package hoshikoo.c4q.nyc.wk1_horoscope;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks,
        ChooseSignFragment.ChooseSignFragmentInteractionListener,
        CompatibiltyFragment.CompatibilityFragmentListener, EnterBirthdayFragment.EnterBirthdayFragmentListner, GameFragment.GameFragmentListener {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    private String chosenSign = null;

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

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();

        if (position == 0) {
            Fragment chooseSignFragment = ChooseSignFragment.newInstance();
            fragmentManager.beginTransaction()
                    .replace(R.id.container, chooseSignFragment)
                    .commit();

            return;
        }

        if (position == 1) {
            Fragment enterBirthdayFragment = EnterBirthdayFragment.getInstance();
            fragmentManager.beginTransaction()
                    .replace(R.id.container, enterBirthdayFragment)
                    .commit();

            return;
        }


        if (position == 2) {
            Fragment compatFragment = CompatibiltyFragment.getInstance();
            fragmentManager.beginTransaction()
                    .replace(R.id.container, compatFragment)
                    .commit();

            return;
        }

        if (position == 3) {
            Fragment gameFragment = GameFragment.getInstance();
            fragmentManager.beginTransaction()
                    .replace(R.id.container, gameFragment)
                    .commit();

            return;
        }

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
    public void onSignChosen(String sign) {
//        Toast.makeText(this, "Sign selected: " + sign, Toast.LENGTH_SHORT).show();
//        chosenSign = sign;


        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage(sign);
        builder1.setCancelable(true);
        builder1.setPositiveButton("Got it",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
//        builder1.setNegativeButton("No",
//                new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        dialog.cancel();
//                    }
//                });

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }



    @Override
    public void onCompatiblityDone(String result) {
        Toast.makeText(this, "Your compatibility is "+result, Toast.LENGTH_SHORT).show();
        TextView compatibility =(TextView)findViewById(R.id.matched_msg);
        compatibility.setText(result);
    }


    @Override
    public void onEnterBirthdayDone(String resultSign) {
        Toast.makeText(this, resultSign, Toast.LENGTH_SHORT).show();
        TextView zodiacSign =(TextView)findViewById(R.id.zodiac_sign_result);
        zodiacSign.setText(resultSign);

    }

    @Override
    public void onGameDone(final String answer, String rightWrong) {

//        new CountDownTimer(30000, 1000) {
//            TextView answerTV =(TextView)findViewById(R.id.answer);
//
//            public void onTick(long millisUntilFinished) {
//                answerTV.setText("seconds remaining: " + millisUntilFinished / 1000);
//            }
//
//            public void onFinish() {
//                answerTV.setText("Correct answer is "+answer);
//            }
//        }.start();

        Toast.makeText(this, rightWrong, Toast.LENGTH_SHORT).show();
//        TextView answerTV =(TextView)findViewById(R.id.answer);
//        answerTV.setText(answer);
        TextView rightWrongTV =(TextView)findViewById(R.id.rightWrong);
        rightWrongTV.setText(rightWrong);
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

}
