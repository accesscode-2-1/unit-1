package jvidals1.c4q.nyc.horoscope;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by s3a on 5/16/15.
 */
public class SignActivity extends ListActivity {

    public final static String[] signs = {"Capricorn","Aquarius","Pieces", "Aries", "Taurus", "Gemini", "Cancer"," Leo", "Virgo", "Libra","Scorpio"};

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, signs);

        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent intent = new Intent(getApplicationContext(), SignInfoActivity.class);
        intent.putExtra("position", position);
        startActivity(intent);
    }
}
