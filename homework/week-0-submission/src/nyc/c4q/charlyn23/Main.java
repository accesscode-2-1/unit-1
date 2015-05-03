package nyc.c4q.charlyn23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal a1 = new Animal("Dog");
        Animal a2 = new Animal("Cat");
        a1.compareTo(a2);

        ArrayList<Animal> list  = new ArrayList<Animal>();

        //New Animal Instances
        DomesticCat c1 = new DomesticCat("Tabby");
        Animal a4 = new DomesticCat("Calico");
        DomesticCat c5 = (DomesticCat) a4;
        DomesticCat c2 = new DomesticCat("KittyPurry");

        Comparable<Animal>c1
        ArrayList<Animal> list5 = new ArrayList<Animal>();


        Collections.sort(list);
        //Comparable<Animal>();
    }
}
