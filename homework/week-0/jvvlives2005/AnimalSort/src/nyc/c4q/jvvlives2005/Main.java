package nyc.c4q.jvvlives2005;

/*Problem 1: Animal Sort

Create an Animal class that includes a "species name" field and implements the Comparable interface.
Compare two animals by species name, alphabetically.
Implement equals to compare by species name.
Test your compareTo function by creating an array of Animal instances and calling sort.
Create the Domestic interface. This interface should include getters and setters for a name field, since pets tend to have
their own names.
Create a class for a Domestic Animal, perhaps a DomesticCat, that both inherits from Animal and implements the Domesitc
interface.
Implement the compareTo function for your Domestic animal so that it compares two such animals by their given name instead
of their species name.
Implement equals to compare by given name.
Create a constructor for your Domestic animal that takes in both the species name and given name.
Test your compareTo function by creating an array and calling sort.
*/

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <Animal> zoo = new ArrayList<Animal>();

        Animal animal1 = new Animal("Cat");
        Animal animal2 = new Animal("Dog");
        Animal animal3 = new Animal("Mouse");

        zoo.add(animal1);
        zoo.add(animal2);
        zoo.add(animal3);

        System.out.println(animal1.compareTo(animal2));
    }
}
