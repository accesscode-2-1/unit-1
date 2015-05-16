package com.example.android.navigationdrawerexample;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Yuliya Kaleda on 5/4/15.
 */
public class ThirdFragment extends Fragment {

    int mNumOfClicks = 0;
    int i;
    int firstB;
    int secondB;
    ArrayList<ImageButton> buttons;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_first, container, false);

        buttons = new ArrayList<ImageButton>();
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


        //set all buttons on ClickListener
        for (i = 0; i < 12; i++) {
            buttons.get(i).setOnClickListener((new View.OnClickListener() {

                public void onClick(View v) {

                    //when only the 1 button is clicked, get its ID, do nothing
                    if (mNumOfClicks == 0) {
                        mNumOfClicks += 1;
                        firstB = v.getId();
                        Toast.makeText(getActivity(), "Choose another sign to read about your compatibility", Toast.LENGTH_LONG).show();
                    }

                    //when the 2 buttons is clicked, get its ID and go to the website to read about love compatibility
                    else if (mNumOfClicks == 1) {
                        secondB = v.getId();
                        Toast.makeText(getActivity(), "Compatibility is set", Toast.LENGTH_LONG).show();

                        String url = coupleUrl(firstB, secondB);
                        Intent i = new Intent(Intent.ACTION_VIEW);

                        i.setData(Uri.parse(url));
                        mNumOfClicks = 0;

                        // get an activity reference
                        Activity act = MainActivity.getActivity();
                        act.startActivity(i);
                    }
                }
            }));

        }
        return rootView;
    }


    //the purpose of this method is not to provide the right website about romantic compatibility for just two signs, but to
    //set two buttons on ClickListener
    public String coupleUrl(int firstB, int secondB) {
        String result = "";

        if (firstB == R.id.button_aries || secondB == R.id.button_aries) {

            result = "http://www.psychicguild.com/zodiac-compatibility/Aries";
        } else if (firstB == R.id.button_aquarius || secondB == R.id.button_aquarius)

            result = "http://www.psychicguild.com/zodiac-compatibility/Aquarius";

        else if (firstB == R.id.button_taurus || secondB == R.id.button_taurus)

            result = "http://www.psychicguild.com/zodiac-compatibility/Taurus";

        else if (firstB == R.id.button_gemini || secondB == R.id.button_gemini)

            result = "http://www.psychicguild.com/zodiac-compatibility/Gemini";

        else if (firstB == R.id.button_cancer || secondB == R.id.button_cancer)

            result = "http://www.psychicguild.com/zodiac-compatibility/Cancer";

        else if (firstB == R.id.button_leo || secondB == R.id.button_leo)

            result = "http://www.psychicguild.com/zodiac-compatibility/Leo";

        else if (firstB == R.id.button_virgo || secondB == R.id.button_virgo)

            result = "http://www.psychicguild.com/zodiac-compatibility/Virgo";

        else if (firstB == R.id.button_libra || secondB == R.id.button_libra)

            result = "http://www.psychicguild.com/zodiac-compatibility/Libra";

        else if (firstB == R.id.button_scorpio || secondB == R.id.button_scorpio)

            result = "http://www.psychicguild.com/zodiac-compatibility/Scorpio";

        else if (firstB == R.id.button_sagitario || secondB == R.id.button_sagitario)

            result = "http://www.psychicguild.com/zodiac-compatibility/Sagittarius";

        else if (firstB == R.id.button_capricorn || secondB == R.id.button_capricorn)

            result = "http://www.psychicguild.com/zodiac-compatibility/Capricorn";

        else if (firstB == R.id.button_pisces || secondB == R.id.button_pisces)

            result = "http://www.psychicguild.com/zodiac-compatibility/Pisces";

        return result;
    }
}
