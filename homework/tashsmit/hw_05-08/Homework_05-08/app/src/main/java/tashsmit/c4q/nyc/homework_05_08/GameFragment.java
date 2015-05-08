package tashsmit.c4q.nyc.homework_05_08;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by c4q-tashasmith on 5/7/15.
 */
public class GameFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.game,  container, false);
        //return super.onCreateView(inflater, container, savedInstanceState);
    }
}