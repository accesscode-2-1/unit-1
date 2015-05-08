package tashsmit.c4q.nyc.homework_05_08;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

import java.util.Date;

/**
 * Created by c4q-tashasmith on 5/7/15.
 */
public class BdayLookupFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View myInflatedView = inflater.inflate(R.layout.bday_lookup, container,false);

        DatePicker birthday = (DatePicker) myInflatedView.findViewById(R.id.birthday);

        birthday.ma
        return myInflatedView;
    }
}