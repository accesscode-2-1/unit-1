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

<<<<<<< HEAD
    private Button btnStart, submit;
    private TextView textViewTime, randomMonth, randomDay;
    private Spinner months;
    private final CounterClass timer = new CounterClass(60000, 1000);
    private int counter;
    private String hms = "01:00";
=======
    Button btnStart, btnStop, submit;
    TextView textViewTime, randomMonth, randomDay;
    Spinner months;
>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500


    public void gameSetup(View view){
        btnStart = (Button) view.findViewById(R.id.btnStart);
<<<<<<< HEAD
        textViewTime = (TextView) view.findViewById(R.id.time);
        randomMonth = (TextView) view.findViewById(R.id.monthTextView);
        randomDay = (TextView) view.findViewById(R.id.dayTextView);
        months = (Spinner) view.findViewById(R.id.signSpinnerForGame);
        submit = (Button) view.findViewById(R.id.submitSpinnerForGame);

        textViewTime.setText(hms);

=======
        btnStop = (Button) view.findViewById(R.id.btnStop);
        textViewTime = (TextView) view.findViewById(R.id.time);
        randomMonth = (TextView) view.findViewById(R.id.monthTextView);
        randomDay = (TextView) view.findViewById(R.id.dayTextView);
        months = (Spinner) view.findViewById(R.id.monthSpinnerForGame);
        submit = (Button) view.findViewById(R.id.submitSpinnerForGame);

        textViewTime.setText("00:03:00");

        final CounterClass timer = new CounterClass(180000, 1000);
>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.start();
<<<<<<< HEAD
                generateRandomDate();
                submit.setEnabled(true);
                counter = 0;
                hms = "01:00";
=======
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.cancel();
>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                counter++;
=======
>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500
                checkResponse();
            }
        });

<<<<<<< HEAD
    }

    //Class for creating my timer
    public class CounterClass extends CountDownTimer {

=======

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
>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500
        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            long millis = millisUntilFinished;

<<<<<<< HEAD
            hms = String.format("%02d:%02d",
=======
            String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millis),
>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500
                    TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
                    TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));

            textViewTime.setText(hms);
        }

        @Override
        public void onFinish() {

<<<<<<< HEAD
            textViewTime.setText("00:00");
=======
            textViewTime.setText("Completed!");
>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500
        }
    }


    //Handles creating the random date for the game
    public void generateRandomDate(){
<<<<<<< HEAD
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
=======
        String[] months = getResources().getStringArray(R.array.month);
        String[] days = getResources().getStringArray(R.array.day);

        int monthNum = new Random().nextInt(months.length);
        int dayNum = new Random().nextInt(days.length);

        randomMonth.setText("Month: " + months[monthNum]);
        randomDay.setText("Day: " + dayNum);

    }

    public void checkResponse(){

        String getMonthFromRan = randomMonth.getText().toString();
>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500
        String getDayFromRan = randomDay.getText().toString().replace("Day: ","");


        int month = BirthdayZodiacFragment.convertMonth(getMonthFromRan);
        int day =Integer.parseInt(getDayFromRan);

        String zodiacSign = BirthdayZodiacFragment.findZodiacSign(month, day);

<<<<<<< HEAD
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
=======
        //Get response from spinner
        String userResponse = String.valueOf(months.getSelectedItem());

        if(zodiacSign.equals(userResponse)){
            btnStop.performClick();
            Toast.makeText(this.getActivity(),"Congratulations you got it!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this.getActivity(), zodiacSign + " " + userResponse +" Sorry, wrong answer", Toast.LENGTH_SHORT).show();
>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500
        }

    }

<<<<<<< HEAD
=======

>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500
}
