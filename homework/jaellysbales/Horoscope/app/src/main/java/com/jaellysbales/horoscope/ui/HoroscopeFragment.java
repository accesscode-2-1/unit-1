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
                switch (buttonId) {
                    case R.id.icon_aquarius:
                        sign = "Aquarius";
                        break;
                    case R.id.icon_aries:
                        sign = "Aries";
                        break;
                    case R.id.icon_cancer:
                        sign = "Cancer";
                        break;
                    case R.id.icon_capricorn:
                        sign = "Capricorn";
                        break;
                    case R.id.icon_gemini:
                        sign = "Gemini";
                        break;
                    case R.id.icon_leo:
                        sign = "Leo";
                        break;
                    case R.id.icon_libra:
                        sign = "Libra";
                        break;
                    case R.id.icon_pisces:
                        sign = "Pisces";
                        break;
                    case R.id.icon_sagittarius:
                        sign = "Sagittarius";
                        break;
                    case R.id.icon_scorpio:
                        sign = "Scorpio";
                        break;
                    case R.id.icon_taurus:
                        sign = "Taurus";
                        break;
                    case R.id.icon_virgo:
                        sign = "Virgo";
                        break;
                    default:
                        throw new UnsupportedOperationException("should never happen");
                }

                FragmentActivity hostActivity = HoroscopeFragment.this.getActivity();
                FragmentManager fragmentManager = hostActivity.getSupportFragmentManager();

                Fragment fragment = new HoroscopeSignFragment();
                Bundle args = new Bundle();
                args.putString("SIGN", sign);
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