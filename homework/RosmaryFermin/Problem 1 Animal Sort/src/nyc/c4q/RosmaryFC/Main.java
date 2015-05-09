package nyc.c4q.RosmaryFC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /**
     * Create an Animal class that includes a "species name" field and implements the Comparable interface. Compare two animals by species name, alphabetically.
     Implement equals to compare by species name.
     Test your compareTo function by creating an array of Animal instances and calling sort.
     Create the Domestic interface. This interface should include getters and setters for a name field, since pets tend to have their own names.
     Create a class for a Domestic Animal, perhaps a DomesticCat, that both inherits from Animal and implements the Domesitc interface.
     Implement the compareTo function for your Domestic animal so that it compares two such animals by their given name instead of their species name.
     Implement equals to compare by given name.
     Create a constructor for your Domestic animal that takes in both the species name and given name.
     Test your compareTo function by creating an array and calling sort.
     *
     */

    public static void main(String[] args) {
        //Test your compareTo function by creating an array of Animal instances and calling sort.

        Animal dog = new Animal ("Pitbull");
        Animal cat = new Animal("Tiger");
        Animal bird = new Animal("Parakeet");

        Animal speciesNames [] = {dog, cat, bird};
        List<Animal> unsortedNames = new ArrayList<Animal>();


        for(Animal x : speciesNames) {
            unsortedNames.add(x);
        }

        for(int i = 0; i < unsortedNames.size(); i++) { //was trying to print array but only speciesName of animal. ex: dog.speciesName
            System.out.println("Species Name = " + unsortedNames.get(i).getSpeciesName());
        }

        //todo: I don't understand how to test by calling sort.
        Arrays.sort(speciesNames);

        List<Animal> sortedNames = new ArrayList<Animal>();
        for(Animal x : speciesNames) {
            sortedNames.add(x);
        }

        for(int i = 0; i < sortedNames.size(); i++) {
            System.out.println("The sorted Object array is:" + sortedNames.get(i).getSpeciesName());

        }

        System.out.println();


        //Test your compareTo function by creating an array and calling sort.
        DomesticCat cat1 = new DomesticCat("Bob Cat", "Tom");
        DomesticCat cat2 = new DomesticCat("Sphynx", "Rufus");

        DomesticCat catNames [] = {cat1, cat2};
        List<DomesticCat> unsortedCatNames = new ArrayList<DomesticCat>();

        for(DomesticCat x : catNames) {
            unsortedCatNames.add(x);
        }

        for(int i = 0; i < unsortedCatNames.size(); i++) {
            System.out.println("Cat Names = " + unsortedCatNames.get(i).getName());
        }

        Arrays.sort(catNames);

        List<DomesticCat> sortedCatNames = new ArrayList<DomesticCat>();

        for(DomesticCat x : catNames) {
            sortedCatNames.add(x);
        }

        for(int i = 0; i < sortedCatNames.size(); i++) {
            System.out.println("The sorted Object array is:" + sortedCatNames.get(i).getName());
        }

    }


}
