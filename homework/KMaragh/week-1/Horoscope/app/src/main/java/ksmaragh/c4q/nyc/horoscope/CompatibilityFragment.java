package ksmaragh.c4q.nyc.horoscope;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

<<<<<<< HEAD
import java.util.HashMap;

=======
>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500
/**
 * Created by kadeemmaragh on 5/11/15.
 */
public class CompatibilityFragment extends android.support.v4.app.Fragment {


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_compatibility, container, false);

<<<<<<< HEAD
        setupHashmap();
=======
>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500
        addListenerOnButton(rootView);

        return rootView;

    }

    Spinner firstSign, secondSign;
    TextView compatibilityInfo;
    Button submitBtn;

<<<<<<< HEAD
    private HashMap<String, String> signCompatibility = new HashMap<String, String>();

=======
>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500
    public void addListenerOnButton(View view) {

        firstSign = (Spinner) view.findViewById(R.id.spinner1);
        secondSign = (Spinner) view.findViewById(R.id.spinner2);
        submitBtn = (Button) view.findViewById(R.id.submitbtn);
<<<<<<< HEAD
        compatibilityInfo = (TextView) view.findViewById(R.id.compatibilityInfo);
=======
        compatibilityInfo = (TextView) view.findViewById(R.id.signName);
>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500

        submitBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String signOne = String.valueOf(firstSign.getSelectedItem());
                String signTwo = String.valueOf(secondSign.getSelectedItem());
<<<<<<< HEAD
                compatibilityInfo.setText(signCompatibility.get(signOne));
=======
                //String compatibility = signCompat();
>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500

            }

        });
    }

<<<<<<< HEAD


    public void setupHashmap (){
        signCompatibility.put("Aries",getString(R.string.good));
        signCompatibility.put("Aquarius", getString(R.string.aboveAverage));
        signCompatibility.put("Taurus",getString(R.string.average));
        signCompatibility.put("Gemini",getString(R.string.belowAverage));
        signCompatibility.put("Cancer",getString(R.string.aboveAverage));
        signCompatibility.put("Leo",getString(R.string.bad));
        signCompatibility.put("Virgo",getString(R.string.aboveAverage));
        signCompatibility.put("Libra",getString(R.string.good));
        signCompatibility.put("Scorpio",getString(R.string.bad));
        signCompatibility.put("Sagitarius",getString(R.string.good));
        signCompatibility.put("Capricorn",getString(R.string.belowAverage));
        signCompatibility.put("Pisces",getString(R.string.average));
    }

=======
>>>>>>> 5d8aa141766e275bfd1660cbb88d45cf9da14500
}
