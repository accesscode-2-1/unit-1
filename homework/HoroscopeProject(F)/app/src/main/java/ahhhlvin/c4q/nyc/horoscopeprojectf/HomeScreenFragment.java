package ahhhlvin.c4q.nyc.horoscopeprojectf;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by alvin2 on 7/18/15.
 */
public class HomeScreenFragment extends Fragment {
    public static final String ARG_LIST_NUMBER = "list_number";

    public HomeScreenFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // this is the default screen that opens when the app is opened up
        View rootView = inflater.inflate(R.layout.fragment_home_screen, container, false);


        int i = getArguments().getInt(ARG_LIST_NUMBER);
        String listItem = getResources().getStringArray(R.array.titles)[i];
        getActivity().setTitle(listItem);


        ImageView img = (ImageView) rootView.findViewById(R.id.image);
        ImageView logo = (ImageView) rootView.findViewById(R.id.logo);
        img.setImageResource(R.drawable.horoscope);
        logo.setImageResource(R.drawable.logo);



        return rootView;
    }

}
