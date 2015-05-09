package eboves.c4q.nyc.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    EditText result;
    Button btnAdd;
    Button btnSubtract;
    Button btnMultiply;
    Button btnDivide;
    Button btnPercentage;
    Button btnEqual;
    Button btnClr;
    Button btnDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // associate editText
        result = (EditText) findViewById(R.id.editResult);

        // associate buttons
        btnAdd = (Button) findViewById(R.id.butAddition);
        btnSubtract = (Button) findViewById(R.id.butSustraction);
        btnMultiply = (Button) findViewById(R.id.butMultiply);
        btnDivide = (Button) findViewById(R.id.butDivision);
        btnPercentage = (Button) findViewById(R.id.butPorcentage);
        btnEqual = (Button) findViewById(R.id.butEquals);
        btnClr = (Button) findViewById(R.id.butClr);
        btnDot = (Button) findViewById(R.id.butDot);

        //action take place

        btnAdd.setOnClickListener(new View.OnClickListener() {

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
