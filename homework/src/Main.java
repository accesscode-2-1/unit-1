package nyc.c4q.lukesterlee;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String hello;

        ArrayList<Animal> list = new ArrayList<Animal>();
        Animal a1 = new Animal("Dog");
        Animal a2 = new Animal("Cat");
        Animal a3 = new Animal("Dog");
        list.add(a1);
        list.add(a2);
        list.add(a3);

        Collections.sort(list);



        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(a3));
    }
}
