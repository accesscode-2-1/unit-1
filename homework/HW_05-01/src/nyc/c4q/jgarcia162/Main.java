package nyc.c4q.jgarcia162;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String hello;

        //Test your compareTo function by creating an array of Animal instances and calling sort.
        ArrayList<Animal> list = new ArrayList<Animal>();
        Animal dog = new Animal("Dog");
        Animal cat = new Animal("Cat");
        Animal snake = new Animal("Snake");
        list.add(dog);
        list.add(cat);
        list.add(snake);

        Collections.sort(list);

        System.out.println(snake.compareTo(dog));
        System.out.println(cat.compareTo(snake));
    }
}

