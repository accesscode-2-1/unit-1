package nyc.c4q.m47bell;
/**
 * Created by c4q-marbella on 5/1/15.
 * Access Code 2-1
 * Marbella Vidals
 *Create a class for a Domestic Animal, perhaps a DomesticCat, that both
 *  inherits from Animal and implements the Domesitc interface.
 */
public abstract class DomesticAnimal extends Animal implements Domestic
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public DomesticAnimal(String speciesName, String name)
    {
        super(speciesName);
        this.name = name;
    }


    public boolean equals(DomesticAnimal o)
    {
        return (this.name).equals(o.getName());
    }


    public int compareTo(DomesticAnimal o)
    {
        return (this.name.compareTo(o.getName()));
    }
}
