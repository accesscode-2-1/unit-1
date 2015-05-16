package annalinewyork.c4q.nyc.horoscope;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
/**
 * Created by c4q-nali on 5/16/15.
 */
public class SignClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.buttonAries) {
            Intent aries = new Intent(this, SignExplanationActivity.class);


        }

    }
}
