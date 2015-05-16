package jvidals1.c4q.nyc.horoscope;

import android.app.Activity;
import android.app.ExpandableListActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Array;

/**
 * Created by s3a on 5/16/15.
 */
public class SignInfoActivity extends Activity {

    TextView textView;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        position = getIntent().getExtras().getInt("position");




    }
}




