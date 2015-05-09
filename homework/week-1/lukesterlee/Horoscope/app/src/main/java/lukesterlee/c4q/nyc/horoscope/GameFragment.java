package lukesterlee.c4q.nyc.horoscope;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Access Code 2.1 : Unit 1 Homework
 * Created by Luke Lee on 5/7/15.
 */
public class GameFragment extends Fragment {

    // I'm not sure whether declaring variables here is a good idea or not.
    TextView randomDate;
    TextView remainingTime;
    Button startButton;
    GridView gridview;
    TextView answer;
    CountDownTimer timer;
    ArrayAdapter<String> adapter;
    View result;
    String date;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        result = inflater.inflate(R.layout.fragment_game, container, false);

        startButton = (Button) result.findViewById(R.id.gameStartButton);
        randomDate = (TextView) result.findViewById(R.id.randomDate);

        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Data.signs);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        return result;
    }

    @Override
     public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(getArguments().getInt("position"));
    }

    @Override
    public void onStart() {
        super.onStart();

        remainingTime = (TextView) getActivity().findViewById(R.id.timer);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                date = Calculator.getRandomDate();
                randomDate.setText(date);
                gridview = (GridView) getActivity().findViewById(R.id.game_grid_view);
                gridview.setAdapter(new ImageAdapter(getActivity()));

                timer = new CountDownTimer(10000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        remainingTime.setText("seconds remaining: " + millisUntilFinished / 1000);
                    }

                    @Override
                    public void onFinish() {
                        remainingTime.setText("Time out!");
                        answer = (TextView) getActivity().findViewById(R.id.gameAnswer);
                        answer.setText("The answer is " + Calculator.getAnswer(date));
                        startButton.setText("One more?");
                    }
                }.start();

                gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                        if(Calculator.getSign(position).equalsIgnoreCase(Calculator.getAnswer(date))) {
                            timer.cancel();
                            remainingTime.setText("");
                            // show pop up dialog to congratualte!
                            Toast toast = Toast.makeText(getActivity(), "Awesome! You got right!", Toast.LENGTH_LONG);
                            toast.show();
                            startButton.setText("One more?");
                        }
                        else {
                            //Toast toast = Toast.makeText(getActivity(), "Wrong!", Toast.LENGTH_SHORT);
                            //toast.show();
                        }

                    }
                });

            }
        });
    }


    @Override
    public void onDetach() {
        super.onDetach();
        if (timer != null) {
            timer.cancel();
        }

    }
}
