package madelyntav.c4q.nyc.zodiac;

import android.os.CountDownTimer;
import android.widget.TextView;

/**
 * Created by c4q-madelyntavarez on 5/8/15.
 */
    public class MyCountDownTimer extends CountDownTimer {
    public TextView text;

        public MyCountDownTimer(long startTime, long interval) {
            super(startTime, interval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            text.setText("" + millisUntilFinished / 1000);
        }

        @Override
        public void onFinish() {
            text.setText("Time's up!");

        }
    }


