package com.jaellysbales.horoscope.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jaellysbales.horoscope.R;

import java.util.HashMap;

/**
 * Created by jaellysbales on 5/10/15.
 */
public class ProfileSignFragment extends Fragment {
    private String sign;
    private String description;
    private String startDate;
    private String endDate;
    private String profile;
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

        return inflater.inflate(R.layout.fragment_profile_sign, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Bundle args = getArguments();
//        description = args.getString("DESCRIPTION");
        startDate = args.getString("STARTDATE");
        endDate = args.getString("ENDDATE");
        profile = args.getString("PROFILE");

        TextView myTitle = (TextView) view.findViewById(R.id.sign_title);
//        TextView myDescription = (TextView) view.findViewById(R.id.sign_description);
        ImageView myIcon = (ImageView) view.findViewById(R.id.sign_icon);
        TextView myDateRange = (TextView) view.findViewById(R.id.sign_range);
        TextView myProfile = (TextView) view.findViewById(R.id.sign_profile);

        myTitle.setText(sign);
//        myDescription.setText(description);
        myIcon.setImageResource(icons.get(sign));
        myDateRange.setText(startDate + " - " + endDate);
        myProfile.setText(profile);

        // TODO: Would really like to implement ViewPager if time allows.
    }
}
