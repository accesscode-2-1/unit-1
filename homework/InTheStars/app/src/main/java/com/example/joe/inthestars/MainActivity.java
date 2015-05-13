package com.example.joe.inthestars;

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



public class MainActivity extends ActionBarActivity{
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ListView signsList;
    String[] appMenu;
    public String[] signs;
    public RelativeLayout signsTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        appMenu = getResources().getStringArray(R.array.appMenu);
        mDrawerList = (ListView) findViewById(R.id.listView);
        mDrawerList.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,appMenu));
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch(position){
                    case 0:{
                        Intent home = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(home);
                        break;
                    }
                    case 1:{
                        Intent signsInfo = new Intent(MainActivity.this, SignsInfo.class);
                        startActivity(signsInfo);
                        break;
                    }
                    case 2:{
                        Intent romance = new Intent(MainActivity.this, Romance.class);
                        startActivity(romance);
                        break;
                    }
                    case 3:{
                        Intent guessingGame = new Intent(MainActivity.this, GuessingGame.class);
                        startActivity(guessingGame);
                        break;
                    }
                }

            }
        });


        // Buttons
        signsTable = (RelativeLayout) findViewById(R.id.signs_buttons);
        signsTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Button aries =(Button) findViewById(R.id.aries_button);
                aries.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent ariesInfo = new Intent(MainActivity.this, Class.forName(SignsInfo.buttonClicked(aries)));
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
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
