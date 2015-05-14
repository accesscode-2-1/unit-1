package doubleabatteries.c4q.nyc.calculatorproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {


    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = (TextView) findViewById(R.id.textView);

        if(savedInstanceState != null){
            textview.setText(savedInstanceState.getString("equation"));
        }

        Button button7 = (Button) findViewById(R.id.seven);
        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                textview.append("7");
            }
        });
        Button button8 = (Button) findViewById(R.id.eight);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.append("8");
            }
        });
        Button button9 = (Button) findViewById(R.id.nine);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.append("9");
            }
        });
        Button button4 = (Button) findViewById(R.id.four);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.append("4");
            }
        });
        Button button5 = (Button) findViewById(R.id.five);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = view.getId();
                textview.append("5");
            }
        });
        Button button6 = (Button) findViewById(R.id.six);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.append("6");
            }
        });
        Button button1 = (Button) findViewById(R.id.one);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.append("1");
            }
        });
        Button button2 = (Button) findViewById(R.id.two);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.append("2");
            }
        });
        Button button3 = (Button) findViewById(R.id.three);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.append("3");
            }
        });

        // TODO!!
        Button buttonParen = (Button) findViewById(R.id.parentheses);
        buttonParen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.append("(");
            }
        });
        Button button0 = (Button) findViewById(R.id.zero);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.append("0");
            }
        });

        // TODO !!
        Button buttonDecimal = (Button) findViewById(R.id.decimal);
        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.append(".");
            }
        });
        Button buttonClear = (Button) findViewById(R.id.clear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.setText("");
            }
        });
        Button buttonAdd = (Button) findViewById(R.id.add);
        buttonAdd.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                if (textview.getText().equals("")) {
                } else if (!isOperator(textview.getText().toString())){
                    textview.append(((Button) view).getText().toString());
                }
            }
        });
        Button buttonSubtract = (Button) findViewById(R.id.subtract);
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textview.getText().equals("")) {
                } else if (!isOperator(textview.getText().toString())){
                    textview.append(((Button) view).getText().toString());
                }            }
        });
        Button buttonNegative = (Button) findViewById(R.id.negative);
        buttonNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.append("");
            }
        });
        Button buttonBackspace = (Button) findViewById(R.id.backspace);
        buttonBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textview.getText().toString().equals("")) {
                } else {
                    textview.setText(textview.getText().toString().substring(0, textview.getText().toString().length() - 1));
                }
            }
        });
        Button buttonMultiply = (Button) findViewById(R.id.multiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textview.getText().equals("")) {
                } else if (!isOperator(textview.getText().toString())){
                    textview.append(((Button) view).getText().toString());
                }            }
        });
        Button buttonDivide = (Button) findViewById(R.id.divide);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textview.getText().equals("")) {
                } else if (!isOperator(textview.getText().toString())){
                    textview.append(((Button) view).getText().toString());
                }            }
        });
        Button buttonEnter = (Button) findViewById(R.id.enter);
        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            // TODO: LIBRARY PARSE CODE GOES HERE !!!!
            }
        });



    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("equation", textview.getText().toString());

        super.onSaveInstanceState(outState);
    }






    public boolean isOperator(String input) {

        if (textview.getText().toString().equals("")) {
            return true;
        }

        char lastC = input.charAt(input.length()-1);
        char[] operators = {'+', '-', '*', '÷'};



        for(char operator : operators){
            if (lastC == operator) {
                return true;
            }
        }

        return false;

    }





}
