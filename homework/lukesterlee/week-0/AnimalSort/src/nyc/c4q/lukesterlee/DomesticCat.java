package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Created by Luke Lee on 4/26/15.
 */
public class DomesticCat extends Animal implements Domestic {

    private String name;

    // added a constructor with no argument for preventing null pointer error.
    public DomesticCat() {
        super();
        this.name = "no name";
    }

    public DomesticCat(String species, String name) {
        super(species);
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

    @Override
    public int compareTo(Animal o) {
        // check if o is an instance of a class which implements Domestic interface.
        if (o instanceof Domestic) {
            Domestic a = (Domestic) o;
            return this.getName().compareTo(a.getName());
        }
        // Otherwise, it is an instance of Animal, so call super class method compareTo.
        else
            return super.compareTo(o);
    }

    @Override
    public boolean equals(Object obj) {
        // when obj is an instance of a class which implements Domestic interface.
        if (obj instanceof Domestic) {
            Domestic a = (Domestic) obj;
            return this.getName().equals(a.getName());
        }
        // when obj is an instance of Animal.
        else if (obj instanceof Animal)
            return super.equals(obj);

        // at this point, obj is not even an animal so automatically false.
        return false;
    }
}
