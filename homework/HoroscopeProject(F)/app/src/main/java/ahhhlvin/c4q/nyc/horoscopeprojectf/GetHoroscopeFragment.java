package ahhhlvin.c4q.nyc.horoscopeprojectf;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alvin2 on 7/18/15.
 */
public class GetHoroscopeFragment extends Fragment {
    public static final String ARG_LIST_NUMBER = "list_number";

    public GetHoroscopeFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // this is the default screen that opens when the app is opened up
        View rootView = inflater.inflate(R.layout.fragment_get_horoscope, container, false);


        int i = getArguments().getInt(ARG_LIST_NUMBER);
        String listItem = getResources().getStringArray(R.array.titles)[i];
        getActivity().setTitle(listItem);

        final ImageView img = (ImageView) rootView.findViewById(R.id.image);
        final TextView horoscope = (TextView) rootView.findViewById(R.id.getHoroscopeView);
        final Spinner spinner = (Spinner) rootView.findViewById(R.id.spinner);
        ArrayList<String> list2 = new ArrayList<String>();

        list2.add("Select your horoscope sign");
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

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity().getApplicationContext(),
                android.R.layout.simple_spinner_item, list2);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);


        Button button = (Button) rootView.findViewById(R.id.getHoroscopeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                horoscope.setText(Methods.getHoroscope(spinner.getSelectedItem().toString()));
                if (spinner.getSelectedItem().toString().equalsIgnoreCase("capricorn")) {
                    img.setImageResource(R.drawable.capricorn);
                } else if (spinner.getSelectedItem().toString().equalsIgnoreCase("aquarius")) {
                    img.setImageResource(R.drawable.aquarius);
                } else if (spinner.getSelectedItem().toString().equalsIgnoreCase("aries")) {
                    img.setImageResource(R.drawable.aries);
                } else if (spinner.getSelectedItem().toString().equalsIgnoreCase("cancer")) {
                    img.setImageResource(R.drawable.cancer);
                } else if (spinner.getSelectedItem().toString().equalsIgnoreCase("gemini")) {
                    img.setImageResource(R.drawable.gemini);
                } else if (spinner.getSelectedItem().toString().equalsIgnoreCase("leo")) {
                    img.setImageResource(R.drawable.leo);
                } else if (spinner.getSelectedItem().toString().equalsIgnoreCase("libra")) {
                    img.setImageResource(R.drawable.libra);
                } else if (spinner.getSelectedItem().toString().equalsIgnoreCase("pisces")) {
                    img.setImageResource(R.drawable.pisces);
                } else if (spinner.getSelectedItem().toString().equalsIgnoreCase("sagittarius")) {
                    img.setImageResource(R.drawable.sagittarius);
                } else if (spinner.getSelectedItem().toString().equalsIgnoreCase("scorpio")) {
                    img.setImageResource(R.drawable.scorpio);
                } else if (spinner.getSelectedItem().toString().equalsIgnoreCase("taurus")) {
                    img.setImageResource(R.drawable.taurus);
                } else if (spinner.getSelectedItem().toString().equalsIgnoreCase("virgo")) {
                    img.setImageResource(R.drawable.virgo);
                }
            }
        });


        return rootView;
    }
}
