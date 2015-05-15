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

    private Button btnStart, submit;
    private TextView textViewTime, randomMonth, randomDay;
    private Spinner months;
    private final CounterClass timer = new CounterClass(60000, 1000);
    private int counter;
    private String hms = "01:00";


    public void gameSetup(View view){
        btnStart = (Button) view.findViewById(R.id.btnStart);
        textViewTime = (TextView) view.findViewById(R.id.time);
        randomMonth = (TextView) view.findViewById(R.id.monthTextView);
        randomDay = (TextView) view.findViewById(R.id.dayTextView);
        months = (Spinner) view.findViewById(R.id.signSpinnerForGame);
        submit = (Button) view.findViewById(R.id.submitSpinnerForGame);

        textViewTime.setText(hms);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.start();
                generateRandomDate();
                submit.setEnabled(true);
                counter = 0;
                hms = "01:00";
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                checkResponse();
            }
        });

    }

    //Class for creating my timer
    public class CounterClass extends CountDownTimer {

        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            long millis = millisUntilFinished;

            hms = String.format("%02d:%02d",
                    TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
                    TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));

            textViewTime.setText(hms);
        }

        @Override
        public void onFinish() {

            textViewTime.setText("00:00");
        }
    }


    //Handles creating the random date for the game
    public void generateRandomDate(){
        String[] monthsArray = getResources().getStringArray(R.array.month);
        String[] daysArray = getResources().getStringArray(R.array.day);

        int monthNum = new Random().nextInt(monthsArray.length);
        int dayNum = new Random().nextInt(daysArray.length + 1);

        randomMonth.setText(""+monthsArray[monthNum]);
        randomDay.setText(""+dayNum);

    }

    //Checks the user response against the random date when they submit an answer
    public void checkResponse(){

        String getMonthFromRan = randomMonth.getText().toString().replace("Month: ","");
        String getDayFromRan = randomDay.getText().toString().replace("Day: ","");


        int month = BirthdayZodiacFragment.convertMonth(getMonthFromRan);
        int day =Integer.parseInt(getDayFromRan);

        String zodiacSign = BirthdayZodiacFragment.findZodiacSign(month, day);

        //Get response from spinner, if statements to tell user current guessing status
        String userResponse = String.valueOf(months.getSelectedItem());

        if(zodiacSign.equals(userResponse)){
            timer.cancel();
            Toast.makeText(this.getActivity(),"Congratulations you got it!", Toast.LENGTH_SHORT).show();
            submit.setEnabled(false);
        }

        else if(counter == 5){
            timer.cancel();
            Toast.makeText(this.getActivity(), "You ran out of tries, sorry!", Toast.LENGTH_SHORT).show();
            submit.setEnabled(false);
        }
        else{
            Toast.makeText(this.getActivity(),"Wrong answer, You have " + (5 - counter) + " tries left", Toast.LENGTH_SHORT).show();
        }

    }

}
