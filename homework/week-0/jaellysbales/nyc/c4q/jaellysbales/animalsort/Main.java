package nyc.c4q.jaellysbales.animalsort;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Access Code 2.1
 * Created by Jaellys Bales on 4/29/15.
 * Project: week-0
 */

public class Main
{
    public static void main(String[] args)
    {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        a1.compareTo(a2);

        ArrayList<Animal> list = new ArrayList<Animal>();
        Collections.sort(list);
    }
}
