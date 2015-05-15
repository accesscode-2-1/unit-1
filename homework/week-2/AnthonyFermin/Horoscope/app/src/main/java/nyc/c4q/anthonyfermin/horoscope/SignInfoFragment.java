package nyc.c4q.anthonyfermin.horoscope;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SignInfoFragment extends Fragment {
    public static final String ARG_LIST_NUMBER = "list_number";

    public SignInfoFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sign_info, container, false);

        String[] zodiacs = getResources().getStringArray(R.array.zodiac_names_array);
        for(String zodiac :zodiacs){
            zodiac = zodiac.toLowerCase();
            Button button = (Button) rootView.findViewById(getResources().getIdentifier(zodiac,"id", "nyc.c4q.anthonyfermin.horoscope"));
            button.setText(zodiac);
        }

        int i = getArguments().getInt(ARG_LIST_NUMBER);
        String listItem = getResources().getStringArray(R.array.list_names_array)[i];
        getActivity().setTitle(listItem);

        return rootView;
    }
}