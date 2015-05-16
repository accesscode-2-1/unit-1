package nyc.c4q.jorgereina1986;

/**
 * Access Code 2.1
 * Created by Jorge Reina on 5/4/15.
 */
public class Animal implements Comparable<Animal>
{
    String species;


    public String getSpecies()
    {
        return species;
    }

    public void setSpecies(String species)
    {
        this.species = species;
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
            Animal animal1 = (Animal) obj;
            return this.getSpecies().equals(animal1.getSpecies());
        }
        return false;
    }
}
