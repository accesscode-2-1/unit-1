package nyc.c4q.RosmaryFC;
/**
 * Created by c4q-rosmary on 5/2/15.
 */

//Create a class for a Domestic Animal, perhaps a DomesticCat,
// that both inherits from Animal and implements the Domesitic interface.
public class DomesticCat extends Animal implements Domestic
{
    String name;

    public DomesticCat(String speciesName, String name)
    {
        super(speciesName);
        this.name = name;

    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public String setName(String newName)
    {
        this.name = newName;
        return name;
    }

    //Implement the compareTo function for your Domestic animal so that
    // it compares two such animals by their given name instead of their species name.
    public int compareTo(DomesticCat other) // todo: looked this up, not sure how it works -- did you want me to have it available for any domestic animal?
    // compareTo should return < 0 if this is supposed to be
    // less than other, > 0 if this is supposed to be greater than
    // other and 0 if they are supposed to be equal
    {
        //Implement equals to compare by given name.
        int names = this.name.compareTo(other.name);
        return names == 0 ? this.name.compareTo(other.name) : names;
    }
}
