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


public class CompatibiltyFragment extends Fragment {

    public interface CompatibilityFragmentListener {
        void onCompatiblityDone(String result);
    }

    private static CompatibiltyFragment instance = null;
    private CompatibilityFragmentListener mListener = null;

    public static CompatibiltyFragment getInstance() {
        if (instance == null) {
            instance = new CompatibiltyFragment();
        }

        return instance;
    }


    private void setupCompatibilityListeners(View view) {
        Button submit = (Button) view.findViewById(R.id.btnSubmit);
        submit.setOnClickListener(signSelectsubmitListner);

    }

    private View.OnClickListener signSelectsubmitListner = (new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    });


    private Spinner spinner;
    private Spinner spinner2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.compatibility_fragment, container, false);
        configureListeners(view);
        setSpinnerContent( view );
        return view;

    }

    private void setSpinnerContent( View view )
    {
        spinner = (Spinner) view.findViewById( R.id.spinner);
        spinner2 = (Spinner) view.findViewById( R.id.spinner2);

        ArrayAdapter <CharSequence>adapter = ArrayAdapter.createFromResource( getActivity(), R.array.zodiac_array , android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        ArrayAdapter <CharSequence>adapter2 = ArrayAdapter.createFromResource( getActivity(), R.array.zodiac_array , android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter( adapter2 );

    }

    private void configureListeners(View view) {


        Button submitButton = (Button) view.findViewById(R.id.btnSubmit);
        submitButton.setOnClickListener(compatibilityButtonListner);

//        TextView tv = (TextView) view.findViewById(R.id.matched_msg);
//
//        tv.setText(result);
    }

    String result = "";
    String signGroup1;
    String signGroup2;

    private View.OnClickListener compatibilityButtonListner = (new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String sign1 = spinner.getSelectedItem().toString();;
            String sign2 = spinner2.getSelectedItem().toString();;

            String fire = "fire";
            String water= "water";
            String wind = "wind";
            String ground = "ground";




            if (sign1.equalsIgnoreCase("Aries")||sign1.equalsIgnoreCase("Leo")||sign1.equalsIgnoreCase("Sagittarius")) {
                signGroup1 = fire;
            }else if (sign1.equalsIgnoreCase("Taurus")||sign1.equalsIgnoreCase("Virgo")||sign1.equalsIgnoreCase("Capricorn")){
                signGroup1 = ground;
            }else if (sign1.equalsIgnoreCase("Cancer")||sign1.equalsIgnoreCase("Scorpio")||sign1.equalsIgnoreCase("Pisces")){
                signGroup1 = water;
            }else if (sign1.equalsIgnoreCase("Gemini")||sign1.equalsIgnoreCase("Libra")||sign1.equalsIgnoreCase("Aquarius")){
                signGroup1 = wind;
            }else{
                signGroup1=null;
            }

            if (sign2.equalsIgnoreCase("Aries")||sign2.equalsIgnoreCase("Leo")||sign2.equalsIgnoreCase("Sagittarius")) {
                signGroup2 = fire;
            }else if (sign2.equalsIgnoreCase("Taurus")||sign2.equalsIgnoreCase("Virgo")||sign2.equalsIgnoreCase("Capricorn")){
                signGroup2 = ground;
            }else if (sign2.equalsIgnoreCase("Cancer")||sign2.equalsIgnoreCase("Scorpio")||sign2.equalsIgnoreCase("Pisces")){
                signGroup2 = water;
            }else if (sign2.equalsIgnoreCase("Gemini")||sign2.equalsIgnoreCase("Libra")||sign2.equalsIgnoreCase("Aquarius")){
                signGroup2 = wind;
            }else{
                signGroup2 = null;
            }

            if (signGroup1==null ||signGroup2==null){
                result = "Error";
            }
            else if(signGroup1.equals(fire)&& signGroup2.equals(fire)){
                result = "Good";
            }else if(signGroup1.equals(water)&& signGroup2.equals(water)){
                result = "Good";
            }else if(signGroup1.equals(wind)&& signGroup2.equals(wind)){
                result = "Good";
            }else if(signGroup1.equals(ground)&& signGroup2.equals(ground)){
                result = "Good";
            }else if(signGroup1.equals(water)&& signGroup2.equals(wind)){
                result = "bad";
            }else if(signGroup2.equals(water)&& signGroup1.equals(wind)){
                result = "bad";
            }
            else if(signGroup1.equals(fire)&& signGroup2.equals(ground)){
                result = "bad";
            }
            else if(signGroup2.equals(fire)&& signGroup1.equals(ground)){
                result = "bad";
            }else if(signGroup1.equals(water)&& signGroup2.equals(fire)){
                result = "OK";
            }else if(signGroup2.equals(water)&& signGroup1.equals(fire)){
                result = "OK";
            }else if(signGroup1.equals(ground)&& signGroup2.equals(wind)){
                result = "OK";
            }else if(signGroup2.equals(ground)&& signGroup1.equals(wind)){
                result = "OK";
            }else if(signGroup1.equals(water)&& signGroup2.equals(ground)){
                result = "Great";
            }else if(signGroup2.equals(water)&& signGroup1.equals(ground)){
                result = "Great";
            }else if(signGroup1.equals(fire)&& signGroup2.equals(wind)){
                result = "Great";
            }else if(signGroup2.equals(fire)&& signGroup1.equals(wind)){
                result = "Great";
            }



            if (mListener != null) {
                mListener.onCompatiblityDone(result);
            }
        }
    });




    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mListener = (CompatibilityFragmentListener) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }




}
