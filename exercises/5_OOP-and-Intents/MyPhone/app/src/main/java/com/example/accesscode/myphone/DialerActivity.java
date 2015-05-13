package com.example.accesscode.myphone;

import android.app.Activity;
<<<<<<< HEAD
=======
import android.content.Intent;
import android.net.Uri;
>>>>>>> gmsyrimis
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by amyquispe on 4/30/15.
 */
public class DialerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialer);
<<<<<<< HEAD
=======

>>>>>>> gmsyrimis
        Button callButton = (Button) findViewById(R.id.call_button);
        final EditText dialerText = (EditText) findViewById(R.id.dialer_text);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                /* get text input */
                String phoneNumber = dialerText.getText().toString();

                /*
                    Use an implicit intent to open the user's phone app to call this number.
                    http://developer.android.com/guide/components/intents-common.html#Phone
                 */
            }
        });
    }
}
=======

                String phoneNumber = dialerText.getText().toString();


                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:" + phoneNumber));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}
>>>>>>> gmsyrimis
