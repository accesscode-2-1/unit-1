package tashsmit.c4q.nyc.homework_05_08;

/**
 * Created by c4q-tashasmith on 5/12/15.
 */
public class BirthdayLookUp {

   public static String zodiacSign (int month, int day) {

       String sign = "";
       //jan
       if (month == 0) {

           if (day >=1 && day <=19 ) {
               sign =  "capicorn";
           }
           else  {
               sign =  "aquarius";
           }
       }
       //feb
       else if (month == 1) {
           if (day >=1 && day <=18 ) {
               sign =  "aquarius";
           }
           else  {
               sign =  "pisces";
           }
       }
       //march
       else if (month == 2) {
           if (day >=1 && day <=20 ) {
               return "pisces";
           }
           else  {
               return "aries";
           }
       }
       //april
       else if (month == 3) {
           if (day >=1 && day <=19 ) {
               sign =  "aries";
           }
           else  {
               sign =  "taurus";
           }
       }
       //may
       else if (month == 4) {
           if (day >=1 && day <=20 ) {
               sign =  "taurus";
           }
           else  {
               sign =  "gemini";
           }
       }
       //june
       else if (month == 5) {
           if (day >=1 && day <=20 ) {
               sign =  "gemini";
           }
           else  {
               sign =  "cancer";
           }
       }
       //july
       else if (month == 6) {
           if (day >=1 && day <=22 ) {
               sign =  "cancer";
           }
           else  {
               sign =  "leo";
           }
       }
       //aug
       else if (month == 7) {
           if (day >=1 && day <=22 ) {
               sign =  "leo";
           }
           else  {
               sign =  "virgo";
           }
       }
       //sept
       else if (month == 8) {
           if (day >=1 && day <=22 ) {
               sign =  "virgo";
           }
           else  {
               sign =  "libra";
           }
       }
       //oct
       else if (month == 9) {
           if (day >=1 && day <=22 ) {
               sign =  "libra";
           }
           else  {
               sign =  "scorpio";
           }
       }
       //nov
       else if (month == 10) {
           if (day >=1 && day <=22 ) {
               sign =  "scorpio";
           }
           else  {
               sign =  "sagittarius";
           }
       }
       //dec
       else  {
           if (day >=1 && day <=21 ) {
               sign =  "sagittarius";
           }
           else  {
               sign =  "capricorn";
           }
       }

       return sign;
   }
}
