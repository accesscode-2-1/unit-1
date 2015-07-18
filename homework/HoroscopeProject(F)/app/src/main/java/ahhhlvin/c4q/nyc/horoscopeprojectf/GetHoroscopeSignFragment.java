package ahhhlvin.c4q.nyc.horoscopeprojectf;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by alvin2 on 7/18/15.
 */
public class GetHoroscopeSignFragment extends Fragment {
    public static final String ARG_LIST_NUMBER = "list_number";

    public GetHoroscopeSignFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // this is the default screen that opens when the app is opened up
        View rootView = inflater.inflate(R.layout.fragment_get_horoscope_sign, container, false);


        int i = getArguments().getInt(ARG_LIST_NUMBER);
        String listItem = getResources().getStringArray(R.array.titles)[i];
        getActivity().setTitle(listItem);


        final DatePicker date = (DatePicker) rootView.findViewById(R.id.datePicker);

        final ImageView img = (ImageView) rootView.findViewById(R.id.img);


        final TextView textview = (TextView) rootView.findViewById(R.id.textView);
        Button button = (Button) rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int birthMonth = (date.getMonth() + 1);
                int birthDate = date.getDayOfMonth();
                textview.setText(Methods.getHoroscopeSign(birthMonth, birthDate));
                if (textview.getText().toString().equalsIgnoreCase("capricorn")) {
                    img.setImageResource(R.drawable.capricorn);
                } else if (textview.getText().toString().equalsIgnoreCase("aquarius")) {
                    img.setImageResource(R.drawable.aquarius);
                } else if (textview.getText().toString().equalsIgnoreCase("aries")) {
                    img.setImageResource(R.drawable.aries);
                } else if (textview.getText().toString().equalsIgnoreCase("cancer")) {
                    img.setImageResource(R.drawable.cancer);
                } else if (textview.getText().toString().equalsIgnoreCase("gemini")) {
                    img.setImageResource(R.drawable.gemini);
                } else if (textview.getText().toString().equalsIgnoreCase("leo")) {
                    img.setImageResource(R.drawable.leo);
                } else if (textview.getText().toString().equalsIgnoreCase("libra")) {
                    img.setImageResource(R.drawable.libra);
                } else if (textview.getText().toString().equalsIgnoreCase("pisces")) {
                    img.setImageResource(R.drawable.pisces);
                } else if (textview.getText().toString().equalsIgnoreCase("sagittarius")) {
                    img.setImageResource(R.drawable.sagittarius);
                } else if (textview.getText().toString().equalsIgnoreCase("scorpio")) {
                    img.setImageResource(R.drawable.scorpio);
                } else if (textview.getText().toString().equalsIgnoreCase("taurus")) {
                    img.setImageResource(R.drawable.taurus);
                } else if (textview.getText().toString().equalsIgnoreCase("virgo")) {
                    img.setImageResource(R.drawable.virgo);
                }

            }
        });

        return rootView;

    }
}
