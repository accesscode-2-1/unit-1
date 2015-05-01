package nyc.c4q.charlyn23;

/**
 * Created by charlynbuchanan on 4/29/15.
 */
public class Animal implements Comparable<Animal>
{
    String species;

    public String getSpecies()
    {
        return species;
    }

    @Override
    public int compareTo(Animal o)
    {
        return this.species.compareTo(o.getSpecies());
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Animal) {
            Animal a1 = (Animal) obj;
            return this.getSpecies().equals(a1.getSpecies());
        }
        return false;

    }


}
