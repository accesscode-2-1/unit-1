package nyc.c4q.m47bell;
/**
 * Created by c4q-marbella on 4/29/15.
 * Access Code 2-1
 * Marbella Vidals
 * Create an Animal class that includes a "species name" field and
 * implements the Comparable interface. Compare two animals by species
 * name, alphabetically.
 */
public class Animal implements Comparable <Animal>
{
    public String speciesName;


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


    public boolean equals(Animal o)
    {

        return (this.speciesName.equals(o.getSpeciesName()));
    }


    @Override
    public int compareTo(Animal o)
    {
        return (this.speciesName.compareTo(o.getSpeciesName()));
    }
}
