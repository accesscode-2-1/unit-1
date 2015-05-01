package nyc.c4q.charlyn23;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal a1 = new Animal();
        Animal a2 = new Animal();
        a1.compareTo(a2);

        ArrayList<Animal> list  = new ArrayList<Animal>();

        ArrayList<Person> list2 = new ArrayList<Person>();

        DomesticCat c1 = new DomesticCat();


        Animal a4 = new DomesticCat();

        DomesticCat c5 = (DomesticCat) a4;

        DomesticCat c2 = new DomesticCat();
        Person p1 = new Person();

        ArrayList<Animal> list5 = new ArrayList<Animal>();


        Collections.sort(list);

    }
}
