package fattyduck.zodiac2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {
    private DrawerLayout drawerLayout;
    private ListView listView;
    private String[] contents;
    private ActionBarDrawerToggle drawerListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contents = getResources().getStringArray(R.array.contents);
        listView = (ListView) findViewById(R.id.drawerList);
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, contents));
        listView.setOnItemClickListener(this);
        drawerLayout=(DrawerLayout) findViewById(R.id.drawerLayout);
        drawerListener = new ActionBarDrawerToggle(this, drawerLayout , R.string.drawer_open, R.string.drawer_close){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                Toast.makeText(MainActivity.this, R.string.drawer_open,Toast.LENGTH_SHORT);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                Toast.makeText(MainActivity.this, R.string.drawer_close,Toast.LENGTH_SHORT);
            }
        };
        drawerLayout.setDrawerListener(drawerListener);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String str = parent.getItemAtPosition(position).toString();
        if(str.equals("Display Sign")){
            Intent i = new Intent(this, DisplaySign.class);
            startActivity(i);
        }else  if(str.equals("Your Sign")){
            Intent i = new Intent(this, UserSign.class);
            startActivity(i);
        }else  if(str.equals("Romance Calculator")){
            Intent i = new Intent(this, RomanticCalc.class);
            startActivity(i);
        }else  if(str.equals("Zodiac Game")){
            Intent i = new Intent(this, Game.class);
            startActivity(i);
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
