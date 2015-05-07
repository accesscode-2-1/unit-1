package com.example.android.navigationdrawerexample;

import android.app.Fragment;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by July on 5/4/15.
 */
public class ForthFragment extends Fragment {

    public static final int START_IN_SECONDS = 30;
    public static final int START_TIME_MILLIS = START_IN_SECONDS * 1000;

    private static final String DATE_KEY = "date";
    private  static final String CURRENT_SECONDS = "current_seconds";


    Random rand = new Random();

    private EditText mUserInput;
    private TextView mResult;
    private Button getAnswerBtn;
    private View rootView;
    private TextView mTextField;
    private TextView mRandomBD;

    private CountDownTimer myTimer;

    private String mSign;
    private String rightSign;
    private String mGuess;
    private boolean submit;
    private int mCount;
    private int rightGuesses;
    private String[] mMonths;
    private long currentSeconds;


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

       // outState.putCharSequence("guess", mGuess);
        outState.putCharSequence(DATE_KEY, mRandomBD.getText());
        outState.putLong(CURRENT_SECONDS, currentSeconds);
        Log.i("on save inst", "" + currentSeconds);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Log.i("seconds", "" + currentSeconds);
        rootView = inflater.inflate(R.layout.fragment_forth, container, false);
        submit = false;
        mCount = 0;
        rightGuesses = 0;

        mMonths = getResources().getStringArray(R.array.months);
        mRandomBD = (TextView) rootView.findViewById(R.id.random_date);

        mTextField = (TextView) rootView.findViewById(R.id.timer);
        myTimer = new MyTimer(START_TIME_MILLIS, 1000, mTextField);

        mUserInput = (EditText) rootView.findViewById(R.id.user_input_of_sign);

        mResult = (TextView) rootView.findViewById(R.id.result);

        //create a multifunctional button
        getAnswerBtn = (Button) rootView.findViewById(R.id.go);

        getAnswerBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //when button is to check the user's input
                if (submit) {

                    //stop timer and clear the TextView of the timer
                    myTimer.cancel();
                    mTextField.setText("");

                    mGuess = mUserInput.getText().toString();
                    rightSign = checkResult(mSign, mGuess);

                    //display the result
                    mResult.setText(rightSign);

                    //change the text on the Button to play again
                    getAnswerBtn.setText("replay");

                    submit = false;

                    //when button is to replay the game
                } else {
                    //set a TextView and EditText
                    changeScreen();

                    myTimer.start();

                    mUserInput.setText("");

                    mResult.setText("");
                    submit = true;

                    //when the user types in a guess, change the button's name
                    getAnswerBtn.setText("check the answer");

                }
            }

        });

        if(savedInstanceState!=null) {
            //mGuess = savedInstanceState.getString("guess");
            mRandomBD.setText(savedInstanceState.getString(DATE_KEY));
            myTimer = new MyTimer(savedInstanceState.getLong(CURRENT_SECONDS), 1000, mTextField);
            mTextField.setText("seconds remaining: " + savedInstanceState.getLong(CURRENT_SECONDS));
            //myTimer.start();// = new MyTimer(savedInstanceState.getLong(CURRENT_SECONDS), 1000, mTextField);
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

