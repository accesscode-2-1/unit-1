package nyc.c4q.m47bell;
/**
 * Created by c4q-marbella on 4/29/15.
 * Access Code 2-1
 * Marbella Vidals
 * Create an Animal class that includes a "species name" field and
 * implements the Comparable interface. Compare two animals by species
 * name, alphabetically.
 */
public class Animal implements Comparable
{
    public String speciesName;
    private Object animal;

    public Animal(String speciesName)
    {
        this.speciesName = speciesName;
    }

    public String getSpeciesName()
    {
        return speciesName;
    }

    public void setSpeciesName(String speciesName)
    {
        this.speciesName = speciesName;
    }

    @Override
    public int compareTo(Object Animal)
    {
        animal = Animal;
        return 0;
    }

    //Implement equals to compare by species name.

    @Override
    public boolean equals(Object Animal)
    {
        return super.equals(Animal);
    }


}
