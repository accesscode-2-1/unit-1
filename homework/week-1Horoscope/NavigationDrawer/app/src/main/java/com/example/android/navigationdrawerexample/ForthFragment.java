package com.example.android.navigationdrawerexample;

import android.app.Fragment;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Yuliya Kaleda on 5/4/15.
 */
public class ForthFragment extends Fragment {

    public static final int START_IN_SECONDS = 30;
    public static final int START_TIME_MILLIS = START_IN_SECONDS * 1000;

    private static final String DATE_KEY = "date";
    private  static final String CURRENT_SECONDS_KEY = "currentSeconds";
    private static final String SUBMIT_STATE_KEY = "submitState";
    private static final String CORRECT_SIGN_KEY = "correctSign";
    private static final String FIRST_GAME_KEY = "firstGame";
    private static final String INTRO_KEY = "intro";
    private static final String VISIBILITY_KEY = "visible";
    private static final String SECONDS_TEXTVIEW_KEY = "secondsTextView";
    private static final String SIGN_RESULT_KEY = "guessResult";

    private TextView mResult;
    private TextView mTextField;
    private TextView mRandomBD;
    private TextView mIntro;
    private EditText mUserInput;
    private Button getAnswerBtn;
    private CountDownTimer myTimer;

    private String mSign;
    private String rightSign;
    private String mGuess;
    private boolean submit;
    private int mCount;
    private int rightGuesses;
    private String[] mMonths;
    private long currentSeconds;
    private boolean firstGame = true;

    Random rand = new Random();

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putCharSequence(DATE_KEY, mRandomBD.getText());
        outState.putLong(CURRENT_SECONDS_KEY, currentSeconds);
        outState.putBoolean(SUBMIT_STATE_KEY, submit);
        outState.putString(CORRECT_SIGN_KEY, mSign);
        outState.putBoolean(FIRST_GAME_KEY, firstGame);
        outState.putString(INTRO_KEY, mIntro.getText().toString());
        outState.putBoolean(VISIBILITY_KEY, submit);
        outState.putString(SECONDS_TEXTVIEW_KEY, mTextField.getText().toString());
        outState.putString(SIGN_RESULT_KEY, mResult.getText().toString());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_forth, container, false);
        submit = false;
        mCount = 0;
        rightGuesses = 0;

        mMonths = getResources().getStringArray(R.array.months);
        mRandomBD = (TextView) rootView.findViewById(R.id.random_date);
        mTextField = (TextView) rootView.findViewById(R.id.timer);
        mUserInput = (EditText) rootView.findViewById(R.id.user_input_of_sign);
        mResult = (TextView) rootView.findViewById(R.id.result);
        mIntro = (TextView) rootView.findViewById(R.id.intro);

        //create a multifunctional button
        getAnswerBtn = (Button) rootView.findViewById(R.id.go);

        //make EditText for userInput invisible
        mUserInput.setVisibility(View.GONE);

        getAnswerBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                //when the function of the button is to check the user's input
                if (submit) {

                    firstGame = false;
                    submit = false;

                    mUserInput.setVisibility(View.GONE);

                    //stop timer and clear the TextView of the timer
                    myTimer.cancel();
                    mTextField.setText("");

                    mGuess = mUserInput.getText().toString();
                    rightSign = checkResult(mSign, mGuess);

                    //display the result
                    mResult.setText(rightSign);

                    //change the text on the Button to play again
                    getAnswerBtn.setText("replay");


                    //when button is to replay the game
                } else {

                    //change the random BD
                    changeScreen();
                    myTimer = new MyTimer(START_TIME_MILLIS, 1000, mTextField);
                    myTimer.start();

                    mUserInput.setText("");
                    mIntro.setText("");

                    mResult.setText("");
                    submit = true;

                    //when the user types in a guess, change the button's name
                    getAnswerBtn.setText("check the answer");
                    mUserInput.setVisibility(View.VISIBLE);
                }
            }
        });

        if(savedInstanceState!=null) {

            firstGame = savedInstanceState.getBoolean(FIRST_GAME_KEY);
            mSign = savedInstanceState.getString(CORRECT_SIGN_KEY);
            currentSeconds = savedInstanceState.getLong(CURRENT_SECONDS_KEY);
            submit = savedInstanceState.getBoolean(SUBMIT_STATE_KEY);
            String intro = savedInstanceState.getCharSequence(INTRO_KEY).toString();
            String secondsTextView = savedInstanceState.get(SECONDS_TEXTVIEW_KEY).toString();
            String guessResult = savedInstanceState.get(SIGN_RESULT_KEY).toString();
            String randomDate = savedInstanceState.getString(DATE_KEY);

            if (submit) {
                getAnswerBtn.setText("check the answer");
                mUserInput.setVisibility(View.VISIBLE);
                myTimer = new MyTimer(currentSeconds * 1000, 1000, mTextField);
                myTimer.start();
            }
            else {
                if (firstGame) {
                    getAnswerBtn.setText("press to start");
                    mUserInput.setVisibility(View.GONE);
                }
                else {
                    getAnswerBtn.setText("replay");
                    mUserInput.setVisibility(View.GONE);
                }
            }

            mIntro.setText(intro);
            mRandomBD.setText(randomDate);
            mTextField.setText(secondsTextView);
            mResult.setText(guessResult);
        }
        return rootView;
    }


    public String checkResult(String mSign, String mGuess) {
        String rightSign;

        if (mSign.equalsIgnoreCase(mGuess)) {
            rightGuesses += 1;
            mCount += 1;

            rightSign = "You are right! You have guessed " + rightGuesses + " BDs out of " + mCount + ".";

        } else {
            mCount += 1;
            rightSign = "You are wrong. It is a " + mSign + ".";
        }

        return rightSign;
    }


    public String changeScreen() {

        //generate a random month
        int monthIdx = rand.nextInt(11) + 1;

        //generate a random day of month
        int randomDayOfMonth = randomDate(monthIdx);

        //get the right zodiac sign that corresponds to the random date
        mSign = MainActivity.displaySign(monthIdx, randomDayOfMonth);

        //display a random BD
        mRandomBD.setText("" + randomDayOfMonth + mMonths[monthIdx]);

        return mSign;
    }


    //to generate a random Date
    public int randomDate(int monthIdx) {
        int randomDay;
        if (monthIdx == 0 || monthIdx == 2 || monthIdx == 4 || monthIdx == 6 || monthIdx == 7
                || monthIdx == 9 || monthIdx == 11) {
            randomDay = rand.nextInt(31) + 1;
        } else if (monthIdx == 1) {
            randomDay = rand.nextInt(29) + 1;
        } else {
            randomDay = rand.nextInt(30) + 1;
        }

        return randomDay;
    }

    //inside another class to get access to start() after the timer reached onFinish
    public class MyTimer extends CountDownTimer{

        private TextView mTextField;

        public MyTimer (long startTime, long interval, TextView mTextField)
        {
            super(startTime, interval);
            this.mTextField = mTextField;
        }

        @Override
        public void onTick(long millisUntilFinished) {
            currentSeconds = millisUntilFinished/1000;
            mTextField.setText("seconds remaining: " + currentSeconds);
        }

        @Override
        public void onFinish() {
            mTextField.setText("done!");
            changeScreen();
            myTimer.start();
        }
    }
}

