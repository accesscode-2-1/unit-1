package nyc.c4q.sufeiiz.horoscope;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by sufeizhao on 5/7/15.
 */
public class CompatibilityFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public static CompatibilityFragment newInstance(int sectionNumber) {
        CompatibilityFragment fragment = new CompatibilityFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public CompatibilityFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.compatibility, container, false);

        final Spinner sign1 = (Spinner) rootView.findViewById(R.id.sign1);
        final Spinner sign2 = (Spinner) rootView.findViewById(R.id.sign2);
        final Button button = (Button) rootView.findViewById(R.id.submit);
        final TextView textView = (TextView) rootView.findViewById(R.id.compatible_textview);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = (String) sign1.getSelectedItem();
                String two = (String) sign2.getSelectedItem();
                textView.setText(Compatibility(one, two));
            }
        });

        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(getArguments().getInt(ARG_SECTION_NUMBER));
    }

    public static String Compatibility(String sign1, String sign2) {
        ArrayList<String> list = new ArrayList<>();
        list.add(" are the Perfect Match!");
        list.add(" are Good Friends.");
        list.add(" have Complimentary Personalities.");
        list.add(" are Average Companion.");
        list.add(" are Frenemies.");
        list.add(" are the Worst Couple.");

        String compatibility = sign1 + " and " + sign2;
        Random random = new Random();
        int rand = random.nextInt(list.size());

        return compatibility += list.get(rand);
    }
}
