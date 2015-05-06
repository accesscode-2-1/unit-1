package nyc.c4q.alizinha;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
//    Problem 1: Animal Sort
//
//    Create an Animal class that includes a "species name" field and implements the Comparable interface. Compare two
// animals by species name, alphabetically.
//    Implement equals to compare by species name.
//    Test your compareTo function by creating an array of Animal instances and calling sort.
//    Create the Domestic interface. This interface should include getters and setters for a name field, since pets tend
// to have their own names.
//    Create a class for a Domestic Animal, perhaps a DomesticCat, that both inherits from Animal and implements the
// Domestic interface.
//    Implement the compareTo function for your Domestic animal so that it compares two such animals by their given name
// instead of their species name.
//    Implement equals to compare by given name.
//    Create a constructor for your Domestic animal that takes in both the species name and given name.
//    Test your compareTo function by creating an array and calling sort.

    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal a2 = new Animal();
        a1.compareTo(a2);

        ArrayList<Animal> list  = new ArrayList<Animal>();


        DomesticCat c1 = new DomesticCat();


        Animal a4 = new DomesticCat();

        DomesticCat c5 = (DomesticCat) a4;

        DomesticCat c2 = new DomesticCat();

        ArrayList<Animal> list5 = new ArrayList<Animal>();


        Collections.sort(list);

    }
}
