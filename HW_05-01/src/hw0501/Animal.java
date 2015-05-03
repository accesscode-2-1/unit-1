package hw0501;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Access Code 2.1
 * Ray Acevedo
 * Animal.java
 */
//        Create an Animal class that includes a "species name" field and implements the Comparable interface.

//        Compare two animals by species name, alphabetically.

//        Override equals to compare by species name.

//        Test your compareTo function by creating an array of Animal instances and calling sort.

//        Create the Domestic interface. This interface should include getters and setters for a name
//        field, since pets tend to have their own names.

//        Create a class for a Domestic Animal, perhaps a DomesticCat, that both inherits from Animal

//        and implements the Domesitc interface.

//        Override the compareTo function for your Domestic animal so that it compares two such animals

//        by their given name instead of their species name.

//        Override equals to compare by given name.

//        Create a constructor for your Domestic animal that takes in both the species name and given name.

//        Test your compareTo function by creating an array and calling sort.

public class Animal implements Comparable<Animal>
{
    String speciesName;
    public Animal(){}
    public Animal(String speciesName){}
    public void setSpeciesName (String speciesName){speciesName = this.speciesName;}
    public String getSpeciesName(){return speciesName;}

    public static void putInAlphabetical (Animal a, Animal b)
    {
        ArrayList<Animal>animals = new ArrayList<Animal>();
        animals.add(a);
        animals.add(b);
        Collections.sort(animals);
        for(Animal animal:animals){
            System.out.println(animal);
        }
    }
    @Override
    public int compareTo(Animal animal)
    {
        return speciesName.compareTo(animal.getSpeciesName());

    }
    public static void main(String[] args)
    {
        Animal andy = new Animal("Andy");
        Animal bob = new Animal("Bob");
        Animal[] animals = {andy,bob};
        ArrayList<String>arrayList = new ArrayList<String>();
        System.out.println(bob.compareTo(andy));
    }
}