package lukesterlee.c4q.nyc.horoscope;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
/**
 * Created by Willee on 5/7/15.
 */
public class SignFragment extends Fragment {

    OnSignSelectedListener mActivityCallBack;

    public interface OnSignSelectedListener {
        public void onSignSelected(int position);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        ((MainActivity) activity).onSectionAttached(getArguments().getInt("position"));

        try {
            mActivityCallBack = (OnSignSelectedListener) activity;
        } catch(ClassCastException e) {
            throw new ClassCastException(activity.toString() + " didn't implement OnSignSelectedListener interface");
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View result = inflater.inflate(R.layout.fragment_sign, container, false);
        GridView gridview = (GridView) result.findViewById(R.id.gridView);
        gridview.setAdapter(new ImageAdapter(getActivity()));


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                mActivityCallBack.onSignSelected(position);
            }
        });

        return result;
    }


}
