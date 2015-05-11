package ksmaragh.c4q.nyc.horoscope;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by kadeemmaragh on 5/11/15.
 */
public class CompatibilityFragment extends android.support.v4.app.Fragment {


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_compatibility, container, false);

        addListenerOnButton(rootView);

        return rootView;

    }

    Spinner firstSign, secondSign;
    TextView compatibilityInfo;
    Button submitBtn;

    public void addListenerOnButton(View view) {

        firstSign = (Spinner) view.findViewById(R.id.spinner1);
        secondSign = (Spinner) view.findViewById(R.id.spinner2);
        submitBtn = (Button) view.findViewById(R.id.submitbtn);
        compatibilityInfo = (TextView) view.findViewById(R.id.signName);

        submitBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String signOne = String.valueOf(firstSign.getSelectedItem());
                String signTwo = String.valueOf(secondSign.getSelectedItem());
                //String compatibility = signCompat();

            }

        });
    }

}
