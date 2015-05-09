package madelyntav.c4q.nyc.zodiac;

import android.content.Intent;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;


public class MainActivity extends ActionBarActivity {
    private ListView mDrawerList;
    private ArrayAdapter<String> mAdapter;
    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    private String mActivityTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerList = (ListView) findViewById(R.id.navList);
        addDrawerItems();
    }

    private void addDrawerItems() {
        String[] osArray = {"Choose A Zodiac Sign", "Enter Your Birthday", "Are You And Your Partner Compatible?", "Guess The Sign Game"};
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, osArray);
        mDrawerList.setAdapter(mAdapter);
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0: {
                        Intent chooseSign = new Intent(MainActivity.this, ChooseASign.class);
                        startActivity(chooseSign);
                        break;
                    }
                    case 1: {
                        Intent enterBirthday = new Intent(MainActivity.this, EnterBirthday.class);
                        startActivity(enterBirthday);
                        break;
                    }
                    case 2: {
                        Intent compatibility = new Intent(MainActivity.this, Compatibility.class);
                        startActivity(compatibility);
                        break;
                    }
                    case 3: {
                        Intent startGame = new Intent(MainActivity.this, Game.class);
                        startActivity(startGame);
                        break;
                    }
                    default:
                        break;
                }
            }
        });
    }
}




