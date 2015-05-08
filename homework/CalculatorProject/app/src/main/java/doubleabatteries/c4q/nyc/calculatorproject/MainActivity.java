package doubleabatteries.c4q.nyc.calculatorproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textview = (TextView) findViewById(R.id.textView);

        Button button7 = (Button) findViewById(R.id.seven);
        Button button8 = (Button) findViewById(R.id.eight);
        Button button9 = (Button) findViewById(R.id.nine);
        Button button4 = (Button) findViewById(R.id.four);
        Button button5 = (Button) findViewById(R.id.five);
        Button button6 = (Button) findViewById(R.id.six);
        Button button1 = (Button) findViewById(R.id.one);
        Button button2 = (Button) findViewById(R.id.two);
        Button button3 = (Button) findViewById(R.id.three);
        Button buttonParen = (Button) findViewById(R.id.parentheses);
        Button button0 = (Button) findViewById(R.id.zero);
        Button buttonDecimal = (Button) findViewById(R.id.decimal);
        Button buttonClear = (Button) findViewById(R.id.clear);
        Button buttonAdd = (Button) findViewById(R.id.add);
        Button buttonSubtract = (Button) findViewById(R.id.subtract);
        Button buttonNegative = (Button) findViewById(R.id.negative);
        Button buttonBackspace = (Button) findViewById(R.id.backspace);
        Button buttonMultiply = (Button) findViewById(R.id.multiply);
        Button buttonDivide = (Button) findViewById(R.id.divide);
        Button buttonEnter = (Button) findViewById(R.id.enter);


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.setText("7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonParen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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
