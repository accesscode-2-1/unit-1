package abassawo.c4q.nyc.cheesyhoroscope2;


import java.util.ArrayList;



/**
 * Created by c4q-Abass on 5/14/15.
 */
public class Zodiac {
    public String getName() {
        return name;
    }

    private String name, horoscopeDetail;

    private ArrayList<Zodiac>compatibles;


    public Zodiac(String name){
        this.name = name;
    }

    public ArrayList<Zodiac> getCompatibles() {
        return this.compatibles;
    }

    public void addRomanceMatch(Zodiac x) {
        this.compatibles.add(x);
    }

    public void unMatchSign(Zodiac x){
        this.compatibles.remove(x);
    }


    private static String[] zodiacSigns = {"Capricorn", "Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius"};
//            gemini.getName(), cancer.getName(), leo.getName(), virgo.getName(), libra.getName(), scorpio.getName(), sagittarius.getName()};
=======

    public Zodiac(String name, String horoscopeDetail){
        this.name = name;
        this.horoscopeDetail = horoscopeDetail;
    }
    public String getHoroscopeDetail() {
        return horoscopeDetail;
    }

    public static Zodiac aries = new Zodiac("Aries", " " + R.string.ariesDetail);
    public static Zodiac taurus = new Zodiac("Taurus", "" + R.string.taurusDetail);
    public static Zodiac gemini = new Zodiac("Gemini", "" + R.string.geminiDetail);
    public static Zodiac cancer = new Zodiac("Cancer", "" + R.string.cancerDetail);
    public static Zodiac leo = new Zodiac("Leo", " " + R.string.leoDetail);
    public static Zodiac virgo = new Zodiac("Virgo", "" + R.string.virgoDetail);
    public static Zodiac libra = new Zodiac("Libra", "" + R.string.libraDetail);
    public static Zodiac scorpio = new Zodiac("Scorpio", "" + R.string.scorpioDetail );
    public static Zodiac sagittarius = new Zodiac("Sagittarius", "" + R.string.sagittariusDetail);
    public static Zodiac capricorn = new Zodiac("Capricorn", "" + R.string.capricornDetail);
    public static Zodiac aquarius = new Zodiac("Aquarius", "" + R.string.aquariusDetail );
    public static Zodiac pisces = new Zodiac("Pisces", "" + R.string.piscesDetail);

    private static String[] zodiacSigns = {capricorn.getName(), aquarius.getName(), pisces.getName(), aries.getName(), taurus.getName(),
            gemini.getName(), cancer.getName(), leo.getName(), virgo.getName(), libra.getName(), scorpio.getName(), sagittarius.getName()}; //in Chronological Order.


    int month, day;

    public static boolean isCompatible(String zodiacsign1, String zodiacSign2){
        boolean isCompat = false; //fixme
        return isCompat;
    }
    public static String getZodiacSign(int month, int day){
        if((month == 11 &&  day>= 22) || (month == 0 && day <= 19)) {
            return zodiacSigns[0];   //Capricorn
        }else if((month == 0 && day >= 20)  || (month == 1 && day <= 18)) {
            return zodiacSigns[1];   //Aquarius
        } else if((month == 1 && day >= 19)  || (month == 2 && day <= 20)) {
            return zodiacSigns[2];    //Pisces
        } else if((month == 2 && day >= 21)  || (month == 3 && day <= 19)) {
            return zodiacSigns[3];   //Aries
        } else if((month == 3 && day >= 20)  || (month == 4 && day <= 20)) {
            return zodiacSigns[4];     //Taurus
        } else if((month == 4 && day >= 21)  || (month == 5 && day <= 20)) {
            return zodiacSigns[5];      //Gemini
        } else if((month == 5 && day >= 21)  || (month == 6 && day <= 22)) {
            return zodiacSigns[6];      //Cancer
        } else if((month == 6 && day >= 23)  || (month == 7 && day <= 22)) {
            return zodiacSigns[7];      //Leo`
        } else if((month == 7 && day >= 23)  || (month == 8 && day <= 21)) {
            return zodiacSigns[8];      //Virgo
        } else if((month == 8 && day >= 22) || (month == 9 && day <= 21)) {
            return zodiacSigns[9];       //Libra
        } else if((month == 9 && day >= 24)  || (month == 10 && day <= 22)) {
            return zodiacSigns[10];      //Scorpio
        } else if((month == 10 && day >= 23)  || (month == 11 && day <= 21)) {
            return zodiacSigns[11];      //Sagittarius
        }
        else {
            return null;
        }
    }


}
