package nyc.c4q.ramonaharrison.horoscope;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AboutSignFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AboutSignFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AboutSignFragment extends Fragment {

    private static final String SIGN = "sign";
    private int sign;
    private OnFragmentInteractionListener mListener;
    private int[] signImages = {
            R.drawable.aries,
            R.drawable.taurus,
            R.drawable.gemini,
            R.drawable.cancer,
            R.drawable.leo,
            R.drawable.virgo,
            R.drawable.libra,
            R.drawable.scorpio,
            R.drawable.sagittarius,
            R.drawable.capricorn,
            R.drawable.aquarius,
            R.drawable.pisces,
    };

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param sign - Astrological Sign
     *
     * @return A new instance of fragment AboutSignFragment.
     */

    public static AboutSignFragment newInstance(int sign) {
        AboutSignFragment fragment = new AboutSignFragment();
        Bundle args = new Bundle();
        args.putInt(SIGN, sign);
        fragment.setArguments(args);
        return fragment;
    }

    public AboutSignFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            sign = getArguments().getInt(SIGN);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View aboutSignView = inflater.inflate(R.layout.fragment_about_sign, container, false);

        TextView signTitle = (TextView) aboutSignView.findViewById(R.id.signTitle);
        TextView signDateRange = (TextView) aboutSignView.findViewById(R.id.signDateRange);
        ImageView signImage = (ImageView) aboutSignView.findViewById(R.id.signImage);
        TextView signDescription = (TextView) aboutSignView.findViewById(R.id.signDescription);

        String[] signArray = getResources().getStringArray(R.array.signs_array);
        String[] dateArray = getResources().getStringArray(R.array.dates_array);
        String[] descriptionArray = getResources().getStringArray(R.array.description_array);

        signTitle.setText(signArray[sign]);
        signDateRange.setText(dateArray[sign]);
        signImage.setImageResource(signImages[sign]);
        signDescription.setText(descriptionArray[sign]);

        return aboutSignView;
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
        public void onFragmentInteraction(Uri uri);
    }

}
