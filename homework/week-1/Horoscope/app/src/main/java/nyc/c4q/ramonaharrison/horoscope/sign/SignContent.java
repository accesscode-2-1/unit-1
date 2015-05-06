package nyc.c4q.ramonaharrison.horoscope.sign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing content
 */

public class SignContent {

    static String[] signs = {"Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces"};


    /**
     * An array of items.
     */
    public static List<Sign> ITEMS = new ArrayList<Sign>();

    /**
     * A map of items, by ID.
     */
    public static Map<Integer, Sign> ITEM_MAP = new HashMap<Integer, Sign>();


    static {
        // Add 3 sample items.
        addItem(new Sign(0, signs[0]));
        addItem(new Sign(1, signs[1]));
        addItem(new Sign(2, signs[2]));
        addItem(new Sign(3, signs[3]));
        addItem(new Sign(4, signs[4]));
        addItem(new Sign(5, signs[5]));
        addItem(new Sign(6, signs[6]));
        addItem(new Sign(7, signs[7]));
        addItem(new Sign(8, signs[8]));
        addItem(new Sign(9, signs[9]));
        addItem(new Sign(10, signs[10]));
        addItem(new Sign(11, signs[11]));
    }

    private static void addItem(Sign item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static class Sign {
        public int id;
        public String content;

        public Sign(int id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
