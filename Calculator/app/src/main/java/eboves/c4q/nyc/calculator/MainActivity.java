package eboves.c4q.nyc.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private Button butSum;
    private Button butSub;
    private Button butMult;
    private Button butDiv;
    private Button butPercent;
    private Button butEquals;
    private Button butClr;
    private Button butDot;
    private Button but0;
    private Button but1;
    private Button but2;
    private Button but3;
    private Button but4;
    private Button but5;
    private Button but6;
    private Button but7;
    private Button but8;
    private Button but9;
    private String string;

    private TextView result;
    private float saveText;
    private String operators;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        int idsList[] = {
//                R.id.but0,
//                R.id.but1,
//                R.id.but2,
//                R.id.but3,
//                R.id.but4,
//                R.id.but5,
//                R.id.but6,
//                R.id.but7,
//                R.id.but8,
//                R.id.but9,
//                R.id.butSub,
//                R.id.butSum,
//                R.id.butMult,
//                R.id.butDelete,
//                R.id.butDot,
//                R.id.butDiv,
//                R.id.butEquals,
//                R.id.butClr,};
//
//        for (int id: idsList)

//        // associate buttons
//        butSum = (Button) findViewById(R.id.butSum);
//        butSub = (Button) findViewById(R.id.butSub);
//        butMult = (Button) findViewById(R.id.butMult);
//        butDiv = (Button) findViewById(R.id.butDiv);
//        butEquals = (Button) findViewById(R.id.butEquals);
//        butClr = (Button) findViewById(R.id.butClr);
//        butDot = (Button) findViewById(R.id.butDot);
//
//        // association numbers
//        but0 = (Button) findViewById(R.id.but0);
//        but0.setOnClickListener((View.OnClickListener) but0);
//
//        but1 = (Button) findViewById(R.id.but1);
//        but2 = (Button) findViewById(R.id.but2);
//        but3 = (Button) findViewById(R.id.but3);
//        but4 = (Button) findViewById(R.id.but4);
//        but5 = (Button) findViewById(R.id.but5);
//        but6 = (Button) findViewById(R.id.but6);
//        but7 = (Button) findViewById(R.id.but7);
//        but8 = (Button) findViewById(R.id.but8);
//        but9 = (Button) findViewById(R.id.but9);

    }
//
//    public void onClickNumbers(){
//
//
//        but1.setOnClickListener((View.OnClickListener) but1);
//        but2.setOnClickListener((View.OnClickListener) but2);
//        but3.setOnClickListener((View.OnClickListener) but3);
//        but4.setOnClickListener((View.OnClickListener) but4);
//        but5.setOnClickListener((View.OnClickListener) but5);
//        but6.setOnClickListener((View.OnClickListener) but6);
//        but7.setOnClickListener((View.OnClickListener) but7);
//        but8.setOnClickListener((View.OnClickListener) but8);
//        but9.setOnClickListener((View.OnClickListener) but9);
//
//    }
//
//    public void operationsSigns(){
//
//        butSum.setOnClickListener((View.OnClickListener) butSum);
//        butSub.setOnClickListener((View.OnClickListener) butSub);
//        butMult.setOnClickListener((View.OnClickListener) butMult);
//        butDiv.setOnClickListener((View.OnClickListener) butDiv);
//        butEquals.setOnClickListener((View.OnClickListener) butEquals);
//        butClr.setOnClickListener((View.OnClickListener) butClr);
//        butDot.setOnClickListener((View.OnClickListener) butDot);
//
//    }
//
//    public void onClick(View view){
//
//        // associate editText
//        TextView result = (TextView) findViewById(R.id.textResult1);
//        int click = view.getId();
//        String showOnScreen = result.getText().toString();
//
//        try {
//
//        switch (click) {
//
//                case R.id.but0:
//                    result.setText(showOnScreen+ "0");
//                    break;
//                case R.id.but1:
//                    result.setText(showOnScreen+ "1");
//                    break;
//                case R.id.but2:
//                    result.setText(showOnScreen+ "2");
//                    break;
//                case R.id.but3:
//                    result.setText(showOnScreen+ "3");
//                    break;
//                case R.id.but4:
//                    result.setText(showOnScreen+ "4");
//                    break;
//                case R.id.but5:
//                    result.setText(showOnScreen+ "5");
//                    break;
//                case R.id.but6:
//                    result.setText(showOnScreen+ "6");
//                    break;
//                case R.id.but7:
//                    result.setText(showOnScreen+ "7");
//                    break;
//                case R.id.but8:
//                    result.setText(showOnScreen+ "8");
//                    break;
//                case R.id.but9:
//                    result.setText(showOnScreen+ "9");
//                    break;
//                case R.id.butSum:
//                    break;
//                case R.id.butSub:
//                    break;
//                case R.id.butMult:
//                    break;
//                case R.id.butDiv:
//                    break;
//                case R.id.butDelete:
//                    break;
//                case R.id.butDot:
//                    break;
//                case R.id.butClr:
//                    break;
//                case R.id.butEquals:
//                    break;
//                }
//            }
//
//        catch(Exception ex) {
//
//            result.setText("error");
//        }
//
//    }

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

    public void oneButtom (View v){
        string += "1";
        TextView t = (TextView) findViewById(R.id.textResult1);
        t.setText(string);
    }

    public void twoButtom (View v){
        string += "2";
        TextView t = (TextView) findViewById(R.id.textResult1);
        t.setText(string);
    }
    public void threeButtom (View v){
        string += "3";
        TextView t = (TextView) findViewById(R.id.textResult1);
        t.setText(string);
    }
    public void fourButtom (View v){
        string += "4";
        TextView t = (TextView) findViewById(R.id.textResult1);
        t.setText(string);
    }
    public void fiveButtom (View v){
        string += "5";
        TextView t = (TextView) findViewById(R.id.textResult1);
        t.setText(string);
    }
    public void sixButtom (View v){
        string += "6";
        TextView t = (TextView) findViewById(R.id.textResult1);
        t.setText(string);
    }
    public void sevenButtom (View v){
        string += "7";
        TextView t = (TextView) findViewById(R.id.textResult1);
        t.setText(string);
    }
    public void eightButtom (View v){
        string += "8";
        TextView t = (TextView) findViewById(R.id.textResult1);
        t.setText(string);
    }
    public void nineButtom (View v){
        string += "9";
        TextView t = (TextView) findViewById(R.id.textResult1);
        t.setText(string);
    }
    public void zeroButtom (View v){
        string += "0";
        TextView t = (TextView) findViewById(R.id.textResult1);
        t.setText(string);
    }
    public void ClrButtom (View v){
        string = "";
        TextView t = (TextView) findViewById(R.id.textResult1);
        t.setText(string);
    }


}
