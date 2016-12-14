package nyc.c4q.fattyduck;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal[] bloop = new Animal[3];
        bloop[0]= new Animal("Cow","cow", 1);
        bloop[1]= new Animal("Pig", "Allan",2);
        bloop[2]= new Animal("Duck", "duck", 1);
        System.out.println(bloop[2].compareTo(bloop[0]));
        System.out.println(bloop[2].compareTo(bloop[1]));
        System.out.println(bloop[2].compareTo(bloop[2]));
        System.out.println(bloop[0].equals(bloop[0]));
        System.out.println(bloop[0].equals(bloop[1]));
        System.out.println();


        domesticAnimal[] blap = new domesticAnimal[3];
        blap[0]= new domesticAnimal("Cow","Cow", 1);
        blap[1]= new domesticAnimal("Cow", "Allan",2);
        blap[2]= new domesticAnimal("Duck", "Duck", 1);
        System.out.println(blap[0].compareTo(blap[0]));
        System.out.println(blap[0].compareTo(blap[1]));
        System.out.println(blap[0].compareTo(blap[2]));

        System.out.println(bloop[0].equals(bloop[0]));
        System.out.println(bloop[0].equals(bloop[1]));

    }
}
