package nyc.c4q.hyunj0.horoscope;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class HoroscopeGame extends Activity {

    TextView title, sign;
    ImageButton fire, water, earth, air;
    public String[] horoscopes = {"aries", "taurus", "gemini", "cancer", "leo", "virgo", "libra", "scorpio", "sagittarius", "capricorn", "aquarius", "pisces"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoscope_game);
        title = (TextView) findViewById(R.id.title);
        sign = (TextView) findViewById(R.id.sign);
        sign.setText(getHoroscope());
        fire = (ImageButton) findViewById(R.id.fire);
        water = (ImageButton) findViewById(R.id.water);
        earth = (ImageButton) findViewById(R.id.earth);
        air = (ImageButton) findViewById(R.id.air);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == fire && isElement(sign).equals("fire"))
                    Toast.makeText(getApplicationContext(),"Correct!",Toast.LENGTH_SHORT).show();
                if (view == water && isElement(sign).equals("water"))
                    Toast.makeText(getApplicationContext(),"Correct!",Toast.LENGTH_SHORT).show();
                if (view == earth && isElement(sign).equals("earth"))
                    Toast.makeText(getApplicationContext(),"Correct!",Toast.LENGTH_SHORT).show();
                if (view == air && isElement(sign).equals("air"))
                    Toast.makeText(getApplicationContext(),"Correct!",Toast.LENGTH_SHORT).show();

            }
        };
    }

    public String getHoroscope() {

        String horoscope = "";

        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(horoscopes.length);

        horoscope = horoscopes[randomNumber];

        return horoscope;
    }

    public String isElement (TextView sign) {
        String horoscopeSign = sign.getText().toString();
        if ((horoscopeSign.equalsIgnoreCase("aries") ||
            horoscopeSign.equalsIgnoreCase("leo") ||
            horoscopeSign.equalsIgnoreCase("sagittarius")))
            return "fire";
        else if ((horoscopeSign.equalsIgnoreCase("cancer") ||
                horoscopeSign.equalsIgnoreCase("scorpio") ||
                horoscopeSign.equalsIgnoreCase("pisces")))
            return "water";
        else if ((horoscopeSign.equalsIgnoreCase("taurus") ||
                horoscopeSign.equalsIgnoreCase("virgo") ||
                horoscopeSign.equalsIgnoreCase("capricorn")))
            return "earth";
        else if ((horoscopeSign.equalsIgnoreCase("gemini") ||
                horoscopeSign.equalsIgnoreCase("libra") ||
                horoscopeSign.equalsIgnoreCase("aquarius")))
            return "air";
        else
            return "Did you make a typo?";
    }

}
