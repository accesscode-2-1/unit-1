package nyc.c4q.Amcbri15;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Animal a1 = new Animal("Eurasian Lynx");
        Animal a2 = new Animal("Canada Lynx");
        Animal a3 = new Animal("Iberian Lynx");
        DomesticDog opie = new DomesticDog("Opie", "Canis lupus familiaris");
        DomesticDog buddy = new DomesticDog("Buddy", "Canis lupus familiaris");
        DomesticDog snowflake = new DomesticDog("Snowflake", "Canis lupus familiaris");

        ArrayList<Animal> animals = new ArrayList<Animal>();
        ArrayList<DomesticDog> dogs = new ArrayList<DomesticDog>();

        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        dogs.add(opie);
        dogs.add(buddy);
        dogs.add(snowflake);

        Collections.sort(animals);
        Collections.sort(dogs);

        System.out.println(animals.get(0).toString());
        System.out.println(dogs.get(1).getName());

    }
}
