package nyc.c4q.ramonaharrison;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Access Code 2.1
 * Ramona Harrison
 * DomesticCat.java
 *
 * Create a class for a Domestic Animal, perhaps a DomesticCat, that both inherits from Animal and implements the Domesitc interface.
 * Implement the compareTo function for your Domestic animal so that it compares two such animals by their given name instead of their species name.
 * Implement equals to compare by given name.
 * Create a constructor for your Domestic animal that takes in both the species name and given name.
 * Test your compareTo function by creating an array and calling sort.
 *
 */

public class DomesticCat extends Animal implements Domestic {

    private String name;
    private String speciesName;

    public DomesticCat(String speciesName) {
        super(speciesName);
    }

    public DomesticCat(String speciesName, String name) {
        super(speciesName);
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int compareTo(DomesticCat cat) {

        // finds the longer and shorter name
        int length, longer;
        String thisName = this.getName().toLowerCase();
        String thatName = cat.getName().toLowerCase();

        if (thisName.equals(thatName)) {
            return 0;
        }

        if (thatName.length() > thisName.length()) {
            length = thisName.length();
            longer = 1;
        } else {
            length = thatName.length();
            longer = -1;
        }

        for (int i = 0; i < length; i++) {
            if (thisName.charAt(i) > thatName.charAt(i)) {
                return 1;
            }
            if (thisName.charAt(i) < thatName.charAt(i)) {
                return -1;
            }
        }

        return longer; // ensures correct return value in cases where short name is equal to part of longer name (eg 'kangaroo' vs 'kangaroo mouse')
    }

    public static void main(String[] args) {

        DomesticCat cat1 = new DomesticCat("Cat", "Meow");
        DomesticCat cat2 = new DomesticCat("Cat", "MeowMeow");
        DomesticCat cat3 = new DomesticCat("Cat", "Reow");
        DomesticCat cat4 = new DomesticCat("Cat", "Meowww");
        DomesticCat cat5 = new DomesticCat("Cat", "MaoMeow");
        DomesticCat cat6 = new DomesticCat("Cat", "MeMeow");

        ArrayList<DomesticCat> zoo = new ArrayList<DomesticCat>();
        zoo.add(cat1);
        zoo.add(cat2);
        zoo.add(cat3);
        zoo.add(cat4);
        zoo.add(cat5);
        zoo.add(cat6);

        Collections.sort(zoo);

        System.out.println(zoo.get(0));

    }
}
