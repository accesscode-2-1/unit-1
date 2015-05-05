package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Unit 1 - Week 0.
 * Due Date : 05/01/15.
 * Created by Luke Lee on 4/26/15.
 *
 * Problem 1: Animal Sort
 * Create an Animal class that includes a "species name" field and implements the Comparable interface. Compare two animals by species name, alphabetically.
 * Implement equals to compare by species name.
 * Test your compareTo function by creating an array of Animal instances and calling sort.
 * Create the Domestic interface. This interface should include getters and setters for a name field, since pets tend to have their own names.
 * Create a class for a Domestic Animal, perhaps a DomesticCat, that both inherits from Animal and implements the Domesitc interface.
 * Implement the compareTo function for your Domestic animal so that it compares two such animals by their given name instead of their species name.
 * Implement equals to compare by given name.
 * Create a constructor for your Domestic animal that takes in both the species name and given name.
 * Test your compareTo function by creating an array and calling sort.
 */
public class Animal implements Comparable<Animal> {

    private String spicies;

    public Animal() {
        this.spicies = "no species"; // to prevent null pointer error.
    }

    public Animal(String species) {
        this.spicies = species;
    }

    public String getSpicies() {
        return spicies;
    }

    public void setSpicies(String spicies) {
        this.spicies = spicies;
    }

    @Override
    public int compareTo(Animal o) {
        return this.getSpicies().compareTo(o.getSpicies());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            Animal a = (Animal) obj;
            return this.getSpicies().equals(a.getSpicies());
        }
        return false;
    }
}
