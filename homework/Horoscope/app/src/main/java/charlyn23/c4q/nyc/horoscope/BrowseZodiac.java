package charlyn23.c4q.nyc.horoscope;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by charlynbuchanan on 5/7/15.
 */

public class BrowseZodiac extends android.support.v4.app.Fragment implements View.OnClickListener {
    MainActivity m = new MainActivity();

    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_browse_zodiac, container, false);

        ImageButton aquarius = (ImageButton)view.findViewById(R.id.aquarius);
        ImageButton capricorn = (ImageButton)view.findViewById(R.id.capricorn);
        ImageButton pisces = (ImageButton)view.findViewById(R.id.pisces);
        ImageButton aries = (ImageButton)view.findViewById(R.id.aries);
        ImageButton taurus = (ImageButton)view.findViewById(R.id.taurus);
        ImageButton gemini = (ImageButton)view.findViewById(R.id.gemini);
        ImageButton cancer = (ImageButton)view.findViewById(R.id.cancer);
        ImageButton leo = (ImageButton)view.findViewById(R.id.leo);
        ImageButton virgo = (ImageButton)view.findViewById(R.id.virgo);
        ImageButton libra = (ImageButton)view.findViewById(R.id.libra);
        ImageButton scorpio = (ImageButton)view.findViewById(R.id.scorpio);
         ImageButton sagittarius = (ImageButton)view.findViewById(R.id.sagittarius);

        ArrayList<ImageButton> buttons = new ArrayList<ImageButton>();
        buttons.add(aquarius);
        buttons.add(capricorn);
        buttons.add(pisces);
        buttons.add(aries);
        buttons.add(taurus);
        buttons.add(gemini);
        buttons.add(cancer);
        buttons.add(leo);
        buttons.add(virgo);
        buttons.add(libra);
        buttons.add(scorpio);
        buttons.add(sagittarius);

        for (ImageButton i : buttons) {
            i.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.aquarius){
                        //toast

                        System.out.println("aquarius");
                    }
                    if (v.getId() == R.id.capricorn) {
                        //toast
                        System.out.println("capricorn");
                    }
                    if (v.getId() == R.id.pisces) {
                        //toast
                        System.out.println("pisces");
                    }
                    if (v.getId() ==R.id.aries) {
                        //toast
                    }
                    if (v.getId() == R.id.taurus) {
                        //toast
                    }
                    if (v.getId() == R.id.gemini) {
                        //toast
                    }
                    if (v.getId() == R.id.cancer) {
                        //toast
                    }
                    if (v.getId() == R.id.leo) {
                        //toast
                    }
                    if (v.getId() == R.id.virgo) {
                        //toast
                    }
                    if (v.getId() == R.id.libra) {
                        //toast
                    }
                    if (v.getId() == R.id.scorpio) {
                        //toast
                    }
                    if (v.getId() == R.id.sagittarius) {
                        //toast
                    }
                }
            });
        }





        return inflater.inflate(R.layout.fragment_browse_zodiac,  container, false);
        //return super.onCreateView(inflater, container, savedInstanceState);


    }

    @Override
    public void onClick(View v) {
    }


}
