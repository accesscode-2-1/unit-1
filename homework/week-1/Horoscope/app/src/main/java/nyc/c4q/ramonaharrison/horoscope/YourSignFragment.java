package nyc.c4q.ramonaharrison.horoscope;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;
import java.util.TimeZone;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link YourSignFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link YourSignFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class YourSignFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String MONTH = "month";
    private static final String DAY = "day";


    final static String TAG = "test";

    // TODO: Rename and change types of parameters
    private int month;
    private int day;

    private OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param day Parameter 1.
     * @param month Parameter 2.
     * @return A new instance of fragment YourSignFragment.
     */

    public static YourSignFragment newInstance(int month, int day) {
        YourSignFragment fragment = new YourSignFragment();
        Bundle args = new Bundle();
        args.putInt(MONTH, month);
        args.putInt(DAY, day);
        fragment.setArguments(args);
        return fragment;
    }

    public YourSignFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            month = getArguments().getInt(MONTH);
            day = getArguments().getInt(DAY);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_your_sign, container, false);

        DatePicker datePicker = (DatePicker) view.findViewById(R.id.birthdate_edit);
        datePicker.updateDate(1987, 8, 24);

        Button button = (Button) view.findViewById(R.id.birthdate_button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                DatePicker datePicker = (DatePicker) getActivity().findViewById(R.id.birthdate_edit);

                int month = datePicker.getMonth();
                int day = datePicker.getDayOfMonth();
                int sign = getSign(month, day);
                onButtonPressed(sign);
            }
        });

        return view;
    }

    public void onButtonPressed(int sign) {


        if (mListener != null) {
            mListener.onYourSignFragmentInteraction(sign);
        }

    }


    public int getSign(int month, int dayOfMonth) {
        Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
        localCalendar.set(2015, month, dayOfMonth);
        int day = localCalendar.get(Calendar.DAY_OF_YEAR);

        if (day < 22) {
            return 9;
        }
        if (day < 49) {
            return 10;
        }
        if (day < 79) {
            return 11;
        }
        if (day < 109) {
            return 0;
        }
        if (day < 140) {
            return 1;
        }
        if (day < 171) {
            return 2;
        }
        if (day < 203) {
            return 3;
        }
        if (day < 234) {
            return 4;
        }
        if (day < 266) {
            return 5;
        }
        if (day < 295) {
            return 6;
        }
        if (day < 325) {
            return 7;
        }
        if (day < 355) {
            return 8;
        }

        return 0;

    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {

        public void onYourSignFragmentInteraction(int sign);
    }

}
