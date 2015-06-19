package hoshikoo.c4q.nyc.wk1_horoscope;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class GameFragment extends Fragment {

    public interface GameFragmentListener {
        void onGameDone(String answer, String rightWrong);
    }

    private static GameFragment instance = null;
    private GameFragmentListener mListener = null;

    public static GameFragment getInstance() {
        if (instance == null) {
            instance = new GameFragment();
        }

        return instance;
    }


    private Spinner spinner;
    int birthMonth,birthDate;
    String BDMonth ="";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_game, container, false);
        setupGameListeners(view);
        setSpinnerContent(view);
        setRandomBirthday(view);
        setTimer(view);
       // answerListeners(view);
        setSpinnerContent( view );
        return view;

    }




    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mListener = (GameFragmentListener) activity;

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    private  void  setTimer (final View view){
        new CountDownTimer(30000, 1000) {
            TextView answerTV =(TextView)view.findViewById(R.id.answer);

            public void onTick(long millisUntilFinished) {
                answerTV.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                answerTV.setText("Correct answer is "+answer);
            }
        }.start();
    }


    private void setSpinnerContent( View view )
    {
        spinner = (Spinner) view.findViewById( R.id.spinnerZodiac);

        ArrayAdapter <CharSequence> adapter5 = ArrayAdapter.createFromResource( getActivity(), R.array.zodiac_array , android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter5);
    }

    private void setupGameListeners(View view) {
        Button submitbutton = (Button) view.findViewById(R.id.answerButton);
        submitbutton.setOnClickListener(answerButtonListner);
    }

    String answer = "";
    int bd;
    private void setRandomBirthday(View view) {

        int date [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        int month [] ={1,2,3,4,5,6,7,8,9,10,11,12};
        Random randomMonth = new Random();
        Random randomDate = new Random();

        birthMonth = month[randomMonth.nextInt(month.length)];
        birthDate = date[randomDate.nextInt(date.length)];


        if(birthMonth==1){
            BDMonth = "Jan";
        }else if(birthMonth==2){
            BDMonth = "Feb";
        }else if(birthMonth==3){
            BDMonth = "Mar";
        }else if(birthMonth==4){
            BDMonth = "Apr";
        }else if(birthMonth==5){
            BDMonth = "May";
        }else if(birthMonth==6){
            BDMonth = "Jun";
        }else if(birthMonth==7){
            BDMonth = "Jul";
        }else if(birthMonth==8){
            BDMonth = "Aug";
        }else if(birthMonth==9){
            BDMonth = "Sep";
        }else if(birthMonth==10){
            BDMonth = "Oct";
        }else if(birthMonth==11){
            BDMonth = "Nov";
        }else if(birthMonth==12){
            BDMonth = "Dec";
        }

        TextView randomBd =(TextView)view.findViewById(R.id.randomBD);
        randomBd.setText(BDMonth+" "+Integer.toString(birthDate));

    }

//    private View.OnClickListener signAnswersubmitListner = (new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//
//        }
//    });





//
//    private void answerListeners(View view) {
//
//
//        Button submitButton = (Button) view.findViewById(R.id.answerButton);
//        submitButton.setOnClickListener(answerButtonListner );
//
//        TextView tv = (TextView) view.findViewById(R.id.matched_msg);
//
//        tv.setText(result);
//    }
    String rightWrong = "";

    private View.OnClickListener answerButtonListner  = (new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String answerUser = spinner.getSelectedItem().toString();

            String birthdayStr = Integer.toString(birthMonth)+Integer.toString(birthDate);
            bd = Integer.parseInt(birthdayStr);


            if ( bd>=321 && bd<=331 || bd>=401 && bd <=419){
                answer = "Aries";

            }else if ( bd>=420 && bd<=430 ||bd>=501 && bd<=520 ){
                answer = "Taurus";

            }else if ( bd>=521 && bd<=531 ||bd>=601 && bd<=621 ){
                answer = "Gemini";

            }else if ( bd>=622 && bd<=630 ||bd>=701 && bd<=722 ){
                answer = "Cancer";

            }else if ( bd>=723 && bd<=731 ||bd>=801 && bd<=822 ) {
                answer = "Leo";

            }else if ( bd>=823 && bd<=831 ||bd>=901 && bd<=922 ) {
                answer = "Virgo";

            }else if ( bd>=923 && bd<=930 ||bd>=1001 && bd<=1023 ) {
                answer = "Libra";

            }else if ( bd>=1024 && bd<=1031 ||bd>=1101 && bd<=1120 ) {
                answer = "Scorpio";

            }else if ( bd>=1121 && bd<=1130 ||bd>=1201 && bd<=1222 ) {
                answer = "Sagittarius";

            }else if ( bd>=1223 && bd<=1231 ||bd>=101 && bd<=120 ) {
                answer = "Capricorn";

            }else if ( bd>=121 && bd<=131 ||bd>=201 && bd<=221 ) {
                answer = "Aquarius";

            }else if ( bd>=222 && bd<=229 ||bd>=301 && bd<=320 ) {
                answer = "Pisces";

            }

            if(answerUser.equals(answer)){
                rightWrong = "You are collect";
            }else if(answerUser.equals("Select")){
                rightWrong = "Please select a zodiac sign";
            }else{
                rightWrong = "You are wrong";
            }



            if (mListener != null) {
                mListener.onGameDone(answer, rightWrong);
            }
        }
    });
}
