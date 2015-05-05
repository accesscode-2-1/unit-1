package nyc.c4q.poojawins;

/**
 * Created by pooja on 5/1/15.
 */
public class DomesticCat extends Animal implements Domestic {
    private String name;

    public DomesticCat(String name) {
        super("Felis catus");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Animal animal) {
        if (animal instanceof DomesticCat) {
            return name.compareTo(((DomesticCat) animal).name);
        } else {
            return super.compareTo(animal);
        }
    }

    @Override
    public boolean equals(Animal animal) {
        if (animal instanceof DomesticCat) {
            return name.equals(((DomesticCat) animal).name);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return getName() + " the cat I am";
    }

}
