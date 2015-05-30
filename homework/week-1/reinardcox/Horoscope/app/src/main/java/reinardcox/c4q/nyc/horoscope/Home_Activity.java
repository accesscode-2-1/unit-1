package reinardcox.c4q.nyc.horoscope;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Home_Activity extends AppCompatActivity {

    private TextView _display, _display2;
    private ImageButton _aries, _taurus, _gemini, _cancer, _leo, _virgo, _libra, _scorpio, _sagittarius, _capricorn, _aquarius, _pisces;
    private Intent _one, _two, _three, _four, _five, _six, _seven, _eight, _nine, _ten, _eleven, _twelve, _sign;
    private Button _chooseSign;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);

        _display = (TextView) findViewById(R.id.title_zodiac_sign);
        _display2 = (TextView) findViewById(R.id.title_zodiac_sign2);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/ObelixProBIt-cyr.ttf");

        _display.setTypeface(typeface);
        _display2.setTypeface(typeface);

        _aries = (ImageButton) findViewById(R.id.aries_id); //Associated with _one Intent variable
        _taurus = (ImageButton) findViewById(R.id.taurus_id); //Associated with _two Intent variable
        _gemini = (ImageButton) findViewById(R.id.gemini_id); //Associated with _three Intent variable
        _cancer = (ImageButton) findViewById(R.id.cancer_id); //Associated with _four Intent variable
        _leo = (ImageButton) findViewById(R.id.leo_id); //Associated with _five Intent variable
        _virgo = (ImageButton) findViewById(R.id.virgo_id); //Associated with _six Intent variable
        _libra = (ImageButton) findViewById(R.id.libra_id); //Associated with _seven Intent variable
        _scorpio = (ImageButton) findViewById(R.id.scorpio_id); //Associated with _eight Intent variable
        _sagittarius = (ImageButton) findViewById(R.id.sagittarius_id); //Associated with _nine Intent variable
        _capricorn = (ImageButton) findViewById(R.id.capricorn_id); //Associated with _ten Intent variable
        _aquarius = (ImageButton) findViewById(R.id.aquarius_id); //Associated with _eleven Intent variable
        _pisces = (ImageButton) findViewById(R.id.pisces_id); //Associated with _Twelve Intent variable

        _one = new Intent(this, Aries_Activity.class);
        _one.putExtra("sign","aries");
        _two = new Intent(this, Taurus_Activity.class);
        _three = new Intent(this, Gemini_Activity.class);
        _four = new Intent(this, Cancer_Activity.class);
        _five = new Intent(this, Leo_Activity.class);
        _six = new Intent(this, Virgo_Activity.class);
        _seven = new Intent(this, Libra_Activity.class);
        _eight = new Intent(this, Scorpio_Activity.class);
        _nine = new Intent(this, Sagittarius_Activity.class);
        _ten = new Intent (this, Capricorn_Activity.class);
        _eleven = new Intent(this, Aquarius_Activity.class);
        _twelve = new Intent(this, Pisces_Activity.class);
        //_sign = new Intent(this, See_What_Sign.class);

        _aries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(_one);
            }
        });

        _taurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(_two);
            }
        });

        _gemini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(_three);
            }
        });

        _cancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(_four);
            }
        });

        _leo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(_five);
            }
        });

        _virgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(_six);
            }
        });

        _libra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(_seven);
            }
        });

        _scorpio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(_eight);
            }
        });

        _sagittarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(_nine);
            }
        });

        _capricorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(_ten);
            }
        });

        _aquarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(_eleven);
            }
        });

        _pisces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(_twelve);
            }
        });

        _chooseSign = (Button) findViewById(R.id.choose_sign_id);

        _chooseSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(_sign);
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
