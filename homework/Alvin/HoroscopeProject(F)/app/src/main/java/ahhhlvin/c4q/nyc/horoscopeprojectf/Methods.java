package ahhhlvin.c4q.nyc.horoscopeprojectf;

/**
 * Created by alvin2 on 5/10/15.
 */
public class Methods {
    public static String getHoroscope(String sign) {
        if (sign.equalsIgnoreCase("Aries")) {
            return "You are smart.";
        } else if (sign.equalsIgnoreCase("Taurus")) {
            return "You are kind.";
        } else if (sign.equalsIgnoreCase("Gemini")) {
            return "You are funy.";
        } else if (sign.equalsIgnoreCase("Cancer")) {
            return "You are lucky.";
        } else if (sign.equalsIgnoreCase("Leo")) {
            return "You are beautiful.";
        } else if (sign.equalsIgnoreCase("Virgo")) {
            return "You are thoughtful.";
        } else if (sign.equalsIgnoreCase("Libra")) {
            return "You are hardworking.";
        } else if (sign.equalsIgnoreCase("Scorpio")) {
            return "You are persistent.";
        } else if (sign.equalsIgnoreCase("Sagittarius")) {
            return "You are sly.";
        } else if (sign.equalsIgnoreCase("Capricorn")) {
            return "You are cunning.";
        } else if (sign.equalsIgnoreCase("Aquarius")) {
            return "You are artistic.";
        } else if (sign.equalsIgnoreCase("Pisces")) {
            return "You are logical.";
        } else {
            return "Please try again.";
        }
    }

    public static String getHoroscopeSign(int month, int date) {
        if (month == 3 && date >= 21 && date <= 31 || month == 4 && date >= 1 && date <= 19) {
            return "Aries";
        } else if (month == 4 && date >= 20 && date <= 30 || month == 5 && date >= 1 && date <= 20) {
            return "Taurus";
        } else if (month == 5 && date >= 21 && date <= 31 || month == 6 && date >= 1 && date <= 21) {
            return "Gemini";
        } else if (month == 6 && date >= 22 && date <= 30 || month == 7 && date >= 1 && date <= 22) {
            return "Cancer";
        } else if (month == 7 && date >= 23 && date <= 31 || month == 8 && date >= 1 && date <= 22) {
            return "Leo";
        } else if (month == 8 && date >= 23 && date <= 30 || month == 9 && date >= 1 && date <= 22) {
            return "Virgo";
        } else if (month == 9 && date >= 23 && date <= 31 || month == 10 && date >= 1 && date <= 23) {
            return "Libra";
        } else if (month == 10 && date >= 24 && date <= 31 || month == 11 && date >= 1 && date <= 20) {
            return "Scorpio";
        } else if (month == 11 && date >= 21 && date <= 30 || month == 12 && date >= 1 && date <= 22) {
            return "Sagittarius";
        } else if (month == 12 && date >= 23 && date <= 31 || month == 1 && date >= 1 && date <= 20) {
            return "Capricorn";
        } else if (month == 1 && date >= 21 && date <= 30 || month == 2 && date >= 1 && date <= 21) {
            return "Aquarius";
        } else if (month == 2 && date >= 22 && date <= 31 || month == 3 && date >= 1 && date <= 20) {
            return "Pisces";
        } else {
            return "Please enter a valid birthdate in the specified format";
        }
    }

    public static String returnCompatibility(String sign1, String sign2) {
        String str = "Please try again.";

        if (!sign1.equals("Select horoscope sign") && !sign2.equals("Select horoscope sign") || !sign1.equals("Select horoscope sign") || !sign2.equals("Select horoscope sign")) {
            str = "❤❤❤Both are 100% compatible! :)❤❤❤";
        }

        return str;
    }


    public static String horoscopeGame(String horoscopeGuess) {

        if (horoscopeGuess.equalsIgnoreCase("Capricorn")) {
            return "You are correct!";
        } else {
            return "Sorry that is incorrect. \nPlease try again!";
        }

    }


}
