package nyc.c4q.sufeiiz.horoscope;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by sufeizhao on 5/7/15.
 */
public class BirthdayFragment extends android.support.v4.app.Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public static BirthdayFragment newInstance(int sectionNumber) {
        BirthdayFragment fragment = new BirthdayFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public BirthdayFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.find_date, container, false);

        final DatePicker datePicker = (DatePicker) rootView.findViewById(R.id.date_picker);
        final Button button = (Button) rootView.findViewById(R.id.submit);
        final TextView textView = (TextView) rootView.findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int month = datePicker.getMonth()+1;
                int day = datePicker.getDayOfMonth();
                int year = datePicker.getYear();
                try {
                    textView.setText(FindHoroscope(month + "-" + day + "-" + year));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }


    public static String FindHoroscope(String birthday) throws ParseException {
        String horoscope = "Your sign is ";
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy", Locale.US);
        cal.setTime(sdf.parse(birthday));

        int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);

        if (dayOfYear >= 21 && dayOfYear <= 52)
            horoscope += "Aquarius!";
        else if (dayOfYear >= 53 && dayOfYear <= 79)
            horoscope += "Pisces!";
        else if (dayOfYear >= 80 && dayOfYear <= 109)
            horoscope += "Aries!";
        else if (dayOfYear >= 110 && dayOfYear <= 140)
            horoscope += "Taurus!";
        else if (dayOfYear >= 141 && dayOfYear <= 172)
            horoscope += "Gemini!";
        else if (dayOfYear >= 173 && dayOfYear <= 203)
            horoscope += "Cancer!";
        else if (dayOfYear >= 204 && dayOfYear <= 234)
            horoscope += "Leo!";
        else if (dayOfYear >= 235 && dayOfYear <= 265)
            horoscope += "Virgo!";
        else if (dayOfYear >= 266 && dayOfYear <= 296)
            horoscope += "Libra!";
        else if (dayOfYear >= 297 && dayOfYear <= 324)
            horoscope += "Scorpio!";
        else
            horoscope += "Capricorn!";

        return horoscope;
    }
}
