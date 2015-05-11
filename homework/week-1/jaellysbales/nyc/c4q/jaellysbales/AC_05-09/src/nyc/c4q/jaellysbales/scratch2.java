package nyc.c4q.jaellysbales;
import java.util.ArrayList;

/**
 * Access Code 2.1
 * Created by Jaellys Bales on 5/10/15.
 * Project: AC_05-09
 * <p/>
 * ${FILE_NAME}
 * Enter a description.
 */
public class scratch2
{
    public static void main(String[] args)
    {
        String aries = "Aries";
        String aquarius = "Aquarius";
        String cancer = "Cancer";
        String capricorn = "Capricorn";
        String gemini = "Gemini";
        String leo = "Leo";
        String libra = "Libra";
        String pisces = "Pisces";
        String sagittarius = "Sagittarius";
        String scorpio = "Scorpio";
        String taurus = "Taurus";
        String virgo = "Virgo";

        ArrayList<String> signs = new ArrayList<String>();
        signs.add(aries);
        signs.add(aquarius);
        signs.add(cancer);
        signs.add(capricorn);
        signs.add(gemini);
        signs.add(leo);
        signs.add(libra);
        signs.add(pisces);
        signs.add(sagittarius);
        signs.add(scorpio);
        signs.add(taurus);
        signs.add(virgo);

        ArrayList<String> matches = new ArrayList<String>();

//        HashMap<String, String> tmp2 = new HashMap<String, String>();
//        ArrayList<HashMap> matches2 = new ArrayList<HashMap>();

        for(int i = 0; i < signs.size(); i++)
        {
            for(int j = 0; j < signs.size(); j++)
            {
                // TODO: get rid of repeats
                    matches.add(signs.get(i) + " + " + signs.get(j));
            }
        }

        String pair = matches.get(79);

        for(String match : matches)
        {
            System.out.println(matches.indexOf(match) + ": " + match);
        }

        // http://www.eastrolog.com/zodiac-sign-compatibility/
        // http://www.astrologycompanion.com/pisces-compatibility/
        if (pair.contains("Pisces") && pair.contains("Cancer")
            || pair.contains("Pisces") && pair.contains("Scorpio")
            || pair.contains("Pisces") && pair.contains("Capricorn"))
        {
            System.out.println(pair + " -> great match!");
        }
        else if (pair.contains("Pisces") && pair.contains("Libra")
                || pair.contains("Pisces") && pair.contains("Gemini")
                || pair.contains("Pisces") && pair.contains("Sagittarius"));
        {
            System.out.println(pair + " -> bad match!");
        }
    }
}
