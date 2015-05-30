package reinardcox.c4q.nyc.horoscope;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class Splash_Activity extends Activity {
    protected TextView _mainTitle, _authorTitle; // Ask about the protected vs. private

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        _mainTitle = (TextView) findViewById(R.id.main_title);
        _authorTitle = (TextView) findViewById(R.id.author_title);

        //This imports the custom font being used.
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/ObelixProBIt-cyr.ttf");

        //Apply the font to the TextView
        _mainTitle.setTypeface(typeface);
        _authorTitle.setTypeface(typeface);

        final Intent intent = new Intent(this, Home_Activity.class);

        new CountDownTimer(2000, 1000) {
            public void onTick(long millisUntilFinished) {
                // mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                startActivity(intent);
                finish();
            }
        }.start();
    }
}
