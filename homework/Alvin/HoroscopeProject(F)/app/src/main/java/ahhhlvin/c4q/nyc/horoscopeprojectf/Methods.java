package ahhhlvin.c4q.nyc.horoscopeprojectf;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by alvin2 on 5/10/15.
 */
public class Methods {
    public static String getHoroscope(String sign) {
        if (sign.equalsIgnoreCase("Aries")) {
            return "You may be looking for some new values in your personal life, Aries. You're no longer interested in superficial or frivolous relationships. You need to meet different kinds of people and select friends who are really worth keeping. Don't worry if you feel like taking a step back to get some perspective, because this is the time to do it. Relationships are too important to neglect.";
        } else if (sign.equalsIgnoreCase("Taurus")) {
            return "Today's astral configuration brings reality and fantasy face-to-face. In actual fact what you are looking at is one set of events that has already happened, and one that potentially could, but so far has not. You would benefit from getting your priorities in order to truly understand which of them is most important, and therefore what your course of action is likely to be.\n";
        } else if (sign.equalsIgnoreCase("Gemini")) {
            return "Misunderstandings could occur today, especially in the way you perceive not only yourself, but also your love interest. You may think that the signals you are sending are quite plain and obvious, but everyone sees things differently, and they may not be being received in the same vein. With current celestial energies, you have your work cut out for you to make yourself understood.";
        } else if (sign.equalsIgnoreCase("Cancer")) {
            return "The current planetary energy makes something you were completely certain about seem less sure. A current relationship may suddenly seem to be collapsing, due to forces beyond your control, leaving you wondering exactly what is going on. But don't let this worry you; if you just let things be, you will see that nothing has been undermined, it is just an illusion and all is well.";
        } else if (sign.equalsIgnoreCase("Leo")) {
            return "If you are going out on a date this evening, your impression of your potential partner will change from one moment to the next, due to the current astral configuration. You will not be able to fathom them. Perhaps it is best if you don't even try, as this could ruin the magic that might build up between you if you leave it alone.";
        } else if (sign.equalsIgnoreCase("Virgo")) {
            return "Today's celestial energies could create the potential for a very romantic evening with your love interest. But before you both go striding off into the sunset, hand in hand, you need to get one or two things straight between you. Nothing serious, just a couple of issues that have recently given you much food for thought concerning each other. Get it sorted out and then have fun.";
        } else if (sign.equalsIgnoreCase("Libra")) {
            return "Today's astral configuration could mean that one or two ego problems arise in a close personal relationship. These will not really be that serious, and in fact are more likely to be amusing, but they do nevertheless imply that both of you have strong personalities and are not likely to back down easily if you do ever have a really big argument. Lessons to be learnt.";
        } else if (sign.equalsIgnoreCase("Scorpio")) {
            return "There are many types of stubbornness. The kind that refuses to budge once a decision has been reached, and another kind that is based on the misguided knowledge that one is absolutely right. The current astral environment indicates that you and your sweetheart could be creating an impasse. Yet through discussion you could also make a great success of a mutual project. The choice is yours, so use it wisely.\n";
        } else if (sign.equalsIgnoreCase("Sagittarius")) {
            return "Today's celestial energy creates the potential for your feelings about someone special to be made clear. You are able to tell them what is going on within you, which not only helps bring you closer together, but also enables them to talk about their emotions. Just sharing at this level is very strengthening and reassuring. You will both discover there is real love between you.";
        } else if (sign.equalsIgnoreCase("Capricorn")) {
            return "You may not feel too much like being romantic or sentimental, even if you are going out on a date. The aspect at play today is not really a very sociable influence. But if you do meet with your latest partner, you can still make progress within the relationship. Your discussion may center on more serious or even practical issues that concern you both. It will be fine!";
        } else if (sign.equalsIgnoreCase("Aquarius")) {
            return "Today's planetary energies may encourage you to feel more self-righteous than usual, and your partner (current or prospective) to feel less flexible than normal. All of this may sound like a potential recipe for disaster, but it needn't be so. You just need to talk to each other heart-to-heart, rather than reacting to a certain issue that is certain to make you both annoyed.";
        } else if (sign.equalsIgnoreCase("Pisces")) {
            return "Today's planetary energies could mean that a misunderstanding will crop up in your relationship with your loved one. So in order to avoid problems and unnecessary conflict it would help if you spelled everything out to each other, and said what you mean in several different ways, so that at least there is a chance that understanding will dawn at some point. Make clarity your goal for today.";
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



}
