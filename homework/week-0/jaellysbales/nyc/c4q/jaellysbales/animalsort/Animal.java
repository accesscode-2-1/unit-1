package nyc.c4q.jaellysbales.animalsort;
/**
 * Access Code 2.1
 * Created by Jaellys Bales on 4/29/15.
 * Project: week-0
 *
 * Animal.java
 * Enter a description.
 */
public class Animal implements Comparable<Animal> {
    String species;

    public String getSpecies()
    {
        return species;
    }

    @Override
    public int compareTo(Animal o)
    {
        return 0;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Animal) {
            // Cast obj to Animal type to access species getter.
            Animal a1 = (Animal) obj;
            return this.getSpecies().equals(a1.getSpecies());
        }
        return false;
    }


}

