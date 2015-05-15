package ksmaragh.c4q.nyc.horoscope;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.Calendar;
import java.util.TimeZone;

public class BirthdayZodiacFragment extends android.support.v4.app.Fragment {

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_birthday_zodiac, container, false);

        addListenerOnButton(rootView);
        return rootView;
    }

    private Spinner monthSpin, daySpin;
    private Button btnSubmit;
    private TextView signName, signInfo;

    public void addListenerOnButton(View view) {

        monthSpin = (Spinner) view.findViewById(R.id.months);
        daySpin = (Spinner) view.findViewById(R.id.days);
        btnSubmit = (Button) view.findViewById(R.id.btnSubmit);
        signName = (TextView) view.findViewById(R.id.signName);
        signInfo = (TextView) view.findViewById(R.id.zodiacInfo);

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int month = convertMonth(String.valueOf(monthSpin.getSelectedItem()));
                int day = Integer.parseInt(String.valueOf(daySpin.getSelectedItem()));
                String sign = findZodiacSign(month, day);
                String info = zodiacSignInfo(sign);
                signName.setText(sign);
                signInfo.setText(info);
            }

        });
    }

    public static String findZodiacSign(int month, int day) {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.set(2015, month, day);
        int calendarDay = calendar.get(Calendar.DAY_OF_YEAR);


        if (calendarDay >= 20 && calendarDay <= 50)
            return "Aquarius";
        else if (calendarDay >= 51 && calendarDay <= 80)
            return "Pisces";
        else if (calendarDay >= 81 && calendarDay <= 110)
            return "Aries";
        else if (calendarDay >= 111 && calendarDay <= 141)
            return "Taurus";
        else if (calendarDay >= 142 && calendarDay <= 172)
            return "Gemini";
        else if (calendarDay >= 173 && calendarDay <= 204)
            return "Cancer";
        else if (calendarDay >= 205 && calendarDay <= 235)
            return "Leo";
        else if (calendarDay >= 236 && calendarDay <= 266)
            return "Virgo";
        else if (calendarDay >= 267 && calendarDay <= 296)
            return "Libra";
        else if (calendarDay >= 297 && calendarDay <= 326)
            return "Scorpio";
        else if (calendarDay >= 327 && calendarDay <= 356)
            return "Sagitarius";
        else if (calendarDay >= 357 && calendarDay <= 19)
            return "Capricorn";
        else
            return "Not a sign";
    }

    public String zodiacSignInfo(String sign) {
        if (sign.equals("Aquarius"))
            return "Aquarius stuff";
        else if (sign.equals("Pisces"))
            return "Pisces stuff";
        else if (sign.equals("Aries"))
            return "Aries stuff";
        else if (sign.equals("Taurus"))
            return "Taurus stuff";
        else if (sign.equals("Gemini"))
            return "Gemini stuff";
        else if (sign.equals("Cancer"))
            return "Cancer stuff";
        else if (sign.equals("Leo"))
            return "Leo stuff";
        else if (sign.equals("Virgo"))
            return "Virgo stuff";
        else if (sign.equals("Libra"))
            return "Libra stuff";
        else if (sign.equals("Scorpio"))
            return "Scorpio stuff";
        else if (sign.equals("Sagitarius"))
            return "Sagitarius stuff";
        else if (sign.equals("Capricorn"))
            return "Capricorn stuff";
        else
            return "Not a sign";
    }


    public static int convertMonth(String month) {
        if (month.equals("January"))
            return 1;
        else if (month.equals("February"))
            return 2;
        else if (month.equals("March"))
            return 3;
        else if (month.equals("April"))
            return 4;
        else if (month.equals("May"))
            return 5;
        else if (month.equals("June"))
            return 6;
        else if (month.equals("July"))
            return 7;
        else if (month.equals("August"))
            return 8;
        else if (month.equals("September"))
            return 9;
        else if (month.equals("October"))
            return 10;
        else if (month.equals("November"))
            return 11;
        else if (month.equals("December"))
            return 12;
        else
<<<<<<< HEAD
            return 13;
=======
            return 0;
>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500
    }
}
