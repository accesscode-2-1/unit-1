package nyc.c4q.sufeiiz.horoscope;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Random;

/**
 * Created by sufeizhao on 5/8/15.
 */
public class GameFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public static GameFragment newInstance(int sectionNumber) {
        GameFragment fragment = new GameFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public GameFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.game, container, false);

        final TextView textView = (TextView) rootView.findViewById(R.id.question);
        final Spinner answer = (Spinner) rootView.findViewById(R.id.answer);
        final Button enter = (Button) rootView.findViewById(R.id.submit);
        final Button next = (Button) rootView.findViewById(R.id.next);
        final TextView image = (TextView) rootView.findViewById(R.id.grade);

        textView.setText(Question());
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String question = textView.getText().toString();
                String ans = "Your sign is " + answer.getSelectedItem().toString() + "!";
                question = question.replaceAll("/", "-");
                try {
                    String correct = BirthdayFragment.FindHoroscope(question+"-2015");

                    if (correct.equalsIgnoreCase(ans))
                        image.setText("Correct!");
                    else
                        image.setText("Incorrect");
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setText("");
                textView.setText(Question());
            }
        });

        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(getArguments().getInt(ARG_SECTION_NUMBER));
    }

    public static String Question() {
        String date;
        int dayOfYear, month, day;

        Calendar cal = Calendar.getInstance();
        Random random = new Random();
        dayOfYear = random.nextInt(365);

        cal.set(Calendar.DAY_OF_YEAR, dayOfYear);
        month = cal.get(Calendar.MONTH) + 1;
        day = cal.get(Calendar.DATE);
        date = month + "/" + day;

        return date;
    }
}
