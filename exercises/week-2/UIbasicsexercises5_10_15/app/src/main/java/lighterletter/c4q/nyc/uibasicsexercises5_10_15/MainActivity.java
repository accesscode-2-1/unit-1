package lighterletter.c4q.nyc.uibasicsexercises5_10_15;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    int button1count = 0;
    int button2count = 0;
    int button3count = 0;
    int button4count = 0;
    int button5count = 0;
    int button6count = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2   = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);

        final Button buttonr1 = (Button) findViewById(R.id.buttonr1);
        final Button buttonr2 = (Button) findViewById(R.id.buttonr2);
        final Button buttonr3 = (Button) findViewById(R.id.buttonr3);

        final TextView text1 = (TextView) findViewById(R.id.textviewbutton1);
        final TextView text2 = (TextView) findViewById(R.id.textviewbutton2);
        final TextView text3 = (TextView) findViewById(R.id.textviewbutton3);

        final TextView textr1 = (TextView) findViewById(R.id.textviewbuttonr1);
        final TextView textr2 = (TextView) findViewById(R.id.textviewbuttonr2);
        final TextView textr3 = (TextView) findViewById(R.id.textviewbuttonr3);


        text1.setText(String.valueOf(button1count)); // Display initial count
        text2.setText(String.valueOf(button2count));
        text3.setText(String.valueOf(button3count));
        textr1.setText(String.valueOf(button4count));
        textr2.setText(String.valueOf(button5count));
        textr3.setText(String.valueOf(button6count));

        // Process the button on-click event via an anonymous inner class
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Counting up
                    button1count++;

                text1.setText(String.valueOf(button1count));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Counting up
                button2count++;

                text2.setText(String.valueOf(button2count));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Counting up
                button3count++;

                text3.setText(String.valueOf(button3count));
            }
        });
        buttonr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Counting up
                button4count++;

                textr1.setText(String.valueOf(button4count));
            }
        });
        buttonr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Counting up
                button5count++;

                textr2.setText(String.valueOf(button5count));
            }
        });
        buttonr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Counting up
                button6count++;

                textr3.setText(String.valueOf(button6count));
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
}
