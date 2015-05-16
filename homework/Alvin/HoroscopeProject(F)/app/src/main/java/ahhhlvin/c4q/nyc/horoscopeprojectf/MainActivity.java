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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;


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

            list2.add("Select your horoscope sign");
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


                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner2.setAdapter(dataAdapter);


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
            public static TextView time;
            public static Calendar calendar;

            public horoscopeGame() {
                // Empty constructor required for fragment subclasses
            }

            @Override
            public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                     Bundle savedInstanceState) {


                //Setting up bundle to save when screen is rotated!
//                if (savedInstanceState != null) {
//                    time.setText(savedInstanceState.getString("time"));
//                    calendar.set(Calendar.MONTH, savedInstanceState.getInt("month"));
//                    calendar.set(Calendar.YEAR, savedInstanceState.getInt("year"));
//                }

                // this is the default screen that opens when the app is opened up
                final View rootView = inflater.inflate(R.layout.fragment_horoscope_game, container, false);





                int i = getArguments().getInt(ARG_LIST_NUMBER);
                String listItem = getResources().getStringArray(R.array.titles)[i];
                getActivity().setTitle(listItem);



                final TextView instructions = (TextView) rootView.findViewById(R.id.instructions);
                final TextView birthGuess = (TextView) rootView.findViewById(R.id.birthGuess);
                final TextView time = (TextView) rootView.findViewById(R.id.time);
                final TextView answer = (TextView) rootView.findViewById(R.id.answer);
                final Button button = (Button) rootView.findViewById(R.id.startGame);
                final Button guessButton = (Button) rootView.findViewById(R.id.submit);


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


                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        instructions.setVisibility(View.INVISIBLE);
                        Random random = new Random();
                        final Calendar calendar = Calendar.getInstance();
                        calendar.set(Calendar.DAY_OF_YEAR, random.nextInt(365));
                        spinner.setEnabled(true);
                        button.setEnabled(false);
                        guessButton.setEnabled(true);

                        new CountDownTimer(30000, 1000) {


                            public void onTick(long millisUntilFinished) {
                                time.setText("00 : " + millisUntilFinished / 1000);

                            }

                            public void onFinish() {
                                time.setText("Time is up!");
                                answer.setText("The answer was:  " + Methods.getHoroscopeSign(calendar.MONTH, calendar.DAY_OF_MONTH).toString().toUpperCase());
                                button.setEnabled(true);
                                spinner.setEnabled(false);
                                guessButton.setEnabled(false);
                            }

                            ;


                        }

                                .start();

                        spinner.setVisibility(View.VISIBLE);
                        guessButton.setVisibility(View.VISIBLE);


                        birthGuess.setText(calendar.getDisplayName(calendar.MONTH, calendar.LONG, Locale.ENGLISH) + " " + calendar.get(calendar.DATE) + ", " + calendar.get(calendar.YEAR));
                        guessButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                    if (spinner.getSelectedItem().toString().equalsIgnoreCase(Methods.getHoroscopeSign(calendar.MONTH, calendar.DAY_OF_MONTH))) {
                                        answer.setText("You are correct!");
                                    } else {
                                        answer.setText("Sorry that is incorrect. \nPlease try again!");
                                    }

                            }
                        });


                    }
                });




                return rootView;
            }


//            @Override
//            public void onSaveInstanceState(Bundle outState) {
//                outState.putString("time", time.getText().toString());
//                outState.putString("month", calendar.getDisplayName(calendar.MONTH, calendar.LONG, Locale.ENGLISH));
//                outState.putInt("date", calendar.get(calendar.DATE));
//                outState.putInt("year", calendar.get(calendar.YEAR));
//
//                super.onSaveInstanceState(outState);
//            }








        }


    }

