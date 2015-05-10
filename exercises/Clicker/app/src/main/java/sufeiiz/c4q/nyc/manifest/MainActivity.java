package sufeiiz.c4q.nyc.manifest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView total = (TextView) findViewById(R.id.total);

        Button button1 = (Button) findViewById(R.id.button1);
        TextView text1 = (TextView) findViewById(R.id.text1);
        final OnClickListener click1 = new OnClickListener(button1, text1, total);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click1.click();
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        TextView text2 = (TextView) findViewById(R.id.text2);
        final OnClickListener click2 = new OnClickListener(button2, text2, total);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click2.click();
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        TextView text3 = (TextView) findViewById(R.id.text3);
        final OnClickListener click3 = new OnClickListener(button3, text3, total);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click3.click();
            }
        });

        Button buttonr1 = (Button) findViewById(R.id.buttonr1);
        TextView textr1 = (TextView) findViewById(R.id.textr1);
        final OnClickListener clickr1 = new OnClickListener(buttonr1, textr1, total);
        buttonr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickr1.click();
            }
        });

        Button buttonr2 = (Button) findViewById(R.id.buttonr2);
        TextView textr2 = (TextView) findViewById(R.id.textr2);
        final OnClickListener clickr2 = new OnClickListener(buttonr2, textr2, total);
        buttonr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickr2.click();
            }
        });

        Button buttonr3 = (Button) findViewById(R.id.buttonr3);
        TextView textr3 = (TextView) findViewById(R.id.textr3);
        final OnClickListener clickr3 = new OnClickListener(buttonr3, textr3, total);
        buttonr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickr3.click();
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
