package ksmaragh.c4q.nyc.horoscope;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by kadeemmaragh on 5/10/15.
 */
public class MainFragment extends android.support.v4.app.Fragment implements View.OnClickListener {

    //Fragment is created but it's not visible yet.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //This is when the Fragment is visible to the user.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        setupImages(rootView);
        return rootView;
    }


    public void setupImages(View rootView) {
        //Making the images clickable so they can act as buttons

        ImageView iv = (ImageView) rootView.findViewById(R.id.aries);
        iv.setOnClickListener(this);
        iv = (ImageView) rootView.findViewById(R.id.taurus);
        iv.setOnClickListener(this);
        iv = (ImageView) rootView.findViewById(R.id.gemini);
        iv.setOnClickListener(this);
        iv = (ImageView) rootView.findViewById(R.id.cancer);
        iv.setOnClickListener(this);
        iv = (ImageView) rootView.findViewById(R.id.leo);
        iv.setOnClickListener(this);
        iv = (ImageView) rootView.findViewById(R.id.virgo);
        iv.setOnClickListener(this);
        iv = (ImageView) rootView.findViewById(R.id.libra);
        iv.setOnClickListener(this);
        iv = (ImageView) rootView.findViewById(R.id.scorpio);
        iv.setOnClickListener(this);
        iv = (ImageView) rootView.findViewById(R.id.sagittarius);
        iv.setOnClickListener(this);
        iv = (ImageView) rootView.findViewById(R.id.capricorn);
        iv.setOnClickListener(this);
        iv = (ImageView) rootView.findViewById(R.id.aquarius);
        iv.setOnClickListener(this);
        iv = (ImageView) rootView.findViewById(R.id.pisces);
        iv.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(getActivity(), zodiacSignData.class);
        Bundle bundle = new Bundle();

        int signID = v.getId();
        String [] names = getResources().getStringArray(R.array.zodiacSigns);

        switch (signID) {
            case R.id.aries:
                bundle.putString("info", "Aries start with the letter A");
                bundle.putString("name",names[0]);
                i.putExtras(bundle);
                startActivity(i);
                break;
            case R.id.taurus:
                bundle.putString("info", "Taurus start with the letter T");
                bundle.putString("name",names[1]);
                i.putExtras(bundle);
                startActivity(i);
                break;
            case R.id.gemini:
                bundle.putString("info", "Gemini start with the letter G");
                bundle.putString("name",names[2]);
                i.putExtras(bundle);
                startActivity(i);
            case R.id.cancer:
                bundle.putString("info", "Cancer start with the letter C");
                bundle.putString("name",names[3]);
                i.putExtras(bundle);
                startActivity(i);
                break;
            case R.id.leo:
                bundle.putString("info", "Leo start with the letter L");
                bundle.putString("name",names[4]);
                i.putExtras(bundle);
                startActivity(i);
                break;
            case R.id.virgo:
                bundle.putString("info", "Virgo start with the letter V");
                bundle.putString("name",names[5]);
                i.putExtras(bundle);
                startActivity(i);
                break;
            case R.id.libra:
                bundle.putString("info", "Libra start with the letter L");
                bundle.putString("name",names[6]);
                i.putExtras(bundle);
                startActivity(i);
                break;
            case R.id.scorpio:
                bundle.putString("info", "Scorpio start with the letter S");
                bundle.putString("name",names[7]);
                i.putExtras(bundle);
                startActivity(i);
                break;
            case R.id.sagittarius:
                bundle.putString("info", "Sagittarius start with the letter S");
                bundle.putString("name",names[8]);
                i.putExtras(bundle);
                startActivity(i);
                break;
            case R.id.capricorn:
                bundle.putString("info", "Capricorn start with the letter C");
                bundle.putString("name",names[9]);
                i.putExtras(bundle);
                startActivity(i);
                break;
            case R.id.aquarius:
                bundle.putString("info", "Aquarius starts with the letter A");
                bundle.putString("name",names[10]);
                i.putExtras(bundle);
                startActivity(i);
                break;
            case R.id.pisces:
                bundle.putString("info", "Pisces start with the letter P");
                bundle.putString("name",names[11]);
                i.putExtras(bundle);
                startActivity(i);
                break;
        }
    }

}


