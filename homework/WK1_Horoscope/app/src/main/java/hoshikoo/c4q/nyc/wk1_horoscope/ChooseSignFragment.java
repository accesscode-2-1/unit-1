package hoshikoo.c4q.nyc.wk1_horoscope;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ChooseSignFragment.ChooseSignFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ChooseSignFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChooseSignFragment extends Fragment {

    private ChooseSignFragmentInteractionListener mListener;
    private static ChooseSignFragment fragment = null;

    public static ChooseSignFragment newInstance() {
        if (fragment == null) {
            fragment = new ChooseSignFragment();
        }
        return fragment;
    }

    public ChooseSignFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_choose_sign, container, false);

        setupZodiacSignListeners(view);

        return view;
    }

    private void setupZodiacSignListeners(View view) {
        Button ariesButton = (Button) view.findViewById(R.id.button_Aries);
        ariesButton.setOnClickListener(signSelectButtonListner);

        Button tauruButton = (Button) view.findViewById(R.id.button_Taurus);
        tauruButton.setOnClickListener(signSelectButtonListner);

        Button geminiButton = (Button) view.findViewById(R.id.button_Gemini);
        geminiButton.setOnClickListener(signSelectButtonListner);

        Button leoButton = (Button) view.findViewById(R.id.button_Leo);
        leoButton.setOnClickListener(signSelectButtonListner);

        Button libraButton = (Button) view.findViewById(R.id.button_Libra);
        libraButton.setOnClickListener(signSelectButtonListner);

        Button cancerButton = (Button) view.findViewById(R.id.button_Cancer);
        cancerButton.setOnClickListener(signSelectButtonListner);

        Button virgoButton = (Button) view.findViewById(R.id.button_Virgo);
        virgoButton.setOnClickListener(signSelectButtonListner);

        Button scorpioButton = (Button) view.findViewById(R.id.button_Scorpio);
        scorpioButton.setOnClickListener(signSelectButtonListner);

        Button sagittariusButton = (Button) view.findViewById(R.id.button_Sagittarius);
        sagittariusButton.setOnClickListener(signSelectButtonListner);

        Button capricornButton = (Button) view.findViewById(R.id.button_Capricorn);
        capricornButton.setOnClickListener(signSelectButtonListner);

        Button pisceButton = (Button) view.findViewById(R.id.button_Pisces);
        pisceButton.setOnClickListener(signSelectButtonListner);

        Button aquariusButton = (Button) view.findViewById(R.id.button_Aquarius);
        aquariusButton.setOnClickListener(signSelectButtonListner);



    }

    private View.OnClickListener signSelectButtonListner = (new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String sign = "";


            if (view.getId() == R.id.button_Aries) {
                //sign = "Aries";
                sign = "Aries: Mar 21 to Apr 19 \nPeople falling under this sign are adventurous. They are generally self-willed and courageous. They may be seen as short-tempered individuals. They are clever and confident. On some occasions, they act impatiently. Their impulsiveness and quick temper can go against them. If they overcome these weaknesses, they can achieve success in life, owing to their confidence and clarity of thought.";
            }
            else if (view.getId() == R.id.button_Taurus) {
                //sign = "Taurus";
                sign ="Taurus: Apr 20 to May 20 \n Those belonging to this zodiac sign are romantic. Their love for style and beauty is apparent in their way of living. They are warm at heart and prefer being secure in life. As friends, they are trustworthy and helpful. But they can be possessive about everything they have. This may translate to selfishness and greed. If on guard about these weak areas, a Taurus can make a good company and an excellent friend.";
            }
            else if (view.getId() == R.id.button_Gemini) {
                //sign = "Gemini";
                sign ="Gemini: May 21 to Jun 20 \nPeople belonging to this sign are versatile and quick-witted. They are spontaneous in communication. They come across as intelligent people. Their love towards life is evident in their way of living! But they tend to worry too much on certain issues and fail in managing stress. They form opinions pretty quickly and sometimes appear to look at life superficially.";
            }
            else if (view.getId() == R.id.button_Leo) {
                //sign = "Leo";
                sign ="Leo: Jul 23 to Aug 22\n Leos are generous and open-minded. They are caring in nature. They possess a dominating nature coupled with the knack of taking everyone along. This combination of traits makes them true leaders. They may be egoistic and bossy. They tend to lose their temper quite easily. They are open-minded and openhanded, and show great love for magnificence and luxury. Leos are the real kings!";
            }
            else if (view.getId() == R.id.button_Libra) {
                //sign = "Libra";
                sign ="Libra: Sep 23 to Oct 23\n Their romantic nature is coupled with serenity. They are balanced in nature and know how to keep their cool at all occasions. At times, they find it difficult to express themselves. Though they appear aloof, they are attached to their near ones. They tend to get influenced by the views of others. It makes them indecisive. Apart from these lacunae, they are reasonable and thoughtful.";
            }
            else if (view.getId() == R.id.button_Cancer) {
                //sign = "Cancer";
                sign ="Cancer: Jun 21 to Jul 22\nThose falling under this zodiac sign are sentimental. They have a loving and caring nature. They are cautious in their actions. They are very protective towards their loved ones. This nature makes them excellent and caring parents. Cancers often have an imaginative and artistic side to their life. Their moods vary. Their overly emotional nature needs to be worked on. On the whole, they are good human beings.";
            }
            else if (view.getId() == R.id.button_Virgo) {
                //sign = "Virgo";
                sign ="Virgo: Aug 23 to Sep 22\nThey are very analytical. They tend to think overly on any given subject and form conclusions after a long thought process and deep analysis. They have unidirectional talents. They are absolute purists. Their overcritical nature can become a cause of trouble but otherwise they are intelligent and good decision makers.";
            }
            else if (view.getId() == R.id.button_Scorpio) {
                //sign = "Scorpio";
                sign ="Scorpio: Oct 24 to Nov 22\nScorpios are passionate individuals with a magnetic personality. They are forceful about going by their opinions. They have clarity of thought and expression. Due to their possessive nature, they become jealous quite easily. They are clever and courageous. They can be resentful and obsessive. They seek to take revenge of the wrongdoers.";
            }
            else if (view.getId() == R.id.button_Sagittarius) {
                //sign = "Sagittarius";
                sign ="Sagittarius: Nov 23 to Dec 21\nThey are intelligent and philosophical. They know how to lighten up the atmosphere. They are fun-loving in nature. Sometimes their excessive optimism makes them behave carelessly. Their moods and whims can be bothersome but on the whole, they are intelligent people with a good sense of humor.";
            }
            else if (view.getId() == R.id.button_Capricorn) {
                //sign = "Capricorn";
                sign ="Capricorn: Dec 22 to Jan 19\nThey are prudent and practical. Their ambitious nature does not allow them to give up easily. They are vigilant. They plan very carefully. They may come across as sadistic individuals who are orthodox and rigid. Perseverance and tolerance are their greatest qualities. They are generally upfront in fighting whatever comes in their way.";
            }
            else if (view.getId() == R.id.button_Pisces) {
                //sign = "Pisces";
                sign ="Pisces: Feb 20 to Mar 20\nThey are sensitive and sympathetic. They are kind and helpful. They can go out of their way to help their dear ones. This makes them excellent friends. The opinions of others can easily influence them due to which they may get carried away. They are not very determined or courageous. They are vague in thinking. But their idealism is their true differentiator.";
            }
            else if (view.getId() == R.id.button_Aquarius) {
                //sign = "Aquarius";
                sign ="Aquarius: Jan 20 to Feb 19\nThey are of the intelligent type. A sense of humor, coupled with great intelligence and deep thinking make them stand out. They make loyal and honest friends. They are independent thinkers with great originality in their thoughts and actions. They may appear indifferent and less emotional. It is difficult to understand them.";
            }


            if (mListener != null) {
                mListener.onSignChosen(sign);
            }
        }
    });

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (ChooseSignFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement ChooseSignFragmentInteractionListener");
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
    public interface ChooseSignFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onSignChosen(String sign);
    }

}
