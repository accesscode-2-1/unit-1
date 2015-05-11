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

public class GuessSignFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    private boolean guessing = true;
    private int guesses = 3;
    private CountDownTimer timer;
    private Spinner spinner_guess;
    private String randomMonth = "March";
    private int randomDay = 14;
    private String answer = "Pisces";
    private TextView guessesLeft;
    private TextView mCounter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_guess_sign, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        // Initializing spinners, adding items.
        spinner_guess = (Spinner) view.findViewById(R.id.spinner_guess);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(GuessSignFragment.this.getActivity(),
                R.array.sign_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_guess.setAdapter(adapter);

        spinner_guess = (Spinner) view.findViewById(R.id.spinner_guess);
        spinner_guess.setOnItemSelectedListener(GuessSignFragment.this);

        // TODO: Update this dynamically instead of in toast.
        guessesLeft = (TextView) view.findViewById(R.id.guesses_left);
        guessesLeft.setText("Guesses remaining: " + guesses);

        TextView date = (TextView) view.findViewById(R.id.date);

        date.setText(randomMonth + " " + randomDay);

        mCounter = (TextView) view.findViewById(R.id.counter);

        // TODO: Fix all this
        // 1. Timer runs, but throws a null error in logcat.
        // 2. Timer should stop when app is interrupted.
        // 3. App crashes on correct guess
        gameTimer();


    }

    // TODO: method -- generate random birth date (month/day)
    // TODO: assign sign of that date to answer

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
//         TextView sign = (TextView) view;
//            Toast.makeText(CompatibilityFragment.this.getActivity(), sign.getText(), Toast.LENGTH_SHORT).show();

        // Validate selection
        if (pos == 0) {} // Prevent toast from appearing on view
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
//            guessing = false;
            timer.cancel();

        }
        // Incorrect guess
        else {
            guesses--;
            Toast.makeText(GuessSignFragment.this.getActivity(),
                "Try again!",
                Toast.LENGTH_SHORT).show();
            guessesLeft.setText("Guesses remaining: " + guesses);
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

    public void gameTimer() {
        new CountDownTimer(11000, 1000) {
            public void onTick(long millisUntilFinished) { //
                String seconds = String.valueOf(millisUntilFinished / 1000);
                mCounter.setText(seconds);
            }

            public void onFinish() {

                mCounter.setText("Time's up!");
            }
        }.start();
    }
}