package com.example.joe.inthestars;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.List;



public class MainActivity extends Activity {
    private ListView mDrawerList;
    String[] appMenu;
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appMenu = getResources().getStringArray(R.array.appMenu);
        mDrawerList = (ListView) findViewById(R.id.listView);

        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, appMenu);
        mDrawerList.setAdapter(mAdapter);
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0: {
                        Intent home = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(home);
                        break;
                    }
                    case 1: {
                        Intent romance = new Intent(MainActivity.this, Romance.class);
                        startActivity(romance);
                        break;
                    }
                    case 2: {
                        Intent guessingGame = new Intent(MainActivity.this, GuessingGame.class);
                        startActivity(guessingGame);
                        break;
                    }
                }
            }
        });
    }
}
