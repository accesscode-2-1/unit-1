package ahhhlvin.c4q.nyc.horoscopeprojectf;
import android.app.Fragment;
import android.content.res.Configuration;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {


    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    private CharSequence mTitle;
    private String[] mListTitles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mListTitles = getResources().getStringArray(R.array.titles);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        mTitle = getTitle();

        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                R.layout.drawer_list_item, mListTitles));

        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

        if (savedInstanceState == null) {
            selectItem(0);
        }

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

        if (position == 0) {
            fragment = new getHoroscope();
        } else if (position == 1) {
            fragment = new getHoroscopeSign();
        } else if (position == 2) {
            fragment = new horoscopeCompatibility();
        } else if (position == 3) {
            fragment = new horoscopeGame();
        } else {
            fragment = new getHoroscope();
        }

        Bundle args = new Bundle();
        args.putInt(getHoroscope.ARG_LIST_NUMBER, position);
        fragment.setArguments(args);


        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();


        // update selected item and title, then close the drawer
        mDrawerList.setItemChecked(position, true);
        mDrawerLayout.closeDrawer(mDrawerList);
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggles
        mDrawerToggle.onConfigurationChanged(newConfig);
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


            final TextView horoscope = (TextView) rootView.findViewById(R.id.getHoroscopeView);
            final Spinner spinner = (Spinner) rootView.findViewById(R.id.spinner);
            ArrayList<String> list2 = new ArrayList<String>();

            list2.add("Select horoscope sign");
            list2.add("Capricorn");
            list2.add("Aries");
            list2.add("Taurus");
            list2.add("Gemini");
            list2.add("Cancer");
            list2.add("Leo");
            list2.add("Libra");
            list2.add("Virgo");
            list2.add("Scorpio");
            list2.add("Sagittarius");
            list2.add("Pisces");
            list2.add("Aquarius");

            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity().getApplicationContext(),
                    android.R.layout.simple_spinner_item, list2);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);


            Button button = (Button) rootView.findViewById(R.id.getHoroscopeButton);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    horoscope.setText(Methods.getHoroscope(spinner.getSelectedItem().toString()));
                }
            });


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


            final DatePicker date = (DatePicker) rootView.findViewById(R.id.datePicker);
            TextView txt = (TextView) rootView.findViewById(R.id.txt);

            final TextView textview = (TextView) rootView.findViewById(R.id.textView);
            Button button = (Button) rootView.findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int birthMonth = date.getMonth() + 1;
                    int birthDate = date.getDayOfMonth();
                    textview.setText(Methods.getHoroscopeSign(birthMonth, birthDate));

                }
            });

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


                final Spinner spinner1 = (Spinner) rootView.findViewById(R.id.spinner1);
                ArrayList<String> list = new ArrayList<String>();

                list.add("Select horoscope sign");
                list.add("Capricorn");
                list.add("Aries");
                list.add("Taurus");
                list.add("Gemini");
                list.add("Cancer");
                list.add("Leo");
                list.add("Libra");
                list.add("Virgo");
                list.add("Scorpio");
                list.add("Sagittarius");
                list.add("Pisces");
                list.add("Aquarius");

                ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity().getApplicationContext(),
                        android.R.layout.simple_spinner_item, list);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner1.setAdapter(dataAdapter);


                final Spinner spinner2 = (Spinner) rootView.findViewById(R.id.spinner2);
                ArrayList<String> list2 = new ArrayList<String>();

                list2.add("Select horoscope sign");
                list2.add("Capricorn");
                list2.add("Aries");
                list2.add("Taurus");
                list2.add("Gemini");
                list2.add("Cancer");
                list2.add("Leo");
                list2.add("Libra");
                list2.add("Virgo");
                list2.add("Scorpio");
                list2.add("Sagittarius");
                list2.add("Pisces");
                list2.add("Aquarius");

                ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(getActivity().getApplicationContext(),
                        android.R.layout.simple_spinner_item, list2);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner2.setAdapter(dataAdapter2);


                final TextView compatibilityView = (TextView) rootView.findViewById(R.id.viewCompatibility);
                Button button = (Button) rootView.findViewById(R.id.getCompatibilityButton);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        compatibilityView.setText(Methods.returnCompatibility(spinner1.getSelectedItem().toString(), spinner2.getSelectedItem().toString()));
                    }
                });


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
                final View rootView = inflater.inflate(R.layout.fragment_horoscope_game, container, false);


                int i = getArguments().getInt(ARG_LIST_NUMBER);
                String listItem = getResources().getStringArray(R.array.titles)[i];
                getActivity().setTitle(listItem);


                final TextView birthGuess = (TextView) rootView.findViewById(R.id.birthGuess);
                final TextView time = (TextView) rootView.findViewById(R.id.time);
                final TextView answer = (TextView) rootView.findViewById(R.id.answer);
                final Button button = (Button) rootView.findViewById(R.id.startGame);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        new CountDownTimer(30000, 1000) {


                            public void onTick(long millisUntilFinished) {
                                time.setText("seconds remaining: " + millisUntilFinished / 1000);

                            }

                            public void onFinish() {
                                time.setText("Time is up!");
                                answer.setText("The answer was: CAPRICORN");
                            }

                            ;


                        }

                                .start();

                        final EditText guess = (EditText) rootView.findViewById(R.id.horoscopeGuess);
                        Button guessButton = (Button) rootView.findViewById(R.id.submit);

                        birthGuess.setText("JANUARY 13, 1992");
                        guessButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                answer.setText(Methods.horoscopeGame(guess.getText().toString()));
                            }
                        });


                    }
                });


                return rootView;
            }



        }
    }

