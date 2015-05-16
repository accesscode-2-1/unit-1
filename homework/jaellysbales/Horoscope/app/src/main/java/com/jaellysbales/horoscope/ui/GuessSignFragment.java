package com.jaellysbales.horoscope.ui;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.jaellysbales.horoscope.R;

import java.util.Random;

public class GuessSignFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    private CountDownTimer gameTimer;
    private int guesses = 3;
    private Spinner spinner_guess;
    private String answer = "";
    private TextView guessesLeft;
    private TextView mCounter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_guess_sign, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // Set up spinners.
        spinners(view);

        // Calling getGameData() to generate date and sign for game.
        // Tried to get this to contiously generate until player says stop, but not enough time.
        String[] gameData = getGameData();
        int month = Integer.parseInt(gameData[0]);
        int day = Integer.parseInt(gameData[1]);
        answer = gameData[2];
        String monthName = getMonthName(month); // Int to String (Ex: 1 -> "January")

        // Setting up text views and timer
        TextView date = (TextView) view.findViewById(R.id.date);
        date.setText(monthName + " " + day);

        guessesLeft = (TextView) view.findViewById(R.id.guesses_left);
        guessesLeft.setText("Guesses remaining: " + guesses);

        mCounter = (TextView) view.findViewById(R.id.counter);

        setGameTimer();
    }

    public String[] getGameData() {
        Random rand = new Random();
        int month = rand.nextInt(12) + 1;
        int day;
        String answer = "";

        // Generating day int based on month
        if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) {
            day = rand.nextInt(31) + 1;
        }
        else if (month == 2) {
            day = rand.nextInt(28) + 1;
        }
        else {
            day = rand.nextInt(30) + 1;
        }

        // Assign answer (sign) based on generated date
        if (month == 1) {
            if (day <= 20) {
                answer = "Capricorn";
            }
            else {
                answer = "Aquarius";
            }
        }
        else if (month == 2) {
            if (day <= 21) {
                answer = "Aquarius";
            }
            else {
                answer = "Pisces";
            }
        }
        else if (month == 3) {
            if (day <= 20) {
                answer = "Pisces";
            }
            else {
                answer = "Aries";
            }
        }
        else if (month == 4) {
            if (day <= 19) {
                answer = "Aries";
            }
            else {
                answer = "Taurus";
            }
        }
        else if (month == 5) {
            if (day <= 20) {
                answer = "Taurus";
            }
            else {
                answer = "Gemini";
            }
        }
        else if (month == 6) {
            if (day <= 21) {
                answer = "Gemini";
            }
            else {
                answer = "Cancer";
            }
        }
        else if (month == 7) {
            if (day <= 22) {
                answer = "Cancer";
            }
            else {
                answer = "Leo";
            }
        }
        else if (month == 8) {
            if (day <= 22) {
                answer = "Leo";
            }
            else {
                answer = "Virgo";
            }
        }
        else if (month == 9) {
            if (day <= 22) {
                answer = "Virgo";
            }
            else {
                answer = "Libra";
            }
        }
        else if (month == 10) {
            if (day <= 23) {
                answer = "Libra";
            }
            else {
                answer = "Scorpio";
            }
        }
        else if (month == 11) {
            if (day <= 20) {
                answer = "Scorpio";
            }
            else {
                answer = "Sagittarius";
            }
        }
        else if (month == 12) {
            if (day <= 22) {
                answer = "Sagittarius";
            }
            else {
                answer = "Capricorn";
            }
        }

        String[] randomDate = {String.valueOf(month), String.valueOf(day), answer};
        return randomDate;
    }

    public String getMonthName(int month) {
        String monthName = "";
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July",
                               "August", "September", "October", "November", "December"};
        monthName = monthNames[month - 1];

        return monthName;
    }

    // TODO: Pause timer when app is interrupted?
    public void setGameTimer() {
        // Initialize timer and begin countdown
        gameTimer = new CountDownTimer(11000, 1000) {
            public void onTick(long millisUntilFinished) { //
                String seconds = String.valueOf(millisUntilFinished / 1000);
                mCounter.setText(seconds);
            }

            public void onFinish() {

                // TODO: make this display the symbol, too!
                mCounter.setText(answer);
                spinner_guess.setEnabled(false);
            }
        }.start();
    }

    public void spinners(View view) {
        spinner_guess = (Spinner) view.findViewById(R.id.spinner_guess);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(GuessSignFragment.this.getActivity(),
                R.array.sign_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_guess.setAdapter(adapter);

        spinner_guess = (Spinner) view.findViewById(R.id.spinner_guess);
        spinner_guess.setOnItemSelectedListener(GuessSignFragment.this);
    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        processChoice(pos);
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

    public void processChoice(int pos) {
        // Validate selection
        if (pos == 0) {
        } // Prevent toast from appearing on view
        else if (spinner_guess.getSelectedItem().equals("Sign")) {
            Toast.makeText(GuessSignFragment.this.getActivity(),
                    "Please select a sign.",
                    Toast.LENGTH_SHORT).show();
        }

        // Correct guess
        else if (spinner_guess.getSelectedItem().equals(answer)) {
            Toast.makeText(GuessSignFragment.this.getActivity(),
                    "That's right!",
                    Toast.LENGTH_SHORT).show();

            // Disable spinner and stop timer
            spinner_guess.setEnabled(false);

            if (gameTimer != null) {
                gameTimer.cancel();
                gameTimer = null;
            }
        }

        // Incorrect guess
        else {
            guesses--;
            guessesLeft.setText("Guesses remaining: " + guesses);
            if (guesses > 0) {
                Toast.makeText(GuessSignFragment.this.getActivity(),
                        "Try again!",
                        Toast.LENGTH_SHORT).show();
            }
            else if (guesses == 1) {
                Toast.makeText(GuessSignFragment.this.getActivity(),
                        "sign-related hint here",
                        Toast.LENGTH_SHORT).show();
            }
            else {
                spinner_guess.setEnabled(false);
            }
        }
    }
}