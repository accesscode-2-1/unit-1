package nyc.c4q.ramonaharrison;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Animal.java
 *
 * Create an Animal class that includes a "species name" field and implements the Comparable interface.
 * Compare two animals by species name, alphabetically.
 * Implement equals to compare by species name.
 * Test your compareTo function by creating an array of Animal instances and calling sort.
 *
 */

public class Animal implements Comparable<Animal> {

    private String speciesName;

    public Animal(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getSpeciesName() {
        return this.speciesName;
    }

    @Override
    public String toString() {
        return this.getSpeciesName();
    }

    public boolean equals(Animal animal) {
        String thisName = this.getSpeciesName();
        String thatName = animal.getSpeciesName();

        if (thisName.length() != thatName.length()) {
            return false;
        }

        for (int i = 0; i < thisName.length(); i++)  {
            if (thisName.charAt(i) != thatName.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int compareTo(Animal animal) {

        // finds the longer and shorter name
        int length, longer;
        String thisName = this.getSpeciesName().toLowerCase();
        String thatName = animal.getSpeciesName().toLowerCase();

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

        Animal cat = new Animal("Cat");
        Animal cat2 = new Animal("Cat");
        Animal dog = new Animal("Dog");
        Animal lizard = new Animal("Lizard");
        Animal mouse = new Animal("Mouse");
        Animal moose = new Animal("Moose");

        ArrayList<Animal> zoo = new ArrayList<Animal>();
        zoo.add(mouse);
        zoo.add(cat2);
        zoo.add(lizard);
        zoo.add(cat);
        zoo.add(moose);
        zoo.add(dog);

        Collections.sort(zoo);

        System.out.println(zoo.get(0));

    }

}
