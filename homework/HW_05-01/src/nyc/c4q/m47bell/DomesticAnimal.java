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


    public DomesticAnimal(String speciesName)
    {
        super(speciesName);
    }



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
