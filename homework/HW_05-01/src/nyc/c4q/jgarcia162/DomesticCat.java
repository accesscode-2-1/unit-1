package nyc.c4q.jgarcia162;
/**
 * Created by Jose on 5/1/15.
 */

//Create a class for a Domestic Animal, perhaps a DomesticCat, that both inherits from Animal and implements the Domestic interface.
public class DomesticCat extends Animal implements Domestic {

    String name;

    //Create a constructor for your Domestic animal that takes in both the species name and given name.
    public DomesticCat(String species, String name) {
        this.species = species;
        this.name = name;

    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    //Implement the compareTo function for your Domestic animal so that it compares two such animals by their given name instead of their species name.
    @Override
    public int compareTo(Animal o) {
        if (o instanceof Domestic) {
            Domestic a = (Domestic) o;
            return this.getName().compareTo(a.getName());
        } else {
            return super.compareTo(o);
        }

    }

    //Implement equals to compare by given name.
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Domestic) {
            Domestic a = (Domestic) obj;
            return this.getName().equals(a.getName());
        }
        return false;
    }
}