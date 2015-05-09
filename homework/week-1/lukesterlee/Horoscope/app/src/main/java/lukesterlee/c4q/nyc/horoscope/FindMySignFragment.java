package lukesterlee.c4q.nyc.horoscope;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
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
public class FindMySignFragment extends Fragment {

    SignFragment.OnSignSelectedListener mActivityCallBack;

    View result;
    DatePicker picker;
    Button submitButton;
    Button readMoreButton;
    TextView myDate;
    String sign;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(getArguments().getInt("position"));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        result = inflater.inflate(R.layout.fragment_findsign, container, false);
        readMoreButton = (Button) result.findViewById(R.id.read_more_sign_button);
        readMoreButton.setVisibility(View.INVISIBLE);
        picker = (DatePicker) result.findViewById(R.id.datePicker);
        myDate = (TextView) result.findViewById(R.id.myDate);
        submitButton = (Button) result.findViewById(R.id.dateButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = Calculator.getSign(picker.getMonth() + 1, picker.getDayOfMonth());
                myDate.setText("Your sign is " + sign);
                readMoreButton.setVisibility(View.VISIBLE);
                readMoreButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        int position = Calculator.getPosition(sign);
                        DescriptionFragment description = new DescriptionFragment();
                        Bundle argument = new Bundle();
                        argument.putInt(DescriptionFragment.POSITION, position);
                        description.setArguments(argument);

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();

                        transaction.replace(R.id.container, description).addToBackStack(null).commit();

                    }
                });
            }
        });



        return result;
    }
}
