package nyc.c4q.anthonyfermin.horoscope;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by c4q-anthonyf on 5/15/15.
 */
public class HoroscopeGameFragment extends Fragment {
    public static final String ARG_LIST_NUMBER = "list_number";

    public HoroscopeGameFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_horoscope_game, container, false);

        //prompt TextView
        final TextView promptView = (TextView) rootView.findViewById(R.id.prompt);

        final int zodiacNum = (int) (Math.random() * 11 + 1);

        String promptText = "Guess the Zodiac that corresponds to this date:\n" + getResources().getStringArray(R.array.zodiac_date_array)[zodiacNum];
        promptView.setText(promptText);

        //Setting up Spinner

        final Spinner zodiacSpinner = (Spinner) rootView.findViewById(R.id.zodiacSpinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> zAdapter = ArrayAdapter.createFromResource(this.getActivity(),
                R.array.zodiac_names_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        zAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        zodiacSpinner.setAdapter(zAdapter);

        //setting up result textView

        final TextView result = (TextView) rootView.findViewById(R.id.result);

        int i = getArguments().getInt(ARG_LIST_NUMBER);
        String listItem = getResources().getStringArray(R.array.list_names_array)[i];
        getActivity().setTitle(listItem);

        Button submit = (Button) rootView.findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String selection = (String)zodiacSpinner.getSelectedItem();
                if(selection.equalsIgnoreCase(getResources().getStringArray(R.array.zodiac_names_array)[zodiacNum])){
                    result.setText("Correct");
                }else {
                    result.setText("Incorrect");
                }

            }
        });

        return rootView;
    }
}