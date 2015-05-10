package nyc.c4q.sufeiiz.AnimalSort;


/**
 * Created by sufeizhao on 4/25/15.
 *
 * Create a class for a Domestic Animal, perhaps a DomesticCat,
 * that both inherits from Animal and implements the Domestic interface.
 * Override the compareTo function for your Domestic animal so that it compares two such animals by their given name.
 * Override equals to compare by given name.
 * Create a constructor for your Domestic animal that takes in both the species name and given name.
 */

public class DomesticCat extends Animal implements Domestic{

    private String name;
    private String speciesName;

    public DomesticCat(String name) {
        this.speciesName = "Cat";
        this.name = name;
    }

    public DomesticCat(String speciesName, String name) {
        this.speciesName = speciesName;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Animal o) {
        if (o instanceof Domestic) {
            String bName = ((Domestic) o).getName();
            return name.compareTo(bName);
        } else
            return super.compareTo(o);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Domestic) {
            String bName = ((Domestic) obj).getName();
            return name.equals(bName);
        } else
            return super.equals(obj);
    }
}
