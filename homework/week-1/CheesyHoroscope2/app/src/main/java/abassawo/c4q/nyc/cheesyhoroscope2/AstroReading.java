package abassawo.c4q.nyc.cheesyhoroscope2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;


public class AstroReading extends ActionBarActivity {
    //private String astroSign;
    TextView title;
    TextView tvDetail;
    ImageView zodiacImage;
    String astroSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_astro_reading);

        astroSign = getIntent().getStringExtra("zodiac_obj");
        title = (TextView) findViewById(R.id.signTitle);
        title.setText(astroSign);

        tvDetail = (TextView) findViewById(R.id.zodiac_Detail);
        zodiacImage = (ImageView) findViewById(R.id.zodiacImage);


        String[] zodiacs = {"Aries", "Taurus", "Gemini",
                "Cancer", "Leo", "Virgo", "Libra", "Scorpio",
                "Sagittarius", "Capricorn", "Aquarius", "Pisces"};

        int[] zodiacDetails =
                {R.string.ariesDetail, R.string.taurusDetail, R.string.geminiDetail, R.string.cancerDetail,
                        R.string.leoDetail, R.string.virgoDetail, R.string.libraDetail, R.string.scorpioDetail,
                        R.string.sagittariusDetail, R.string.capricornDetail, R.string.aquariusDetail, R.string.piscesDetail};

        HashMap<String, Integer> signMap = new HashMap<>();

        for (int i = 0; i < 12; i++) {
            signMap.put(zodiacs[i], zodiacDetails[i]);
        }
        tvDetail.setText(signMap.get(astroSign));  //FIXME

        HashMap<String, Integer> imageMap = new HashMap<>();
        Integer[] imagePaths = {R.drawable.ariestat, R.drawable.taurustat, R.drawable.geminitat,
                R.drawable.cancertat, R.drawable.leotat, R.drawable.virgotat, R.drawable.libratat,
                R.drawable.scorpiotat, R.drawable.sagittariustat, R.drawable.capricorntat, R.drawable.aquariustat, R.drawable.piscestat};

        for (int i = 0; i < 12; i++) {
            imageMap.put(zodiacs[i], imagePaths[i]);
        }

        zodiacImage.setImageResource(imageMap.get(astroSign));


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_astro_reading, menu);
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

