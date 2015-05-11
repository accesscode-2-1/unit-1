package com.jaellysbales.horoscope.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.jaellysbales.horoscope.R;

public class CompatibilityFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    private Spinner spinner_sign1, spinner_sign2;
    private Button btnSubmit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_compatibility, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        // Initializing spinners, adding items.
        spinner_sign1 = (Spinner) view.findViewById(R.id.spinner_sign1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(CompatibilityFragment.this.getActivity(),
                R.array.sign_array, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_sign1.setAdapter(adapter1);

        spinner_sign2 = (Spinner) view.findViewById(R.id.spinner_sign2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(CompatibilityFragment.this.getActivity(),
                R.array.sign_array, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_sign2.setAdapter(adapter2);

        // Adding listeners
        spinner_sign1 = (Spinner) view.findViewById(R.id.spinner_sign1);
        spinner_sign1.setOnItemSelectedListener(CompatibilityFragment.this);
        spinner_sign2 = (Spinner) view.findViewById(R.id.spinner_sign2);
        spinner_sign2.setOnItemSelectedListener(CompatibilityFragment.this);

        // I really am not sure how to organize any of this code and it's making me crazy.
        btnSubmit = (Button) view.findViewById(R.id.button_submit);
        spinner_sign1 = (Spinner) view.findViewById(R.id.spinner_sign1);
        spinner_sign2 = (Spinner) view.findViewById(R.id.spinner_sign2);

        spinner_sign1.setOnItemSelectedListener(CompatibilityFragment.this);
        spinner_sign2.setOnItemSelectedListener(CompatibilityFragment.this);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 // Handle submission of spinner selections
                if (spinner_sign1.getSelectedItem().equals("Sign") || (spinner_sign2.getSelectedItem().equals("Sign"))) {
                    Toast.makeText(CompatibilityFragment.this.getActivity(),
                            "Please select a sign.",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    // TextView appearing beneath spinners in view?
                    getCompatibility(String.valueOf(spinner_sign1.getSelectedItem()), String.valueOf(spinner_sign2.getSelectedItem()));

                }
            }
        });
    }

    public void getCompatibility(String sign1, String sign2) {
        String pair = sign1 + " + " + sign2;
        String compatibility;

        // Just randomize this Jae, what were you thinking...?
        if (pair.contains("Aries") && pair.contains("Gemini")
           || pair.contains("Taurus") && pair.contains("Virgo")
           || pair.contains("Leo") && pair.contains("Scorpio")
           || pair.contains("Virgo") && pair.contains("Capricorn")
           || pair.contains("Libra") && pair.contains("Aquarius")
           || pair.contains("Scorpio") && pair.contains("Pisces")
           || pair.contains("Sagittarius") && pair.contains("Leo")
           || pair.contains("Capricorn") && pair.contains("Pisces")
           || pair.contains("Aquarius") && pair.contains("Aries")
           || pair.contains("Pisces") && pair.contains("Cancer"))
        {
            compatibility = "Great";
        }
        else if (pair.contains("Aries") && pair.contains("Capricorn")
                || pair.contains("Taurus") && pair.contains("Leo")
                || pair.contains("Gemini") && pair.contains("Scorpio")
                || pair.contains("Cancer") && pair.contains("Aries")
                || pair.contains("Sagittarius") && pair.contains("Pisces")
                || pair.contains("Scorpio") && pair.contains("Aquarius")
                || pair.contains("Libra") && pair.contains("Cancer")
                || pair.contains("Capricorn") && pair.contains("Libra")
                || pair.contains("Aquarius") && pair.contains("Taurus")
                || pair.contains("Pisces") && pair.contains("Libra")
                || pair.contains("Virgo") && pair.contains("Sagittarius")
                || pair.contains("Pisces") && pair.contains("Libra"))
        {
            compatibility = "Bad";
        }
        else {
            compatibility = "Okay";
        }

        Toast.makeText(CompatibilityFragment.this.getActivity(),
                compatibility + " match!",
                Toast.LENGTH_SHORT).show();
    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
//         TextView sign = (TextView) view;
//            Toast.makeText(CompatibilityFragment.this.getActivity(), sign.getText(), Toast.LENGTH_SHORT).show();

    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}