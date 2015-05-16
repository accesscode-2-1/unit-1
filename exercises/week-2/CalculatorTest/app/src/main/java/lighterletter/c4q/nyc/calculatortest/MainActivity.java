package lighterletter.c4q.nyc.calculatortest;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void ButtonClickDurch (View view) {
        double zahl1;
        double zahl2;
        double Ergebnis;
        EditText Feld1 = (EditText)findViewById(R.id.zahl1);
        EditText Feld2 = (EditText)findViewById(R.id.zahl2);
        EditText FeldErgebnis = (EditText)findViewById(R.id.Ergebnis);
        if (Feld1.getText().toString().length() == 0) {
            return;
        }
        if (Feld2.getText().toString().length() == 0) {
            return;
        }
        zahl1 = Double.parseDouble(Feld1.getText().toString());
        zahl2 = Double.parseDouble(Feld2.getText().toString());
        Ergebnis = zahl1 / zahl2;

        FeldErgebnis.setText(String.valueOf(Ergebnis));

    }

    public void ButtonClickPlus (View view) {
        double zahl1;
        double zahl2;
        double Ergebnis;
        EditText Feld1 = (EditText)findViewById(R.id.zahl1);
        EditText Feld2 = (EditText)findViewById(R.id.zahl2);
        EditText FeldErgebnis = (EditText)findViewById(R.id.Ergebnis);
        if (Feld1.getText().toString().length() == 0) {
            return;
        }
        if (Feld2.getText().toString().length() == 0) {
            return;
        }
        zahl1 = Double.parseDouble(Feld1.getText().toString());
        zahl2 = Double.parseDouble(Feld2.getText().toString());
        Ergebnis = zahl1 + zahl2;

        FeldErgebnis.setText(String.valueOf(Ergebnis));

    }

    public void ButtonClickMinus (View view) {
        double zahl1;
        double zahl2;
        double Ergebnis;
        EditText Feld1 = (EditText)findViewById(R.id.zahl1);
        EditText Feld2 = (EditText)findViewById(R.id.zahl2);
        EditText FeldErgebnis = (EditText)findViewById(R.id.Ergebnis);
        if (Feld1.getText().toString().length() == 0) {
            return;
        }
        if (Feld2.getText().toString().length() == 0) {
            return;
        }
        zahl1 = Double.parseDouble(Feld1.getText().toString());
        zahl2 = Double.parseDouble(Feld2.getText().toString());
        Ergebnis = zahl1 - zahl2;

        FeldErgebnis.setText(String.valueOf(Ergebnis));
    }

    public void ButtonClickMal (View view) {
        double zahl1;
        double zahl2;
        double Ergebnis;
        EditText Feld1 = (EditText)findViewById(R.id.zahl1);
        EditText Feld2 = (EditText)findViewById(R.id.zahl2);
        EditText FeldErgebnis = (EditText)findViewById(R.id.Ergebnis);
        if (Feld1.getText().toString().length() == 0) {
            return;
        }
        if (Feld2.getText().toString().length() == 0) {
            return;
        }
        zahl1 = Double.parseDouble(Feld1.getText().toString());
        zahl2 = Double.parseDouble(Feld2.getText().toString());
        Ergebnis = zahl1 * zahl2;

        FeldErgebnis.setText(String.valueOf(Ergebnis));

    }
}
