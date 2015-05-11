package com.jaellysbales.horoscope.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.jaellysbales.horoscope.R;

public class HoroscopeFragment extends Fragment {
    private ImageButton aquariusButton;
    private ImageButton ariesButton;
    private ImageButton cancerButton;
    private ImageButton capricornButton;
    private ImageButton geminiButton;
    private ImageButton leoButton;
    private ImageButton libraButton;
    private ImageButton piscesButton;
    private ImageButton sagittariusButton;
    private ImageButton scorpioButton;
    private ImageButton taurusButton;
    private ImageButton virgoButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_horoscope, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        aquariusButton = (ImageButton) view.findViewById(R.id.icon_aquarius);
        ariesButton = (ImageButton) view.findViewById(R.id.icon_aries);
        cancerButton = (ImageButton) view.findViewById(R.id.icon_cancer);
        capricornButton = (ImageButton) view.findViewById(R.id.icon_capricorn);
        geminiButton = (ImageButton) view.findViewById(R.id.icon_gemini);
        leoButton = (ImageButton) view.findViewById(R.id.icon_leo);
        libraButton = (ImageButton) view.findViewById(R.id.icon_libra);
        piscesButton = (ImageButton) view.findViewById(R.id.icon_pisces);
        sagittariusButton = (ImageButton) view.findViewById(R.id.icon_sagittarius);
        scorpioButton = (ImageButton) view.findViewById(R.id.icon_scorpio);
        taurusButton = (ImageButton) view.findViewById(R.id.icon_taurus);
        virgoButton = (ImageButton) view.findViewById(R.id.icon_virgo);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(HoroscopeFragment.this.getActivity(), "Test!", Toast.LENGTH_SHORT).show();
                int buttonId = view.getId();
                String sign = null;
                String description = null;
                String startDate = null;
                String endDate = null;
                String horoscope = null;

                switch (buttonId) {
                    case R.id.icon_aquarius:
                        sign = getString(R.string.sign_aquarius);
                        description = getString(R.string.desc_aquarius);
                        startDate = getString(R.string.start_date_aquarius);
                        endDate = getString(R.string.end_date_aquarius);
                        horoscope = getString(R.string.horoscope_aquarius);
                        break;
                    case R.id.icon_aries:
                        sign = getString(R.string.sign_aries);
                        description = getString(R.string.desc_aries);
                        startDate = getString(R.string.start_date_aries);
                        endDate = getString(R.string.end_date_aries);
                        horoscope = getString(R.string.horoscope_aries);
                        break;
                    case R.id.icon_cancer:
                        sign = getString(R.string.sign_cancer);
                        description = getString(R.string.desc_cancer);
                        startDate = getString(R.string.start_date_cancer);
                        endDate = getString(R.string.end_date_cancer);
                        horoscope = getString(R.string.horoscope_cancer);
                        break;
                    case R.id.icon_capricorn:
                        sign = getString(R.string.sign_capricorn);
                        description = getString(R.string.desc_capricorn);
                        startDate = getString(R.string.start_date_capricorn);
                        endDate = getString(R.string.end_date_capricorn);
                        horoscope = getString(R.string.horoscope_capricorn);
                        break;
                    case R.id.icon_gemini:
                        sign = getString(R.string.sign_gemini);
                        description = getString(R.string.desc_gemini);
                        startDate = getString(R.string.start_date_gemini);
                        endDate = getString(R.string.end_date_gemini);
                        horoscope = getString(R.string.horoscope_gemini);
                        break;
                    case R.id.icon_leo:
                        sign = getString(R.string.sign_leo);
                        description = getString(R.string.desc_leo);
                        startDate = getString(R.string.start_date_leo);
                        endDate = getString(R.string.end_date_leo);
                        horoscope = getString(R.string.horoscope_leo);
                        break;
                    case R.id.icon_libra:
                        sign = getString(R.string.sign_libra);
                        description = getString(R.string.desc_libra);
                        startDate = getString(R.string.start_date_libra);
                        endDate = getString(R.string.end_date_libra);
                        horoscope = getString(R.string.horoscope_libra);
                        break;
                    case R.id.icon_pisces:
                        sign = getString(R.string.sign_pisces);
                        description = getString(R.string.desc_pisces);
                        startDate = getString(R.string.start_date_pisces);
                        endDate = getString(R.string.end_date_pisces);
                        horoscope = getString(R.string.horoscope_pisces);
                        break;
                    case R.id.icon_sagittarius:
                        sign = getString(R.string.sign_sagittarius);
                        description = getString(R.string.desc_sagittarius);
                        startDate = getString(R.string.start_date_sagittarius);
                        endDate = getString(R.string.end_date_sagittarius);
                        horoscope = getString(R.string.horoscope_sagittarius);
                        break;
                    case R.id.icon_scorpio:
                        sign = getString(R.string.sign_scorpio);
                        description = getString(R.string.desc_scorpio);
                        startDate = getString(R.string.start_date_scorpio);
                        endDate = getString(R.string.end_date_scorpio);
                        horoscope = getString(R.string.horoscope_scorpio);
                        break;
                    case R.id.icon_taurus:
                        sign = getString(R.string.sign_taurus);
                        description = getString(R.string.desc_taurus);
                        startDate = getString(R.string.start_date_taurus);
                        endDate = getString(R.string.end_date_taurus);
                        horoscope = getString(R.string.horoscope_taurus);
                        break;
                    case R.id.icon_virgo:
                        sign = getString(R.string.sign_virgo);
                        description = getString(R.string.desc_virgo);
                        startDate = getString(R.string.start_date_virgo);
                        endDate = getString(R.string.end_date_virgo);
                        horoscope = getString(R.string.horoscope_virgo);
                        break;
                    default:
                        throw new UnsupportedOperationException("should never happen");
                }

                FragmentActivity hostActivity = HoroscopeFragment.this.getActivity();
                FragmentManager fragmentManager = hostActivity.getSupportFragmentManager();

                Fragment fragment = new HoroscopeSignFragment();
                Bundle args = new Bundle();
                args.putString("SIGN", sign);
                args.putString("DESCRIPTION", description);
                args.putString("STARTDATE", startDate);
                args.putString("ENDDATE", endDate);
                args.putString("HOROSCOPE", horoscope);
                fragment.setArguments(args);

                fragmentManager.
                        beginTransaction().
                        replace(R.id.container_body, fragment).
                        commit();
            }
        };

        aquariusButton.setOnClickListener(clickListener);
        ariesButton.setOnClickListener(clickListener);
        cancerButton.setOnClickListener(clickListener);
        capricornButton.setOnClickListener(clickListener);
        geminiButton.setOnClickListener(clickListener);
        leoButton.setOnClickListener(clickListener);
        libraButton.setOnClickListener(clickListener);
        piscesButton.setOnClickListener(clickListener);
        sagittariusButton.setOnClickListener(clickListener);
        scorpioButton.setOnClickListener(clickListener);
        taurusButton.setOnClickListener(clickListener);
        virgoButton.setOnClickListener(clickListener);
    }
}