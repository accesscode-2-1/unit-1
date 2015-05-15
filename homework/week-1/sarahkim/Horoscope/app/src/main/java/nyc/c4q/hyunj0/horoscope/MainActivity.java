package nyc.c4q.hyunj0.horoscope;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener{

    private DrawerLayout drawerLayout;
    private ListView listView;
    private String[] navigationMenu;
    private ActionBarDrawerToggle drawerListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
//        navigationMenu = getResources().getStringArray(R.array.navigation_menu);
//        listView = (ListView) findViewById(R.id.drawerList);
//        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, navigationMenu));
//        listView.setOnItemClickListener(this);
//        drawerListener = new ActionBarDrawerToggle(this, drawerLayout, R.drawable.ic_drawer, R.string.drawer_open, R.string.drawer_close){
//            @Override
//            public void onDrawerClosed(View drawerView) {
//                super.onDrawerClosed(drawerView);
//                Toast.makeText(MainActivity.this, "Drawer Closed", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onDrawerOpened(View drawerView) {
//                super.onDrawerOpened(drawerView);
//                Toast.makeText(MainActivity.this, "Drawer Opened", Toast.LENGTH_SHORT).show();
//            }
//        };
//        drawerLayout.setDrawerListener(drawerListener);
//        getSupportActionBar().setHomeButtonEnabled(true);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HoroscopeGame.class);
                startActivity(intent);
            }
        });

//        HoroscopeCheck frag = new HoroscopeCheck();
//        FragmentManager manager = getFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.add(R.id.drawerLayout, frag, "horoscopeFrag");
//        transaction.commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(drawerListener.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerListener.onConfigurationChanged(newConfig);
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerListener.syncState();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(this, navigationMenu[position] + " was selected ", Toast.LENGTH_LONG).show();
        selectItem(position);
    }

    Intent intent;

    public void selectItem(int position) {
        listView.setItemChecked(position, true);
        setTitle(navigationMenu[position]);

        switch(position) {
            case 0: {
                intent = new Intent(this, HoroscopeGame.class);
                startActivity(intent);
                break;
            }
        }
    }

    public void setTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

}
