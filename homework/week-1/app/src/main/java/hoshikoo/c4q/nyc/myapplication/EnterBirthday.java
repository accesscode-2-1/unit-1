package hoshikoo.c4q.nyc.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EnterBirthday extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        final EditText birthday = (EditText) getView().findViewById(R.id.birth_day);

        Button getZodiac = (Button) getView().findViewById(R.id.get_zodiac_sign);
        getZodiac.setOnClickListener(new View.OnClickListener() {
            String zodiacSign;
            @Override
            public void onClick(View v) {

                String birthDay = birthday.getText().toString();
                long bd = Integer.parseInt(birthDay);

                if ( bd>=321 && bd<=331 || bd>=401 && bd <=419){
                    zodiacSign = "Aries";
                }else if ( bd>=420 && bd<=430 ||bd>=501 && bd<=520 ){
                    zodiacSign = "Taurus";
                }else if ( bd>=420 && bd<=430 ||bd>=501 && bd<=520 ){

                }else if ( bd>=521 && bd<=531 ||bd>=601 && bd<=621 ){
                    zodiacSign = "Gemini";

                }else if ( bd>=622 && bd<=630 ||bd>=701 && bd<=722 ){
                    zodiacSign = "Cancer";

                }else if ( bd>=723 && bd<=731 ||bd>=801 && bd<=822 ) {
                    zodiacSign = "Leo";

                }else if ( bd>=823 && bd<=831 ||bd>=901 && bd<=922 ) {
                    zodiacSign = "Virgo";

                }else if ( bd>=923 && bd<=930 ||bd>=1001 && bd<=1023 ) {
                    zodiacSign = "Libra";

                }else if ( bd>=1024 && bd<=1031 ||bd>=1101 && bd<=1120 ) {
                    zodiacSign = "Scorpio";

                }else if ( bd>=1121 && bd<=1130 ||bd>=1201 && bd<=1222 ) {
                    zodiacSign = "Sagittarius";

                }else if ( bd>=1223 && bd<=1231 ||bd>=101 && bd<=120 ) {
                    zodiacSign = "Capricorn";
                }else if ( bd>=121 && bd<=131 ||bd>=201 && bd<=221 ) {
                    zodiacSign = "Aquarius";
                }else if ( bd>=222 && bd<=229 ||bd>=301 && bd<=320 ) {
                    zodiacSign = "Pisces";
                }else {
                    zodiacSign = "no zodiac sign";
                }
                TextView tv = (TextView)getView().findViewById(R.id.zodiac_sign_result);
                tv.setText(zodiacSign);

            }
        });



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_enter_birthday, container, false);
    }



}
