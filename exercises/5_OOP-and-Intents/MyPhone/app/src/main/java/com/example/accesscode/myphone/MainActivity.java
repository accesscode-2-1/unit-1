package com.example.accesscode.myphone;

<<<<<<< HEAD
=======
import android.content.Intent;
>>>>>>> gmsyrimis
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        /* DialerActivity */
        Button dialerButton = (Button) findViewById(R.id.dialer_button);
=======

        Button dialerButton = (Button) findViewById(R.id.dialer_button);

>>>>>>> gmsyrimis
        dialerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Dialer clicked", Toast.LENGTH_SHORT).show();
<<<<<<< HEAD
                /*
                    Use Explicit Intent to start DialerActivity here.
                 */
            }
        });
        /* EmailActivity */
=======
                Intent intent = new Intent(getApplicationContext(), DialerActivity.class);
                startActivity(intent);
            }
        });


>>>>>>> gmsyrimis
        Button emailButton = (Button) findViewById(R.id.email_button);
        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Email clicked", Toast.LENGTH_SHORT).show();
<<<<<<< HEAD
                 /*
                    Use Explicit Intent to start EmailActivity here.
                 */

=======
                Intent intent = new Intent(getApplicationContext(), EmailActivity.class);
                startActivity(intent);
>>>>>>> gmsyrimis
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
<<<<<<< HEAD
}
=======
}
>>>>>>> gmsyrimis
