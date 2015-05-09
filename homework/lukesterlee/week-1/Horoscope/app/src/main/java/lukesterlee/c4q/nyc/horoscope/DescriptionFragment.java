package lukesterlee.c4q.nyc.horoscope;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Access Code 2.1 : Unit 1 Homework
 * Created by Luke Lee on 5/7/15.
 */

public class DescriptionFragment extends Fragment {

    public final static String POSITION = "position";

    public static int mCurrentPosition = -1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if (savedInstanceState != null) {
            mCurrentPosition = savedInstanceState.getInt(POSITION);
        }
        return inflater.inflate(R.layout.fragment_description, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        Bundle argument= getArguments();

        if (argument != null) {
            updateDescription(argument.getInt(POSITION));
        } else if (mCurrentPosition != -1) {
            updateDescription(mCurrentPosition);
        }

    }

    // maybe I should delete this. in this state, move to drawer and come back (test this)
    public void updateDescription(int position) {

        TextView description = (TextView) getActivity().findViewById(R.id.description);
        description.setText(Data.description[position]);
        mCurrentPosition = position;

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(POSITION, mCurrentPosition);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }
}
