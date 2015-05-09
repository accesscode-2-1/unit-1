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
import android.widget.Button;
import android.widget.ImageView;


public class ChooseASign extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_asign);

    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setAriesImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        Drawable draw = getDrawable(R.drawable.ariesinfo);
        imageView.setImageDrawable(draw);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setTaurusImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        Drawable draw = getDrawable(R.drawable.taurusinfo);
        imageView.setImageDrawable(draw);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setGeminiImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        Drawable draw = getDrawable(R.drawable.geminiinfo);
        imageView.setImageDrawable(draw);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setCancerImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        Drawable draw = getDrawable(R.drawable.cancerinfo);
        imageView.setImageDrawable(draw);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setLeoImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        Drawable draw = getDrawable(R.drawable.leoinfo);
        imageView.setImageDrawable(draw);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setVirgoImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        Drawable draw = getDrawable(R.drawable.virgoinfo);
        imageView.setImageDrawable(draw);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setLibraSign(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        Drawable draw = getDrawable(R.drawable.librainfo);
        imageView.setImageDrawable(draw);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setScorpioImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        Drawable draw = getDrawable(R.drawable.scorpioinfo);
        imageView.setImageDrawable(draw);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setSagittariusImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        Drawable draw = getDrawable(R.drawable.sagittariusinfo);
        imageView.setImageDrawable(draw);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setCapricornImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        Drawable draw = getDrawable(R.drawable.capricorninfo);
        imageView.setImageDrawable(draw);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setPiscesImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        Drawable draw = getDrawable(R.drawable.piscesinfo);
        imageView.setImageDrawable(draw);
    }

}
