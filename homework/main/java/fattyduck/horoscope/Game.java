package fattyduck.horoscope;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import junit.framework.Test;

import org.w3c.dom.Text;

import java.util.concurrent.TimeUnit;


public class Game extends ActionBarActivity {

    Button start =(Button) findViewById(R.id.startButton);
    Button yes=(Button)findViewById(R.id.yesButton);
    Button no=(Button)findViewById(R.id.noButton);
    TextView timer = (TextView) findViewById(R.id.timerview);
    TextView answer = (TextView) findViewById(R.id.answerview);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        timer.setText("00:30:00");

        final CounterClass tima = new CounterClass(18000,1000);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tima.start();
            }
        });

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tima.cancel();
                answer.setText("Wrong answer");

            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tima.cancel();
                answer.setText("Correct");
            }
        });
    }

    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    @SuppressLint("NewApi")

    public class CounterClass extends CountDownTimer{
        public CounterClass(long millisInFuture, long countDownInterval){
            super(millisInFuture, countDownInterval);
        }
        @Override
        public void onTick(long millisUntilFinished) {
            long millis = millisUntilFinished;
            String hms = String.format("%02d,%02d,%02d", TimeUnit.MILLISECONDS.toHours(millis),
                    TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours((millis))),
                    TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(millis));
            timer.setText(hms);
        }

        @Override
        public void onFinish() {

        }
    }


}