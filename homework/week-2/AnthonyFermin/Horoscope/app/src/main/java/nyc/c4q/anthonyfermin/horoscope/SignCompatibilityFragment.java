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
public class SignCompatibilityFragment extends Fragment {
    public static final String ARG_LIST_NUMBER = "list_number";

    public SignCompatibilityFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_sign_compatibility, container, false);

        final Spinner zodiacSpinner1 = (Spinner) rootView.findViewById(R.id.zodiacSpinner1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> zAdapter1 = ArrayAdapter.createFromResource(this.getActivity(),
                R.array.zodiac_names_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        zAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        zodiacSpinner1.setAdapter(zAdapter1);

        final Spinner zodiacSpinner2 = (Spinner) rootView.findViewById(R.id.zodiacSpinner2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> zAdapter2 = ArrayAdapter.createFromResource(this.getActivity(),
                R.array.zodiac_names_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        zAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        zodiacSpinner2.setAdapter(zAdapter2);

        int i = getArguments().getInt(ARG_LIST_NUMBER);
        String listItem = getResources().getStringArray(R.array.list_names_array)[i];
        getActivity().setTitle(listItem);

        Button getCompat = (Button) rootView.findViewById(R.id.getCompat);
        getCompat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView) rootView.findViewById(R.id.compatResult);
                textView.setText("The signs show you are compatible!");

            }
        });

        return rootView;
    }
}
