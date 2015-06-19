package hoshikoo.c4q.nyc.wk1_horoscope;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;



/**
 * A simple {@link Fragment} subclass.
 */
public class EnterBirthdayFragment extends Fragment {


//    public EnterBirthdayFragment() {
//        // Required empty public constructor
//    }


    public interface EnterBirthdayFragmentListner {

        void onEnterBirthdayDone(String resultSign);
    }

    private static EnterBirthdayFragment instance = null;
    private EnterBirthdayFragmentListner mListener = null;

    public static EnterBirthdayFragment getInstance() {
        if (instance == null) {
            instance = new EnterBirthdayFragment();
        }

        return instance;
    }

//    private void setupGetZodiacSignListeners(View view) {
//        Button getZodiac = (Button) view.findViewById(R.id.get_zodiac_sign);
//        getZodiac.setOnClickListener(getResultZodiacListner);
//
//    }

//    private View.OnClickListener getResultZodiacListner = (new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//
//        }
//    });

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_enter_birthday, container, false);

        setupGetZodiacSignListeners(view);
        setSpinnerContent(view);
        return view;

    }
//
//    private void birthdayListener(View view) {
//        TextView tv = (TextView) view.findViewById(R.id.zodiac_sign_result);
//        tv.setText(resultSign);
//    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mListener = (EnterBirthdayFragmentListner) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    private Spinner spinnerMonth;
    private Spinner spinnerDate;
    private void setSpinnerContent( View view )
    {
        spinnerMonth = (Spinner) view.findViewById( R.id.spinner3);
        spinnerDate = (Spinner) view.findViewById( R.id.spinner4);

        ArrayAdapter <CharSequence>adapter3 = ArrayAdapter.createFromResource( getActivity(), R.array.month_array , android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMonth.setAdapter(adapter3);

        ArrayAdapter <CharSequence>adapter4 = ArrayAdapter.createFromResource( getActivity(), R.array.date_array , android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDate.setAdapter( adapter4 );

    }

    private void setupGetZodiacSignListeners (View view) {


        Button submitButton = (Button) view.findViewById(R.id.get_zodiac_sign);
        submitButton.setOnClickListener(getResultZodiacListner);
//        TextView zodiacSign =(TextView)view.findViewById(R.id.zodiac_sign_result);
//        zodiacSign.setText(resultSign);

//        TextView tv = (TextView) view.findViewById(R.id.zodiac_sign_result);
//
//        tv.setText(resultSign);
    }

    String resultSign = "";

    private View.OnClickListener getResultZodiacListner = (new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String month = spinnerMonth.getSelectedItem().toString();

            if (month.equalsIgnoreCase("Jan")){
                month= "1";
            }else if (month.equalsIgnoreCase("Feb")){
                month= "2";
            }else if (month.equalsIgnoreCase("Mar")) {
                month = "3";
            }else if (month.equalsIgnoreCase("Apr")) {
                month = "4";
            }
            else if (month.equalsIgnoreCase("May")) {
                month = "5";
            }
            else if (month.equalsIgnoreCase("Jun")) {
                month = "6";
            }
            else if (month.equalsIgnoreCase("Jul")) {
                month = "7";
            }
            else if (month.equalsIgnoreCase("Aug")) {
                month = "8";
            }
            else if (month.equalsIgnoreCase("Sep")) {
                month = "9";
            }
            else if (month.equalsIgnoreCase("Oct")) {
                month = "10";
            }else if (month.equalsIgnoreCase("Nov")) {
                month = "11";
            }else if (month.equalsIgnoreCase("Dec")) {
                month = "12";
            }




            String date = spinnerDate.getSelectedItem().toString();

            int bd = Integer.parseInt(month+date);


            if ( bd>=321 && bd<=331 || bd>=401 && bd <=419){
                resultSign = "Your Zodiac Sign is Aries";
            }else if ( bd>=420 && bd<=430 ||bd>=501 && bd<=520 ){
                resultSign = "Your Zodiac Sign is Taurus";
            }else if ( bd>=521 && bd<=531 ||bd>=601 && bd<=621 ){
                resultSign = "Your Zodiac Sign is Gemini";

            }else if ( bd>=622 && bd<=630 ||bd>=701 && bd<=722 ){
                resultSign = "Your Zodiac Sign is Cancer";

            }else if ( bd>=723 && bd<=731 ||bd>=801 && bd<=822 ) {
                resultSign = "Your Zodiac Sign is Leo";

            }else if ( bd>=823 && bd<=831 ||bd>=901 && bd<=922 ) {
                resultSign = "Your Zodiac Sign is Virgo";

            }else if ( bd>=923 && bd<=930 ||bd>=1001 && bd<=1023 ) {
                resultSign = "Your Zodiac Sign is Libra";

            }else if ( bd>=1024 && bd<=1031 ||bd>=1101 && bd<=1120 ) {
                resultSign = "Your Zodiac Sign is Scorpio";

            }else if ( bd>=1121 && bd<=1130 ||bd>=1201 && bd<=1222 ) {
                resultSign = "Your Zodiac Sign is Sagittarius";

            }else if ( bd>=1223 && bd<=1231 ||bd>=101 && bd<=120 ) {
                resultSign = "Your Zodiac Sign is Capricorn";
            }else if ( bd>=121 && bd<=131 ||bd>=201 && bd<=221 ) {
                resultSign = "Your Zodiac Sign is Aquarius";
            }else if ( bd>=222 && bd<=229 ||bd>=301 && bd<=320 ) {
                resultSign = "Your Zodiac Sign is Pisces";
            }else {
                resultSign = "You enter the wrong info.  Please try again.";
            }



            if (mListener != null) {
                mListener.onEnterBirthdayDone(resultSign);
            }
        }
    });





}
