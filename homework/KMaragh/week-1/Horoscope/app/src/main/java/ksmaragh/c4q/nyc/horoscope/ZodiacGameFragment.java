package ksmaragh.c4q.nyc.horoscope;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ZodiacGameFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_zodiac_game, container, false);
        gameSetup(rootView);

        return rootView;
    }

    Button btnStart, btnStop, submit;
    TextView textViewTime, randomMonth, randomDay;
    Spinner months;


    public void gameSetup(View view){
        btnStart = (Button) view.findViewById(R.id.btnStart);
        btnStop = (Button) view.findViewById(R.id.btnStop);
        textViewTime = (TextView) view.findViewById(R.id.time);
        randomMonth = (TextView) view.findViewById(R.id.monthTextView);
        randomDay = (TextView) view.findViewById(R.id.dayTextView);
        months = (Spinner) view.findViewById(R.id.monthSpinnerForGame);
        submit = (Button) view.findViewById(R.id.submitSpinnerForGame);

        textViewTime.setText("00:03:00");

        final CounterClass timer = new CounterClass(180000, 1000);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.start();
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.cancel();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkResponse();
            }
        });


        generateRandomDate();

    }

    public class CounterClass extends CountDownTimer {


        /**
         * @param millisInFuture    The number of millis in the future from the call
         *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
         *                          is called.
         * @param countDownInterval The interval along the way to receive
         *                          {@link #onTick(long)} callbacks.
         */
        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            long millis = millisUntilFinished;

            String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millis),
                    TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
                    TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));

            textViewTime.setText(hms);
        }

        @Override
        public void onFinish() {

            textViewTime.setText("Completed!");
        }
    }


    //Handles creating the random date for the game
    public void generateRandomDate(){
        String[] months = getResources().getStringArray(R.array.month);
        String[] days = getResources().getStringArray(R.array.day);

        int monthNum = new Random().nextInt(months.length);
        int dayNum = new Random().nextInt(days.length);

        randomMonth.setText("Month: " + months[monthNum]);
        randomDay.setText("Day: " + dayNum);

    }

    public void checkResponse(){

        String getMonthFromRan = randomMonth.getText().toString();
        String getDayFromRan = randomDay.getText().toString().replace("Day: ","");


        int month = BirthdayZodiacFragment.convertMonth(getMonthFromRan);
        int day =Integer.parseInt(getDayFromRan);

        String zodiacSign = BirthdayZodiacFragment.findZodiacSign(month, day);

        //Get response from spinner
        String userResponse = String.valueOf(months.getSelectedItem());

        if(zodiacSign.equals(userResponse)){
            btnStop.performClick();
            Toast.makeText(this.getActivity(),"Congratulations you got it!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this.getActivity(), zodiacSign + " " + userResponse +" Sorry, wrong answer", Toast.LENGTH_SHORT).show();
        }

    }


}
