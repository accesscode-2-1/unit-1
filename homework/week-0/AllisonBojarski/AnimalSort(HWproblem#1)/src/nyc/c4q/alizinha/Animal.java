package nyc.c4q.alizinha;
/**
 * Created by c4q-Allison on 5/1/15.
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
