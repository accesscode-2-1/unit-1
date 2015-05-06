

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal cat = new Animal("Cat");
        Animal dog = new Animal("Dog");
        Animal bat = new Animal("Bat");
        Animal lion = new Animal("Lion");
        Animal panther = new Animal("Panther");


        ArrayList<Animal> list = new ArrayList<Animal>();
        list.add(cat);
        list.add(dog);
        list.add(bat);
        list.add(lion);
        list.add(panther);

        Collections.sort(list);
        for(Animal ani : list){
            System.out.println(ani.speciesName);
        }

        DomesticCat cat1 = new DomesticCat("Cat", "harry");
        DomesticCat cat2 = new DomesticCat("Cat", "doug");
        DomesticCat cat3 = new DomesticCat("Cat", "larry");

        ArrayList<DomesticCat> cats = new ArrayList<DomesticCat>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        Collections.sort(cats);

        for(DomesticCat catt : cats){
            System.out.println(catt.getName());

        }


    }
}
