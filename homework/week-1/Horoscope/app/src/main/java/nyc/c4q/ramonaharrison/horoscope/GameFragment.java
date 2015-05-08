package nyc.c4q.ramonaharrison.horoscope;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link GameFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link GameFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GameFragment extends Fragment  {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ArrayList<String> signList = new ArrayList<String>();
    private Random random = new Random();
    private int guess;
    private int sign;
    private int month;
    private int day;
    private int randomDay;
    private int randomMonth;
    private String dateDisplay;


    private OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GameFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GameFragment newInstance(String param1, String param2) {
        GameFragment fragment = new GameFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public GameFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_game, container, false);

        Resources res = getResources();
        setUpGame(view, res);

        // set up spinner
        final String[] signs = res.getStringArray(R.array.signs_array);
        signList.addAll(Arrays.asList(signs));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, signList);
        Spinner spinner = (Spinner) view.findViewById(R.id.spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id)
            {
                Log.d("test", "pos: " + position + "id: " + id);
                guess = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                guess = 0;
            }
        });

        Button button = (Button) view.findViewById(R.id.game_button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                setResult();
                Log.d("test", "guess: " + guess + "sign: " + sign);
            }
        });

        final TextView countdown = (TextView) view.findViewById(R.id.countdown_timer);

        new CountDownTimer(9000, 1000) {

            public void onTick(long millisUntilFinished) {
                countdown.setText("00:0" + millisUntilFinished / 1000);

            }

            public void onFinish() {
                countdown.setText(signs[sign]);
                Toast.makeText(getActivity().getApplicationContext(), "Out of time!", Toast.LENGTH_SHORT).show();
            }
        }.start();

        return view;
    }

    public void setUpGame(View view, Resources res) {
        randomDay = random.nextInt(28);
        randomMonth = random.nextInt(12);
        sign = getSign(randomMonth, randomDay);
        dateDisplay = getDisplayDate(randomMonth, randomDay, res);

        TextView signDate = (TextView) view.findViewById(R.id.sign_date);
        signDate.setText(dateDisplay);

    }

    public String getDisplayDate(int month, int day, Resources res) {
        String[] months = res.getStringArray(R.array.months_array);
        return months[month] + " " + day;
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

    public void setResult() {
        TextView result = (TextView) getActivity().findViewById(R.id.result);

        if (guess == sign) {
            Toast.makeText(getActivity().getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity().getApplicationContext(), "Wrong Answer!", Toast.LENGTH_SHORT).show();
        }
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
        // TODO: Update argument type and name
        public void onGameFragmentInteraction();
    }

}
