package com.example.c4q_anthony_mcbride.horoscope_revisited;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


        public class GameOfStars extends ActionBarActivity {
        int random = (int)(Math.random() * 12 + 1);
        int random2 = (int)(Math.random() * 28 + 1);
        public EditText userResponse;
        public TextView makeRandomNumber;
        String whatAnswerShouldBe;
        String userResponseString;
        String RandomNumberString;


                @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.gameofstars_frame);
                //TextView r = (TextView) findViewById(R.id.userResponse);
                    }


                @Override
        public boolean onCreateOptionsMenu(Menu menu) {
                // Inflate the menu; this adds items to the action bar if it is present.
                        getMenuInflater().inflate(R.menu.gameofstars_menu, menu);
                return true;
            }

                @Override
        public boolean onOptionsItemSelected(MenuItem item) {
                // Handle action bar item clicks here. The action bar will
                        // automatically handle clicks on the Home/Up button, so long
                                // as you specify a parent activity in AndroidManifest.xml.
                                        int id = item.getItemId();

                        //noinspection SimplifiableIfStatement
                                if (id == R.id.navigator) {
                        return true;
                    }

                        return super.onOptionsItemSelected(item);
            }
        public void tryAgain (View v){
                TextView t = (TextView) findViewById(R.id.randomNumberTextView);
                t.setText("");
            }
        public void makeRandomNumber (View v){
                TextView t = (TextView) findViewById(R.id.randomNumberTextView);
                if (random < 10 ){
                        t.setText(0 + "" + random + "-" + random2);
                    }
                else if(random2 < 10){
                        t.setText(random + "-" + 0 + random2 );
                    }
                else if(random < 10 && random2 < 10){
                        t.setText(0 + "" + random + "-" + 0 + random2);
                    }
                else if(random > 10 && random2 < 10){
                        t.setText(random + "-" + 0 + random2);
                    }
                else if(random < 10 && random2 > 10){
                        t.setText(0 + "" + random + "-" + random2);
                    }
                else{
                        t.setText(random + "-" + random2);
                    }
            }
        public void whatanswerShouldBe(View v){
                TextView r = (TextView) findViewById(R.id.userResponse);
                userResponseString = r.getText().toString();
                TextView q = (TextView) findViewById(R.id.randomNumberTextView);
                RandomNumberString = q.getText().toString();
                Log.d("randomNumberString", RandomNumberString);
                String month = RandomNumberString.substring(0, 2);
                Log.d("month", month);
                String day = RandomNumberString.substring(3, 5);
                Log.d("day", day);
                int monthInt = Integer.parseInt(month);
                int bdayInt = Integer.parseInt(day);
                TextView t = (TextView) findViewById(R.id.answerTextView);


                                if (monthInt == 1 && bdayInt >= 21) {
                        whatAnswerShouldBe = "aquarius";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 2 && bdayInt <= 19) {
                        whatAnswerShouldBe = "aquarius";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 2 && bdayInt >= 21) {
                        whatAnswerShouldBe = "pisces";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 3 && bdayInt <= 19) {
                        whatAnswerShouldBe = "pisces";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 3 && bdayInt >= 21) {
                        whatAnswerShouldBe = "aries";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 4 && bdayInt <= 19) {
                        whatAnswerShouldBe = "aries";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 4 && bdayInt >= 20) {
                        whatAnswerShouldBe = "taurus";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 5 && bdayInt <= 20) {
                        whatAnswerShouldBe = "taurus";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 5 && bdayInt >= 21) {
                        whatAnswerShouldBe = "gemini";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 6 && bdayInt <= 21) {
                        whatAnswerShouldBe = "gemini";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 6 && bdayInt >= 22) {
                        whatAnswerShouldBe = "cancer";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 7 && bdayInt <= 22) {
                        whatAnswerShouldBe = "cancer";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 7 && bdayInt >= 23) {
                        whatAnswerShouldBe = "leo";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 8 && bdayInt <= 22) {
                        whatAnswerShouldBe = "leo";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 8 && bdayInt >= 23) {
                        whatAnswerShouldBe = "virgo";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 9 && bdayInt <= 22) {
                        whatAnswerShouldBe = "virgo";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 9 && bdayInt >= 23) {
                        whatAnswerShouldBe = "libra";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 10 && bdayInt <= 22) {
                        whatAnswerShouldBe = "libra";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 10 && bdayInt >= 23) {
                        whatAnswerShouldBe = "scorpio";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            } else if (monthInt == 11 && bdayInt <= 21) {
                        whatAnswerShouldBe = "scorpio";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            }else if (monthInt == 11 && bdayInt >= 22){
                        whatAnswerShouldBe = "sagittarius";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            }else if (monthInt == 12 && bdayInt <= 19){
                        whatAnswerShouldBe = "sagittarius";
                        if (whatAnswerShouldBe.equals(userResponseString)){

                                        t.setText("Correct!");
                            }
                        else {

                                        t.setText("Wrong");
                            }

                            }
                else
                {
                            whatAnswerShouldBe = "capricorn";
                    if (whatAnswerShouldBe.equals(userResponseString)){

                                    t.setText("Correct!");
                        }
                    else {

                                    t.setText("Wrong");
                        }

                        }
            }
        }
