package reinardcox.c4q.nyc.horoscope;

import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class Gemini_Activity extends AppCompatActivity {
    TextView _display;
    ProgressBar _loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gemini_layout);

        _display = (TextView) findViewById(R.id.textView_Gemini);
        _loader = (ProgressBar) findViewById(R.id.progressBar_Gemini);

        MyTask myTask = new MyTask();
        myTask.execute(new MyObjectWrapper(HoroscopeSign.Gemini, HoroscopeReading.Daily_Horoscope),
                new MyObjectWrapper(HoroscopeSign.Gemini, HoroscopeReading.Career),
                new MyObjectWrapper(HoroscopeSign.Gemini, HoroscopeReading.Love));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    static class ObjectSwitcher {

        final String reading;
        final HoroscopeReading input;

        ObjectSwitcher(String reading, HoroscopeReading input) {
            this.reading = reading;
            this.input = input;
        }
    }

    static class MyObjectWrapper { //It's not the same content of this class...
        final HoroscopeSign enum1;
        final HoroscopeReading enum2;


        MyObjectWrapper(HoroscopeSign enum1, HoroscopeReading enum2) {
            this.enum1 = enum1;
            this.enum2 = enum2;
        }
    }

    private class MyTask extends AsyncTask<MyObjectWrapper, Void, ArrayList<ObjectSwitcher>> {


        @Override
        protected void onPostExecute(ArrayList<ObjectSwitcher> s) {
            super.onPostExecute(s);

            Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/ObelixProBIt-cyr.ttf");

            for (ObjectSwitcher words : s) {
                _display.setTypeface(typeface);
                _display.append(words.input.name() + "\n");


                _display.append(words.reading + "\n\n");
            }

            _loader.setVisibility(View.INVISIBLE);
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            _loader.setVisibility(View.VISIBLE);
        }


        @Override
        protected ArrayList<ObjectSwitcher> doInBackground(MyObjectWrapper... params) {

            ArrayList<ObjectSwitcher> stringArrayList = new ArrayList<>();

            for (MyObjectWrapper obj : params) {

                try {
                    HoroscopeAPI api = new HoroscopeAPI(10000);
                    String reading = "";

                    //you want to get love reading for libra
                    reading = api.getHoroscopeReading(obj.enum1, obj.enum2);

                    stringArrayList.add(new ObjectSwitcher(reading, obj.enum2));


                } catch (MalformedURLException ex) {
                    ex.printStackTrace();
                    stringArrayList.add(new ObjectSwitcher(ex.getMessage(), obj.enum2));

                } catch (IOException ex) {
                    stringArrayList.add(new ObjectSwitcher("Cannot get stream from server", obj.enum2));
                } catch (SQLExcpetion ex) {
                    stringArrayList.add(new ObjectSwitcher("Cannot connect to database", obj.enum2));
                }

            }
            return stringArrayList;

        }


    }

}
