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
        imageView.setImageResource(R.drawable.ariesinfo);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setTaurusImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        imageView.setImageResource(R.drawable.taurusinfo);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setGeminiImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        imageView.setImageResource(R.drawable.geminiinfo);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setCancerImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);

        imageView.setImageResource(R.drawable.cancerinfo);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setLeoImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        imageView.setImageResource(R.drawable.leoinfo);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setVirgoImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        imageView.setImageResource(R.drawable.virgoinfo);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setLibraSign(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        imageView.setImageResource(R.drawable.librainfo);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setScorpioImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        imageView.setImageResource(R.drawable.scorpioinfo);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setSagittariusImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        imageView.setImageResource(R.drawable.sagittariusinfo);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setCapricornImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        imageView.setImageResource(R.drawable.capricorninfo);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setPiscesImage(View v) {
        //Resources res=getResources();
        ImageView imageView = (ImageView) findViewById(R.id.result);
        imageView.setImageResource(R.drawable.piscesinfo);
    }

}
