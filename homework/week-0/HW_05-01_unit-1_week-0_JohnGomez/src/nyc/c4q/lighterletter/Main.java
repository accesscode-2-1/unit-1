package nyc.c4q.lighterletter;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Animal dog = new Animal();
    Animal dog2 = new Animal();
    Animal parrot = new Animal();
        parrot.setSpeciesName("Avian");
        dog2.setSpeciesName("canine");
        dog.setSpeciesName("canine");

        ArrayList array = new ArrayList();

        array.add(dog);
        array.add(dog2);
        array.add(parrot);


        dog.getSpeciesName().length();

        System.out.println(dog.compareTo(dog2));
    }
}
