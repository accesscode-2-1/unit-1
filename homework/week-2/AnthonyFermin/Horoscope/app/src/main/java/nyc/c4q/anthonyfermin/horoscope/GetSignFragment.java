package nyc.c4q.anthonyfermin.horoscope;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class GetSignFragment extends Fragment {
    public static final String ARG_LIST_NUMBER = "list_number";

    public GetSignFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_get_sign, container, false);

        final Spinner monthSpinner = (Spinner) rootView.findViewById(R.id.monthSpinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> monthAdapter = ArrayAdapter.createFromResource(this.getActivity(),
                R.array.months_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        monthSpinner.setAdapter(monthAdapter);

        Integer[] days = new Integer[31];
        for (int i = 1; i <= 31; i++) {
            days[i-1] = (i);
        }

        final Spinner daySpinner = (Spinner) rootView.findViewById(R.id.daySpinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<Integer> dayAdapter = new ArrayAdapter<Integer>(this.getActivity(),
                android.R.layout.simple_spinner_item, days);
        // Specify the layout to use when the list of choices appears
        dayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        daySpinner.setAdapter(dayAdapter);

        int i = getArguments().getInt(ARG_LIST_NUMBER);
        String listItem = getResources().getStringArray(R.array.list_names_array)[i];
        getActivity().setTitle(listItem);

        final Button launchZodiac = (Button) rootView.findViewById(R.id.launchZodiac);
        Button getSign = (Button) rootView.findViewById(R.id.getSign);
        getSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedMonth = monthSpinner.getSelectedItemPosition();
                int selectedDay = (int) daySpinner.getSelectedItem();

                if((selectedMonth == 11 && selectedDay >= 22) || (selectedMonth == 0 && selectedDay <= 20)){
                    launchZodiac.setText("Capricorn");
                }else if((selectedMonth == 0 && selectedDay >= 21) || (selectedMonth == 1 && selectedDay <= 19)){
                    launchZodiac.setText("Aquarius");
                }else if((selectedMonth == 1 && selectedDay >= 20) || (selectedMonth == 2 && selectedDay <= 20)){
                    launchZodiac.setText("Pisces");
                }else if((selectedMonth == 2 && selectedDay >= 21) || (selectedMonth == 3 && selectedDay <= 19)){
                    launchZodiac.setText("Aries");
                }else if((selectedMonth == 3 && selectedDay >= 20) || (selectedMonth == 4 && selectedDay <= 20)){
                    launchZodiac.setText("Taurus");
                }else if((selectedMonth == 4 && selectedDay >= 21) || (selectedMonth == 5 && selectedDay <= 21)){
                    launchZodiac.setText("Gemini");
                }else if((selectedMonth == 5 && selectedDay >= 22) || (selectedMonth == 6 && selectedDay <= 23)){
                    launchZodiac.setText("Cancer");
                }else if((selectedMonth == 6 && selectedDay >= 24) || (selectedMonth == 7 && selectedDay <= 23)){
                    launchZodiac.setText("Leo");
                }else if((selectedMonth == 7 && selectedDay >= 24) || (selectedMonth == 8 && selectedDay <= 22)){
                    launchZodiac.setText("Virgo");
                }else if((selectedMonth == 8 && selectedDay >= 23) || (selectedMonth == 9 && selectedDay <= 22)){
                    launchZodiac.setText("Libra");
                }else if((selectedMonth == 9 && selectedDay >= 23) || (selectedMonth == 10 && selectedDay <= 22)){
                    launchZodiac.setText("Scorpio");
                }else if((selectedMonth == 10 && selectedDay >= 23) || (selectedMonth == 11 && selectedDay <= 21)){
                    launchZodiac.setText("Sagittarius");
                }
            }
        });

        return rootView;
    }
}