package lukesterlee.c4q.nyc.horoscope;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

/**
 * Created by Willee on 5/7/15.
 */
public class RomanticFragment extends Fragment {

    TextView answer;
    DatePicker setYour;
    DatePicker setHis;
    Button submitButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View result = inflater.inflate(R.layout.fragment_romantic, container, false);

        setYour = (DatePicker) result.findViewById(R.id.myDate);
        setHis = (DatePicker) result.findViewById(R.id.hisDate);
        answer = (TextView) result.findViewById(R.id.romanticResult);
        submitButton = (Button) result.findViewById(R.id.romanticSubmitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mySign = Calculator.getSign(setYour.getMonth(), setYour.getDayOfMonth());
                String hisSign = Calculator.getSign(setHis.getMonth(), setHis.getDayOfMonth());
                answer.setText(Calculator.doWeMatch(mySign, hisSign));
            }
        });



        return result;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(getArguments().getInt("position"));
    }
}
