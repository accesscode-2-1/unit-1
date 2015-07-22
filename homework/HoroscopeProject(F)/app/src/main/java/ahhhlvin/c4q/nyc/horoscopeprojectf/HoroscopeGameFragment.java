package ahhhlvin.c4q.nyc.horoscopeprojectf;

import android.app.Fragment;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;

/**
 * Created by alvin2 on 7/18/15.
 */


public class HoroscopeGameFragment extends Fragment {
    public static final String ARG_LIST_NUMBER = "list_number";
    public static TextView time;

    public static Calendar calendar;


    public HoroscopeGameFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        //Setting up bundle to save when screen is rotated!
//                if (savedInstanceState != null) {
//                    time.setText(savedInstanceState.getString("time"));
////                    calendar.set(Calendar.MONTH, savedInstanceState.getInt("month"));
////                    calendar.set(Calendar.YEAR, savedInstanceState.getInt("year"));
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
                calendar = Calendar.getInstance();
                calendar.set(Calendar.DAY_OF_YEAR, random.nextInt(365));
                spinner.setEnabled(true);
                button.setEnabled(false);
                guessButton.setEnabled(true);
                answer.setText("");

                new CountDownTimer(30000, 1000) {


                    public void onTick(long millisUntilFinished) {
                        time.setText("00 : " + millisUntilFinished / 1000);

                    }

                    public void onFinish() {
                        time.setText("Time is up!");
                        answer.setText("The answer was:  " + Methods.getHoroscopeSign(calendar.get(calendar.MONTH) + 1, calendar.get(calendar.DAY_OF_MONTH)).toString().toUpperCase());
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

                        if (spinner.getSelectedItem().toString().equalsIgnoreCase(Methods.getHoroscopeSign(calendar.get(calendar.MONTH) + 1, calendar.get(calendar.DAY_OF_MONTH)).toString())) {
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
}

