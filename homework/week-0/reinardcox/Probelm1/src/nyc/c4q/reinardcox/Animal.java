/**
 * Problem 1: Animal Sort
 1. Create an Animal class
 2. Create "species name" field
 3. implements the Comparable interface
 4. Compare two animals by species name
 5. Implement equals to compare by species name.
 6. Test your compareTo function
 7. creating an array of Animal instances
 8. and calling sort.
 9. Create the Domestic interface.
 */
package nyc.c4q.reinardcox;

import java.util.Arrays;

public class Animal implements Comparable<Animal> {

    private String speciesName;

    public Animal(String speciesName) {
        this.speciesName = speciesName;
    }

    @Override
    public int compareTo(Animal o) {
        return speciesName.compareTo(o.speciesName);
    }

    public boolean equals(Animal o) {
        return speciesName.equals(o.speciesName);
    }


    public static void main(String[] args) {

        Animal[] dogs = new Animal[5];

        dogs[0] = new Animal("Rottweiler");
        dogs[1] = new Animal("Boxer");
        dogs[2] = new Animal("German Shepherd");
        dogs[3] = new Animal("Pitbulls");
        dogs[4] = new Animal("Miniature Pinscher");

        for (Animal o : dogs){
            System.out.println(o.speciesName);
        }

        System.out.println(dogs[3].compareTo(dogs[0]));

        Arrays.sort(dogs);

        for (Animal o : dogs){
            System.out.println(o.speciesName);
        }

    }
}
