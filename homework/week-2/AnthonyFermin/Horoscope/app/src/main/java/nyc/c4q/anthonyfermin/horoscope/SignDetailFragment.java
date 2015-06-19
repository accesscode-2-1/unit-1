package nyc.c4q.anthonyfermin.horoscope;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SignDetailFragment extends Fragment {
    public static final String ARG_LIST_NUMBER = "list_number";

    public SignDetailFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sign_detail, container, false);

        int i = getArguments().getInt(ARG_LIST_NUMBER);
        String zodiacItem = getResources().getStringArray(R.array.zodiac_names_array)[i];

        getActivity().setTitle(zodiacItem);

        TextView zodiacTitle = (TextView) rootView.findViewById(R.id.zodiacTitle);
        zodiacTitle.setText(zodiacItem);

        zodiacItem = zodiacItem.toLowerCase();
        ImageView zodiacImageView = (ImageView) rootView.findViewById(R.id.zodiacImage);
        int imageId = getResources().getIdentifier(zodiacItem, "drawable", "nyc.c4q.anthonyfermin.horoscope" );
        zodiacImageView.setImageResource(imageId);

        TextView zodiacDate = (TextView) rootView.findViewById(R.id.zodiacDate);
        zodiacDate.setText(getResources().getStringArray(R.array.zodiac_date_array)[i]);

        TextView zodiacDescrip = (TextView) rootView.findViewById(R.id.zodiacDescription);
        zodiacDescrip.setText(getResources().getStringArray(R.array.zodiac_description_array)[i]);

        return rootView;
    }
}