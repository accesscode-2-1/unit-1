package nyc.c4q.hoshikoo;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// Test your compareTo function by creating an array of Animal instances and calling sort.

        Animal cat = new Animal("Cat");
        Animal dog = new Animal("Dog");
        Animal dog2 = new Animal("Dog");
        Animal bird = new Animal("Bird");

        ArrayList<String> list = new ArrayList<String>();
        list.add(cat.getSpeciesName());
        list.add(dog.getSpeciesName());
        list.add(dog2.getSpeciesName());
        list.add(bird.getSpeciesName());
        Collections.sort(list);
        System.out.println(list);


        System.out.println(cat.compareTo(dog));
        System.out.println(dog.compareTo(dog2));
        System.out.println(dog2.compareTo(bird));
        System.out.println(cat.compareTo(dog2));
        System.out.println(dog.compareTo(bird));


        DomesticCat cosmos = new DomesticCat("Cosmos", "cat");
        DomesticCat yamato = new DomesticCat("Yamato", "cat");
        DomesticCat tama = new DomesticCat("Tama", "cat");
        DomesticCat belle = new DomesticCat("Belle", "cat");

        ArrayList<String> catList = new ArrayList<String>();
        catList.add(cosmos.getName());
        catList.add(yamato.getName());
        catList.add(tama.getName());
        catList.add(belle.getName());
        Collections.sort(catList);
        System.out.println("catlist: "+catList);


        System.out.println(cosmos.compareTo(yamato));
        System.out.println(cosmos.compareTo(tama));
        System.out.println(cosmos.compareTo(belle));
        System.out.println(yamato.compareTo(tama));
        System.out.println(yamato.compareTo(belle));
        System.out.println(tama.compareTo(belle));

        PlayingCards pc = new PlayingCards();
        System.out.println(pc.getpieces());
    }
}
