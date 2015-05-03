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
    private String domesticAnimalName;

    public String getDomesticAnimalName()
    {
        return domesticAnimalName;
    }

    public void setDomesticAnimalName(String domesticAnimalName)
    {
        this.domesticAnimalName = domesticAnimalName;
    }

    public DomesticAnimal(String speciesName, String domesticAnimalName)
    {
        super(speciesName);
        this.domesticAnimalName = domesticAnimalName;
    }

    public DomesticAnimal(String speciesName)
    {
        super(speciesName);
    }


//don't know how to use these methods in this class
    @Override
    public boolean equals(Object Animal)
    {
        return super.equals(Animal);
    }

    @Override
    public int compareTo(Object Animal)
    {
        return super.compareTo(Animal);
    }
}
