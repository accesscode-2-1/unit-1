package nyc.c4q.sufeiiz.AnimalSort;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws ParseException {
//
//        // Test your compareTo function by creating an array of Animal instances and calling sort.
//        Animal[] animals = new Animal[2];
//        animals[0] = new Animal("Tiger");
//        animals[1] = new Animal("Lion");
//        int sort = animals[1].compareTo(animals[0]);
//        boolean equal = animals[1].equals(animals[0]);
//
//        // Test your compareTo function by creating an array and calling sort.
//        DomesticCat[] cats = new DomesticCat[2];
//        cats[0] = new DomesticCat("Fluffy");
//        cats[1] = new DomesticCat("Cat", "Garfield");
//        int sort2 = cats[1].compareTo(cats[0]);
//        boolean equal2 = cats[1].equals(cats[0]);

        Calendar cal = Calendar.getInstance();
        String question = "5-2";

        System.out.println(FindHoroscope("5-2-1991"));

    }

    public static String FindHoroscope(String birthday) throws ParseException {
        String horoscope = "You are a";
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy", Locale.US);
        cal.setTime(sdf.parse(birthday));

        int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);

        if (dayOfYear >= 21 && dayOfYear <= 52)
            horoscope += "n Aquarius!";
        else if (dayOfYear >= 53 && dayOfYear <= 79)
            horoscope += " Pisces!";
        else if (dayOfYear >= 80 && dayOfYear <= 109)
            horoscope += "n Aries!";
        else if (dayOfYear >= 110 && dayOfYear <= 140)
            horoscope += " Taurus!";
        else if (dayOfYear >= 141 && dayOfYear <= 172)
            horoscope += " Gemini!";
        else if (dayOfYear >= 173 && dayOfYear <= 203)
            horoscope += " Cancer!";
        else if (dayOfYear >= 204 && dayOfYear <= 234)
            horoscope += " Leo!";
        else if (dayOfYear >= 235 && dayOfYear <= 265)
            horoscope += " Virgo!";
        else if (dayOfYear >= 266 && dayOfYear <= 296)
            horoscope += " Libra!";
        else if (dayOfYear >= 297 && dayOfYear <= 324)
            horoscope += " Scorpio!";
        else
            horoscope += " Capricorn!";

        return horoscope;
    }
}
