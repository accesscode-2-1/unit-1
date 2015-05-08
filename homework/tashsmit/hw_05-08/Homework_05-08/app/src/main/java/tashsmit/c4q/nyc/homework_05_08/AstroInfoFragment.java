package tashsmit.c4q.nyc.homework_05_08;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by c4q-tashasmith on 5/7/15.
 */
public class AstroInfoFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //return inflater.inflate(R.layout.astro_info, container, false);
        //return super.onCreateView(inflater, container, savedInstanceState);

        final View myInflatedView = inflater.inflate(R.layout.astro_info, container,false);

        Button waterButton = (Button) myInflatedView.findViewById(R.id.water);
        waterButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView info = (TextView) myInflatedView.findViewById(R.id.info);
                info.setText("Water signs are attuned to waves of emotion, and often seem to have a built-in sonar for reading a mood. \n" +
                "This gives them a special sensitivity in relationships, knowing when to show warmth and when to hold back.\n" +
                "The three water signs are: Pisces, Scorpio and Cancer.");
            }
        });

        Button fireButton = (Button) myInflatedView.findViewById(R.id.fire);
        fireButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView info = (TextView) myInflatedView.findViewById(R.id.info);
                info.setText("As one would expect, those graced by Fire are fiery, indeed. They are enthusiastic and sometimes larger than life.\n" +
                        "Just like a fire that is left untended, however, Fire signs can burn out of control -- so it's best to tend those embers.\n" +
                        "The three water signs are: Aries, Sagittarius and Leo.");
            }
        });

        Button airButton = (Button) myInflatedView.findViewById(R.id.air);
        airButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView info = (TextView) myInflatedView.findViewById(R.id.info);
                info.setText("Airy people are smart thinkers and handle abstract reasoning well.\n" +
                        "They love to analyze, synthesize and probe. Do you have a dilemma? Hand it over to an Air sign and watch them go to work.\n" +
                        "The three water signs are: Gemini, Libra and Aquarius.");
            }
        });

        Button earthButton = (Button) myInflatedView.findViewById(R.id.earth);
        earthButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView info = (TextView) myInflatedView.findViewById(R.id.info);
                info.setText("Earth signs blend in with their natural habitat. They're sensual, meaning they engage with life through the five senses\n" +
                        "It takes time to sense the dense physical world, and earth signs can operate at a slower, more thorough pace than the other elements.\n" +
                        "The three water signs are: Capicorn, Taurus and Virgo.");

            }
        });

        return myInflatedView;

    }
}
