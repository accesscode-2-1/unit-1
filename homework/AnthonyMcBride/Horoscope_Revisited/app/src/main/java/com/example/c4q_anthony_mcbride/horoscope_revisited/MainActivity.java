package com.example.c4q_anthony_mcbride.horoscope_revisited;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    public EditText userDOB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userDOB = (EditText) findViewById(R.id.userbday);
        userDOB.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    userSign(v);
                    return true;
                }
                return false;
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mainactivity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.navigator) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void showScorpioInfo(View v) {
        Intent intent = new Intent(MainActivity.this, Scorpio.class);
        startActivity(intent);
    }

    public void showAriesInfo(View v) {
        Intent intent = new Intent(MainActivity.this, Aries.class);
        startActivity(intent);
    }


    public void showAquariusInfo(View v) {
        Intent intent = new Intent(MainActivity.this, Aquarius.class);
        startActivity(intent);
    }

    public void showCancerInfo(View v) {
        Intent intent = new Intent(MainActivity.this, Cancer.class);
        startActivity(intent);
    }

    public void showCapricornInfo(View v) {
        Intent intent = new Intent(MainActivity.this, Capricorn.class);
        startActivity(intent);
    }

    public void showGeminiInfo(View v) {
        Intent intent = new Intent(MainActivity.this, Gemini.class);
        startActivity(intent);
    }

    public void showLeoInfo(View v) {
        Intent intent = new Intent(MainActivity.this, Leo.class);
        startActivity(intent);
    }

    public void showLibraInfo(View v) {
        Intent intent = new Intent(MainActivity.this, Libra.class);
        startActivity(intent);
    }

    public void showPiscesInfo(View v) {
        Intent intent = new Intent(MainActivity.this, Pisces.class);
        startActivity(intent);
    }

    public void showSagittariusInfo(View v) {
        Intent intent = new Intent(MainActivity.this, Sagittarius.class);
        startActivity(intent);
    }

    public void showTaurusInfo(View v) {
        Intent intent = new Intent(MainActivity.this, Taurus.class);
        startActivity(intent);
    }

    public void showVirgoInfo(View v) {
        Intent intent = new Intent(MainActivity.this, Virgo.class);
        startActivity(intent);
    }

    public void playGame(View v) {
        Intent intent = new Intent(MainActivity.this, GameOfStars.class);
        startActivity(intent);
    }


    public void userSign(View v) {
        String birthDateInput = userDOB.getText().toString();
        String month = birthDateInput.substring(0, 2);
        String day = birthDateInput.substring(3, 5);


        int numMonth = Integer.parseInt(month);
        int numDay = Integer.parseInt(day);

        if (numMonth == 1 && numDay >= 18) {
            Intent intent = new Intent(MainActivity.this, Aquarius.class);
            startActivity(intent);
        } else if (numMonth == 2 && numDay <= 20) {
            Intent intent = new Intent(MainActivity.this, Aquarius.class);
            startActivity(intent);

        } else if (numMonth == 2 && numDay >= 21) {
            Intent intent = new Intent(MainActivity.this, Pisces.class);
            startActivity(intent);

        } else if (numMonth == 3 && numDay <= 20) {
            Intent intent = new Intent(MainActivity.this, Pisces.class);
            startActivity(intent);

        } else if (numMonth == 3 && numDay >= 21) {
            Intent intent = new Intent(MainActivity.this, Aries.class);
            startActivity(intent);

        } else if (numMonth == 4 && numDay <= 19) {
            Intent intent = new Intent(MainActivity.this, Aries.class);
            startActivity(intent);

        } else if (numMonth == 4 && numDay >= 20) {
            Intent intent = new Intent(MainActivity.this, Taurus.class);
            startActivity(intent);

        } else if (numMonth == 5 && numDay <= 20) {
            Intent intent = new Intent(MainActivity.this, Taurus.class);
            startActivity(intent);

        } else if (numMonth == 5 && numDay >= 21) {
            Intent intent = new Intent(MainActivity.this, Gemini.class);
            startActivity(intent);

        } else if (numMonth == 6 && numDay <= 21) {
            Intent intent = new Intent(MainActivity.this, Gemini.class);
            startActivity(intent);

        } else if (numMonth == 6 && numDay >= 22) {
            Intent intent = new Intent(MainActivity.this, Cancer.class);
            startActivity(intent);

        } else if (numMonth == 7 && numDay <= 23) {
            Intent intent = new Intent(MainActivity.this, Cancer.class);
            startActivity(intent);

        } else if (numMonth == 7 && numDay >= 24) {
            Intent intent = new Intent(MainActivity.this, Leo.class);
            startActivity(intent);

        } else if (numMonth == 8 && numDay <= 27) {
            Intent intent = new Intent(MainActivity.this, Leo.class);
            startActivity(intent);

        } else if (numMonth == 8 && numDay >= 28) {
            Intent intent = new Intent(MainActivity.this, Virgo.class);
            startActivity(intent);

        } else if (numMonth == 9 && numDay <= 23) {
            Intent intent = new Intent(MainActivity.this, Virgo.class);
            startActivity(intent);

        } else if (numMonth == 9 && numDay >= 24) {
            Intent intent = new Intent(MainActivity.this, Libra.class);
            startActivity(intent);

        } else if (numMonth == 10 && numDay <= 23) {
            Intent intent = new Intent(MainActivity.this, Libra.class);
            startActivity(intent);

        } else if (numMonth == 10 && numDay >= 24) {
            Intent intent = new Intent(MainActivity.this, Scorpio.class);
            startActivity(intent);

        } else if (numMonth == 11 && numDay <= 20) {
            Intent intent2 = new Intent(MainActivity.this, Scorpio.class);
            startActivity(intent2);

        } else if (numMonth == 11 && numDay >= 21) {
            Intent intent = new Intent(MainActivity.this, Sagittarius.class);
            startActivity(intent);

        } else if (numMonth == 12 && numDay <= 22) {
            Intent intent = new Intent(MainActivity.this, Sagittarius.class);
            startActivity(intent);

        } else {
            Intent intent = new Intent(MainActivity.this, Capricorn.class);
            startActivity(intent);
        }
    }
}
