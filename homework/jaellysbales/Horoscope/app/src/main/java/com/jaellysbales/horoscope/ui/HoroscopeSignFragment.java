package com.jaellysbales.horoscope.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jaellysbales.horoscope.R;

import java.util.HashMap;

/**
 * Created by jaellysbales on 5/8/15.
 */
public class HoroscopeSignFragment extends Fragment {
    private String sign;
    private String description;
    private String startDate;
    private String endDate;
    private String horoscope;
    private HashMap<String, Integer> icons;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        icons = new HashMap<String, Integer>();
        icons.put("Aquarius", R.drawable.zodiac_icon_aquarius);
        icons.put("Aries", R.drawable.zodiac_icon_aries);
        icons.put("Cancer", R.drawable.zodiac_icon_cancer);
        icons.put("Capricorn", R.drawable.zodiac_icon_capricorn);
        icons.put("Gemini", R.drawable.zodiac_icon_gemini);
        icons.put("Leo", R.drawable.zodiac_icon_leo);
        icons.put("Libra", R.drawable.zodiac_icon_libra);
        icons.put("Pisces", R.drawable.zodiac_icon_pisces);
        icons.put("Sagittarius", R.drawable.zodiac_icon_sagittarius);
        icons.put("Scorpio", R.drawable.zodiac_icon_scorpio);
        icons.put("Taurus", R.drawable.zodiac_icon_taurus);
        icons.put("Virgo", R.drawable.zodiac_icon_virgo);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Bundle args = getArguments();
        sign = args.getString("SIGN");

        return inflater.inflate(R.layout.fragment_horoscope_sign, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //Toast.makeText(HoroscopeSignFragment.this.getActivity(), "Sign TEST!", Toast.LENGTH_SHORT).show();

        Bundle args = getArguments();
        startDate = args.getString("STARTDATE");
//        description = args.getString("DESCRIPTION");
        endDate = args.getString("ENDDATE");
        horoscope = args.getString("HOROSCOPE");

        TextView myTitle = (TextView) view.findViewById(R.id.sign_title);
//        TextView myDescription = (TextView) view.findViewById(R.id.sign_description);
        ImageView myIcon = (ImageView) view.findViewById(R.id.sign_icon);
        TextView myDateRange = (TextView) view.findViewById(R.id.sign_range);
        TextView myHoroscope = (TextView) view.findViewById(R.id.sign_horoscope);

        myTitle.setText(sign);
//        myDescription.setText(description);
        myIcon.setImageResource(icons.get(sign)); // TODO: Fix me, I don't show the right icon! Hashmaps grr.
        myDateRange.setText(startDate + " - " + endDate);
        myHoroscope.setText(horoscope);


    }
}
