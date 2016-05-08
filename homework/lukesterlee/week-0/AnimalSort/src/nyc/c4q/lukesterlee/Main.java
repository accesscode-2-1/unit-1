package nyc.c4q.lukesterlee;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Animal a1 = new Animal("Dog");
        Animal a2 = new DomesticCat("Cat", "Bobo");
        Animal a3 = new DomesticCat("Cat", "Mimi");

        ArrayList<Animal> list = new ArrayList<Animal>();
        list.add(a1);
        list.add(a2);

        // sort the array list.
        Collections.sort(list);

        System.out.println(a1.compareTo(a2));
        System.out.println(a2.compareTo(a3));

        System.out.println(a1.equals(a2));
        System.out.println(a2.equals(a3));

    }
}
