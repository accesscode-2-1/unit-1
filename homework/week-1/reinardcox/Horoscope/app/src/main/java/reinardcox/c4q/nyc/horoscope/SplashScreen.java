package reinardcox.c4q.nyc.horoscope;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class SplashScreen extends Activity {
    protected TextView _titleScreen, _titleScreen2; // Ask about the protected vs. private

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        _titleScreen = (TextView) findViewById(R.id.displayText);
        _titleScreen2 = (TextView) findViewById(R.id.displayText2);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/ObelixProBIt-cyr.ttf");

        _titleScreen.setTypeface(typeface);
        _titleScreen2.setTypeface(typeface);

        final Intent intent = new Intent(this, HomeScreen.class);

        new CountDownTimer(2000, 1000) {
            public void onTick(long millisUntilFinished) {
                // mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                //mTextField.setText("done!");
                startActivity(intent);
                finish();
            }
        }.start();
    }
}
