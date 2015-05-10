package com.example.c4q_raynaldie.horoscope4;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    public EditText userbday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userbday = (EditText) findViewById(R.id.userbday);
        userbday.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if(actionId == EditorInfo.IME_ACTION_DONE) {
                //if(event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                    findUserSign(v);
                    return true;
                }
                return false;
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void showScorpioInfo(View v) {
        Intent intent = new Intent(MainActivity.this, ScorpioActivity.class);
        startActivity(intent);
    }

    public void showAriesInfo(View v) {
        Intent intent = new Intent(MainActivity.this, AriesActivity.class);
        startActivity(intent);
    }


    public void showAquariusInfo(View v) {
        Intent intent = new Intent(MainActivity.this, AquariusActivity.class);
        startActivity(intent);
    }

    public void showCancerInfo(View v) {
        Intent intent = new Intent(MainActivity.this, CancerActivity.class);
        startActivity(intent);
    }
    public void showCapricornInfo(View v) {
        Intent intent = new Intent(MainActivity.this, CapricornActivity.class);
        startActivity(intent);
    }

    public void showGeminiInfo(View v) {
        Intent intent = new Intent(MainActivity.this, GeminiActivity.class);
        startActivity(intent);
    }
    public void showLeoInfo(View v) {
        Intent intent = new Intent(MainActivity.this, LeoActivity.class);
        startActivity(intent);
    }

    public void showLibraInfo(View v) {
        Intent intent = new Intent(MainActivity.this, LibraActivity.class);
        startActivity(intent);
    }
    public void showPiscesInfo(View v) {
        Intent intent = new Intent(MainActivity.this, PiscesActivity.class);
        startActivity(intent);
    }

    public void showSagittariusInfo(View v) {
        Intent intent = new Intent(MainActivity.this, SagittariusActivity.class);
        startActivity(intent);
    }
    public void showTaurusInfo(View v) {
        Intent intent = new Intent(MainActivity.this, TaurusActivity.class);
        startActivity(intent);
    }

    public void showVirgoInfo(View v) {
        Intent intent = new Intent(MainActivity.this, VirgoActivity.class);
        startActivity(intent);
    }

    public void playGame(View v) {
        Intent intent = new Intent(MainActivity.this, Game.class);
        startActivity(intent);
    }


    public void findUserSign (View v) {
        String userbdayText = userbday.getText().toString();
        Log.d("userbday", userbdayText);
        String month = userbdayText.substring(0, 2);
        Log.d("month", month);
        String day = userbdayText.substring(3, 5);
        Log.d("day", day);


        int monthInt = Integer.parseInt(month);
        int bdayInt = Integer.parseInt(day);

        if (monthInt == 1 && bdayInt >= 21) {
            Intent intent = new Intent(MainActivity.this, AquariusActivity.class);
            startActivity(intent);
        } else if (monthInt == 2 && bdayInt <= 19) {
            Intent intent = new Intent(MainActivity.this, AquariusActivity.class);
            startActivity(intent);

        } else if (monthInt == 2 && bdayInt >= 21) {
            Intent intent = new Intent(MainActivity.this, PiscesActivity.class);
            startActivity(intent);

        } else if (monthInt == 3 && bdayInt <= 19) {
            Intent intent = new Intent(MainActivity.this, PiscesActivity.class);
            startActivity(intent);

        } else if (monthInt == 3 && bdayInt >= 21) {
            Intent intent = new Intent(MainActivity.this, AriesActivity.class);
            startActivity(intent);

        } else if (monthInt == 4 && bdayInt <= 19) {
            Intent intent = new Intent(MainActivity.this, AriesActivity.class);
            startActivity(intent);

        } else if (monthInt == 4 && bdayInt >= 20) {
            Intent intent = new Intent(MainActivity.this, TaurusActivity.class);
            startActivity(intent);

        } else if (monthInt == 5 && bdayInt <= 20) {
            Intent intent = new Intent(MainActivity.this, TaurusActivity.class);
            startActivity(intent);

        } else if (monthInt == 5 && bdayInt >= 21) {
            Intent intent = new Intent(MainActivity.this, GeminiActivity.class);
            startActivity(intent);

        } else if (monthInt == 6 && bdayInt <= 21) {
            Intent intent = new Intent(MainActivity.this, GeminiActivity.class);
            startActivity(intent);

        } else if (monthInt == 6 && bdayInt >= 22) {
            Intent intent = new Intent(MainActivity.this, CancerActivity.class);
            startActivity(intent);

        } else if (monthInt == 7 && bdayInt <= 22) {
            Intent intent = new Intent(MainActivity.this, CancerActivity.class);
            startActivity(intent);

        } else if (monthInt == 7 && bdayInt >= 23) {
            Intent intent = new Intent(MainActivity.this, LeoActivity.class);
            startActivity(intent);

        } else if (monthInt == 8 && bdayInt <= 22) {
            Intent intent = new Intent(MainActivity.this, LeoActivity.class);
            startActivity(intent);

        } else if (monthInt == 8 && bdayInt >= 23) {
            Intent intent = new Intent(MainActivity.this, VirgoActivity.class);
            startActivity(intent);

        } else if (monthInt == 9 && bdayInt <= 22) {
            Intent intent = new Intent(MainActivity.this, VirgoActivity.class);
            startActivity(intent);

        } else if (monthInt == 9 && bdayInt >= 23) {
            Intent intent = new Intent(MainActivity.this, LibraActivity.class);
            startActivity(intent);

        } else if (monthInt == 10 && bdayInt <= 22) {
            Intent intent = new Intent(MainActivity.this, LibraActivity.class);
            startActivity(intent);

        } else if (monthInt == 10 && bdayInt >= 23) {
            Intent intent = new Intent(MainActivity.this, ScorpioActivity.class);
            startActivity(intent);

        } else if (monthInt == 11 && bdayInt <= 21) {
            Intent intent2 = new Intent(MainActivity.this, ScorpioActivity.class);
            startActivity(intent2);

        }else if (monthInt == 11 && bdayInt >= 22){
            Intent intent = new Intent(MainActivity.this, SagittariusActivity.class);
            startActivity(intent);

        }else if (monthInt == 12 && bdayInt <= 19){
            Intent intent = new Intent(MainActivity.this, SagittariusActivity.class);
            startActivity(intent);

        }
        else
        {
            Intent intent = new Intent(MainActivity.this, CapricornActivity.class);
            startActivity(intent);
        }
    }
}
