package com.example.android.navigationdrawerexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import java.util.ArrayList;

/**
 * Created by Yuliya Kaleda on 5/4/15.
 */
public class FirstFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_first, container, false);

        ArrayList<String> urls = new ArrayList<String>();
        urls.add("http://en.wikipedia.org/wiki/Aquarius_%28astrology%29");
        urls.add("http://en.wikipedia.org/wiki/Aries_%28astrology%29");
        urls.add("http://en.wikipedia.org/wiki/Cancer_%28astrology%29");
        urls.add("http://en.wikipedia.org/wiki/Capricorn_%28astrology%29");
        urls.add("http://en.wikipedia.org/wiki/Gemini_(astrology)");
        urls.add("http://en.wikipedia.org/wiki/Leo_%28astrology%29");
        urls.add("http://en.wikipedia.org/wiki/Libra_%28astrology%29");
        urls.add("http://en.wikipedia.org/wiki/Pisces_%28astrology%29");
        urls.add("http://en.wikipedia.org/wiki/Sagittarius_%28astrology%29");
        urls.add("http://en.wikipedia.org/wiki/Taurus_%28astrology%29");
        urls.add("http://en.wikipedia.org/wiki/Virgo_%28astrology%29");
        urls.add("http://en.wikipedia.org/wiki/Scorpio_%28astrology%29");

        ArrayList<ImageButton> buttons = new ArrayList<ImageButton>();
        buttons.add((ImageButton) rootView.findViewById(R.id.button_aquarius));
        buttons.add((ImageButton) rootView.findViewById(R.id.button_aries));
        buttons.add((ImageButton) rootView.findViewById(R.id.button_cancer));
        buttons.add((ImageButton) rootView.findViewById(R.id.button_capricorn));
        buttons.add((ImageButton) rootView.findViewById(R.id.button_gemini));
        buttons.add((ImageButton) rootView.findViewById(R.id.button_leo));
        buttons.add((ImageButton) rootView.findViewById(R.id.button_libra));
        buttons.add((ImageButton) rootView.findViewById(R.id.button_pisces));
        buttons.add((ImageButton) rootView.findViewById(R.id.button_sagitario));
        buttons.add((ImageButton) rootView.findViewById(R.id.button_taurus));
        buttons.add((ImageButton) rootView.findViewById(R.id.button_virgo));
        buttons.add((ImageButton) rootView.findViewById(R.id.button_scorpio));


       for(int i = 0; i < 12; i ++) {
           try {
               ZodiacButtonListener zodiac = new ZodiacButtonListener(urls.get(i));
               buttons.get(i).setOnClickListener(zodiac);
           } catch (Exception e) {

           }
       }
        return rootView;
    }
}
