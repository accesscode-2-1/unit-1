package com.example.accesscode.myphone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by amyquispe on 4/30/15.
 */
public class EmailActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        final EditText emailSubject = (EditText) findViewById(R.id.email_subject);
        final EditText emailBody = (EditText) findViewById(R.id.email_body);
        Button mailButton = (Button) findViewById(R.id.mail_button);
        mailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myEmailAddress = ""; /* put your email address here */
                String subject = emailSubject.getText().toString();
                String body = emailBody.getText().toString();

                Intent i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_EMAIL,myEmailAddress);
                i.putExtra(Intent.EXTRA_SUBJECT,subject);
                i.putExtra(Intent.EXTRA_TEXT,body);

                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(EmailActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }
                /*
                    Use an implicit intent to open up the user's email program and send
                    and email with this subject and body to you.

                    http://developer.android.com/guide/components/intents-common.html#Email

                 */
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
