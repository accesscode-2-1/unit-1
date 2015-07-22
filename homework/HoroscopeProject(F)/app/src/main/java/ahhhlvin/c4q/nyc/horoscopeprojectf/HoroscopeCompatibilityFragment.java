package ahhhlvin.c4q.nyc.horoscopeprojectf;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alvin2 on 7/18/15.
 */

public class HoroscopeCompatibilityFragment extends Fragment {
    public static final String ARG_LIST_NUMBER = "list_number";

    public HoroscopeCompatibilityFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // this is the default screen that opens when the app is opened up
        View rootView = inflater.inflate(R.layout.fragment_horoscope_compatibility, container, false);


        int i = getArguments().getInt(ARG_LIST_NUMBER);
        String listItem = getResources().getStringArray(R.array.titles)[i];
        getActivity().setTitle(listItem);


        final Spinner spinner1 = (Spinner) rootView.findViewById(R.id.spinner1);
        ArrayList<String> list = new ArrayList<String>();

        list.add("Select horoscope sign");
        list.add("Capricorn");
        list.add("Aries");
        list.add("Taurus");
        list.add("Gemini");
        list.add("Cancer");
        list.add("Leo");
        list.add("Libra");
        list.add("Virgo");
        list.add("Scorpio");
        list.add("Sagittarius");
        list.add("Pisces");
        list.add("Aquarius");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity().getApplicationContext(),
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);


        final Spinner spinner2 = (Spinner) rootView.findViewById(R.id.spinner2);
        ArrayList<String> list2 = new ArrayList<String>();

        list2.add("Select horoscope sign");
        list2.add("Capricorn");
        list2.add("Aries");
        list2.add("Taurus");
        list2.add("Gemini");
        list2.add("Cancer");
        list2.add("Leo");
        list2.add("Libra");
        list2.add("Virgo");
        list2.add("Scorpio");
        list2.add("Sagittarius");
        list2.add("Pisces");
        list2.add("Aquarius");


        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);


        final TextView compatibilityView = (TextView) rootView.findViewById(R.id.viewCompatibility);
        Button button = (Button) rootView.findViewById(R.id.getCompatibilityButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                compatibilityView.setText(Methods.returnCompatibility(spinner1.getSelectedItem().toString(), spinner2.getSelectedItem().toString()));
            }
        });


        return rootView;
    }



}
