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

import com.jaellysbales.horoscope.R;

public class GuessSignFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    private int attempts = 3;
    private Spinner spinner;
    private String randDate;
    private String answer;
    private String guess;
    private TextView mTextField;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_guess_sign, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        while (attempts != 3) {
            TextView date = (TextView) view.findViewById(R.id.placeholder_date);
            date.setText(randDate);

            // Initializing spinners, adding items.
            spinner = (Spinner) view.findViewById(R.id.spinner);
            ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(GuessSignFragment.this.getActivity(),
                    R.array.sign_array, android.R.layout.simple_spinner_item);
            adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter1);

            spinner = (Spinner) view.findViewById(R.id.spinner);
            spinner.setOnItemSelectedListener(GuessSignFragment.this);
        }

        // while attempts != 3
            // display date and spinner to user
            // get spinner selection (guess)
                // if guess matches answer
                    // stop countdown
                    // notify user (toast)
                // if guess does not match answer
                    // notify user (toast)
                    // increment int attempts
            // if attempts == 3
                // display answer (toast)


        // If sign correctly guessed, stop countdown.
        // CountDownTimer.cancel();

    }

    // TODO: method -- generate random birth date (month/day)
    // TODO: assign sign of that date to answer

    public void gameTimer() {
        new CountDownTimer(5000, 1000) {

            public void onTick(long millisUntilFinished) {
               mTextField.setText("" + (millisUntilFinished / 1000));
            }

            public void onFinish() {
                mTextField.setText("Time's up!");
                // reveal answer
            }
        }.start();
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}