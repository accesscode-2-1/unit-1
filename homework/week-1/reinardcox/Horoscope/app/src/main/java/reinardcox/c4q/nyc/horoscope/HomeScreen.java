package reinardcox.c4q.nyc.horoscope;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageButton;

import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {
    TextView _display;
    ImageButton _aries;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //getSupportActionBar().setDisplayUseLogoEnabled(true);

        _display = (TextView) findViewById(R.id.title_zodiac_sign);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/ObelixProBIt-cyr.ttf");
        _display.setTypeface(typeface);

        _aries = (ImageButton) findViewById(R.id.aries_id);
        final Intent intent = new Intent(this, AriesClass.class);

        _aries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
