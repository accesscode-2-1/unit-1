package madelyntav.c4q.nyc.zodiac;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Compatibility extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compatibility);
    }


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void incompatibleSigns(View view) {

        EditText yourSign=(EditText) findViewById(R.id.enterYourSign);
        String sign1=yourSign.getText().toString();

        EditText partnersSign=(EditText) findViewById(R.id.enterPartnersSign);
        String sign2 = partnersSign.getText().toString();


        Resources res = getResources();
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);

        if ((sign1.equalsIgnoreCase("aries") || sign2.equalsIgnoreCase("aries")) && (sign1.equalsIgnoreCase("cancer") || sign2.equalsIgnoreCase("cancer") || sign1.equalsIgnoreCase("capricorn") || sign2.equalsIgnoreCase("capricorn"))) {
            imageView.setImageResource(R.drawable.doomed);

        } else if ((sign1.equalsIgnoreCase("taurus") || sign2.equalsIgnoreCase("taurus")) && (sign1.equalsIgnoreCase("leo") || sign2.equalsIgnoreCase("leo") || sign1.equalsIgnoreCase("aquarius") || sign2.equalsIgnoreCase("aquarius"))) {
            imageView.setImageResource(R.drawable.doomed);

        } else if ((sign1.equalsIgnoreCase("gemini") || sign2.equalsIgnoreCase("gemini")) && (sign1.equalsIgnoreCase("virgo") || sign2.equalsIgnoreCase("virgo") || sign1.equalsIgnoreCase("pisces") || sign2.equalsIgnoreCase("pisces"))) {
            imageView.setImageResource(R.drawable.doomed);

        } else if ((sign1.equalsIgnoreCase("cancer") || sign2.equalsIgnoreCase("cancer")) && (sign1.equalsIgnoreCase("aries") || sign2.equalsIgnoreCase("aries") || sign1.equalsIgnoreCase("libra") || sign2.equalsIgnoreCase("libra"))) {
            imageView.setImageResource(R.drawable.doomed);

        } else if ((sign1.equalsIgnoreCase("leo") || sign2.equalsIgnoreCase("leo")) && (sign1.equalsIgnoreCase("taurus") || sign2.equalsIgnoreCase("taurus") || sign1.equalsIgnoreCase("scorpio") || sign2.equalsIgnoreCase("scorpio"))) {
            imageView.setImageResource(R.drawable.doomed);

        } else if ((sign1.equalsIgnoreCase("virgo") || sign2.equalsIgnoreCase("virgo")) && (sign1.equalsIgnoreCase("sagittarius") || sign2.equalsIgnoreCase("sagittarius") || sign1.equalsIgnoreCase("gemini") || sign2.equalsIgnoreCase("gemini"))) {
            imageView.setImageResource(R.drawable.doomed);

        } else if ((sign1.equalsIgnoreCase("capricorn") || sign2.equalsIgnoreCase("capricorn")) && (sign1.equalsIgnoreCase("aries") || sign2.equalsIgnoreCase("aries") || sign1.equalsIgnoreCase("libra") || sign2.equalsIgnoreCase("libra"))) {
            imageView.setImageResource(R.drawable.doomed);

        } else if ((sign1.equalsIgnoreCase("aquarius") || sign2.equalsIgnoreCase("aquarius")) && (sign1.equalsIgnoreCase("scorpio") || sign2.equalsIgnoreCase("scorpio") || sign1.equalsIgnoreCase("taurus") || sign2.equalsIgnoreCase("taurus"))) {
            imageView.setImageResource(R.drawable.doomed);

        } else if ((sign1.equalsIgnoreCase("sagittarius") || sign2.equalsIgnoreCase("sagittarius")) && (sign1.equalsIgnoreCase("pisces") || sign2.equalsIgnoreCase("pisces") || sign1.equalsIgnoreCase("virgo") || sign2.equalsIgnoreCase("virgo"))) {
            imageView.setImageResource(R.drawable.doomed);

        } else {
            imageView.setImageResource(R.drawable.doomed);
        }
    }
}

