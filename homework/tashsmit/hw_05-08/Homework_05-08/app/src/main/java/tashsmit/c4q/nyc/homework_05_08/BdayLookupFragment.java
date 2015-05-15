package tashsmit.c4q.nyc.homework_05_08;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

/**
 * Created by c4q-tashasmith on 5/7/15.
 */
public class BdayLookupFragment extends Fragment {

    DatePicker picker;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View myInflatedView = inflater.inflate(R.layout.bday_lookup, container,false);

        picker = (DatePicker) myInflatedView.findViewById(R.id.datePicker);
        Button go = (Button) myInflatedView.findViewById(R.id.gobutton);
        go.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView zodiac = (TextView) myInflatedView.findViewById(R.id.zodiac);
                TextView info = (TextView) myInflatedView.findViewById(R.id.info);
                    String sign = BirthdayLookUp.zodiacSign(picker.getMonth(), picker.getDayOfMonth());
                    zodiac.setText("You are a: " + sign);

            }
        });

        return myInflatedView;
    }
}