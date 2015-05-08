package ahhhlvin.c4q.nyc.horoscopeproject;

import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class HoroscopeGame extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoscope_game);

        final TextView birthGuess = (TextView) findViewById(R.id.birthGuess);
        final TextView time = (TextView) findViewById(R.id.time);
        final TextView answer = (TextView) findViewById(R.id.answer);
        final Button button = (Button) findViewById(R.id.startGame);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new CountDownTimer(30000, 1000) {


                    public void onTick(long millisUntilFinished) {
                        time.setText("seconds remaining: " + millisUntilFinished / 1000);

                    }

                    public void onFinish() {
                        time.setText("Time is up!");
                        answer.setText("The answer was: CAPRICORN");
                    };


                }

                        .start();
                final EditText guess = (EditText) findViewById(R.id.horoscopeGuess);
                Button guessButton = (Button) findViewById(R.id.submit);

                birthGuess.setText("JANUARY 13, 1992");
                        guessButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                answer.setText(horoscopeGame(guess.getText().toString()));
                            }
                        });


            }
        });




    }


    public static String horoscopeGame(String horoscopeGuess)
    {

            if (horoscopeGuess.equalsIgnoreCase("Capricorn")) {
                return "You are correct!";
            } else {
                return "Sorry that is incorrect. \nPlease try again!";
            }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_horoscope_game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
