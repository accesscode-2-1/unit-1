/**
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
        Animal animal1 = (Animal) obj;
        return this.getSpecies().equals(animal1.getSpecies());
    }
}
