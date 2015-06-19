package hoshikoo.c4q.nyc.myapplication;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RomanticCompatibility extends Fragment {

    private String[] arraySpinner;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        this.arraySpinner = new String[] {
                "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces"
        };

        Spinner s = (Spinner)getView().findViewById(R.id.spinner01);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.fragment_romantic_compatibility, arraySpinner);
//        s.setAdapter(adapter);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_romantic_compatibility, container, false);
    }

}
