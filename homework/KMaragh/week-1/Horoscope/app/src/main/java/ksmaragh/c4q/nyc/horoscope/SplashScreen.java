package ksmaragh.c4q.nyc.horoscope;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread splashScreen = new Thread() {

            @Override
            public void run() {
                try {
                    super.run();
                    sleep(3000);  //Delay of 3 seconds
                } catch (Exception e) {

                } finally {

                    Intent mainActivityIntent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(mainActivityIntent);
                    finish();
                }
            }
        };

        splashScreen.start();
    }

}
