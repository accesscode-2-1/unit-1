package m47bell.c4q.nyc.horoscopeapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by c4q-marbella on 5/7/15.
 */
public class main1_fragment extends Fragment {
    View rootview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.fragment_menu1,container,false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

//    for( int i =0; i< 12; i++){
//
//
//
//    }


}
