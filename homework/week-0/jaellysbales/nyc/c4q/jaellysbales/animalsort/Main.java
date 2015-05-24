import java.util.ArrayList;
import java.util.Collections;
/**
 * Access Code 2.1
 * Created by Jaellys Bales on 4/29/15.
 * Project: Animal Sort
 */
public class Main
{
    public static void main(String[] args)
    {
        Animal a1 = new Animal("Black Rhino");
        Animal a2 = new Animal("Macaw");
        Animal a3 = new Animal("Slow Loris");
        Animal a4 = new Animal("Loggerhead Turtle");
        Animal a5 = new Animal("Narwhal");

        ArrayList<Animal> list = new ArrayList<Animal>();

        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);

        Collections.sort(list);

        // LOL I don't sort. Fix in progress. :(
        for(Animal animal : list)
        {
            System.out.println(animal.getSpecies());
        }


    }
}
