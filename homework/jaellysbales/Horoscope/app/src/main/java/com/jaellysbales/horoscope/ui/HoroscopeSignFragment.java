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
 * Created by jaellysbales on 5/8/15.
 */
public class HoroscopeSignFragment extends Fragment {
    private String sign;
    private HashMap<String, Integer> icons;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        icons = new HashMap<String, Integer>();
        icons.put("Aquarius", R.id.icon_aquarius);
        icons.put("Aries", R.id.icon_aries);
        icons.put("Cancer", R.id.icon_cancer);
        icons.put("Capricorn", R.id.icon_capricorn);
        icons.put("Gemini", R.id.icon_gemini);
        icons.put("Leo", R.id.icon_leo);
        icons.put("Libra", R.id.icon_libra);
        icons.put("Pisces", R.id.icon_pisces);
        icons.put("Sagittarius", R.id.icon_sagittarius);
        icons.put("Scorpio", R.id.icon_scorpio);
        icons.put("Taurus", R.id.icon_taurus);
        icons.put("Virgo", R.id.icon_virgo);
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
        TextView title = (TextView) view.findViewById(R.id.sign_title);
        ImageView icon = (ImageView) view.findViewById(R.id.sign_icon);
        TextView startDate = (TextView) view.findViewById(R.id.sign_start_date);
        TextView endDate = (TextView) view.findViewById(R.id.sign_end_date);
        TextView blurb = (TextView) view.findViewById(R.id.sign_blurb);

        title.setText(sign);
        icon.setImageResource(icons.get(sign));

    }
}
