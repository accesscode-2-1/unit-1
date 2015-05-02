
package nyc.c4q.abassawo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.setSpeciesName("Canine");
        Animal wolf = new Animal("wolf");
        wolf.setSpeciesName("Canine");
        Animal cat = new Animal("cat");
        cat.setSpeciesName("Feline");


        //System.out.println(cat.equals(dog));
        //System.out.println(animalHouse);
        //System.out.println(dog.compareTo(cat));

        DomesticDog sparky = new DomesticDog("Canine", "Sparky");
        DomesticDog alex = new DomesticDog("Canine", "alex");
        System.out.println(sparky.getName());
        System.out.println(sparky.compareTo(alex));
        Animal animalHouse[] = {dog, wolf, cat, sparky};
        Arrays.sort(animalHouse);


        // ArrayList<String> suits = new ArrayList<String>();
        //suits.add("hearts");

        PlayingCards x = new PlayingCards();

        x.printPieces();

        x.getPieces();
        //x.printPieces();

    }


}

