/**
 * Created by Luke Lee on 4/26/15.
 */
public class DomesticCat extends Animal implements Domestic {

    String name;

    public DomesticCat(String species, String name) {
        this.spicies = species;
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
        if (o instanceof Domestic) {
            Domestic a = (Domestic) o;
            return this.getName().compareTo(a.getName());
        } else {
            return super.compareTo(o);
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Domestic) {
            Domestic a = (Domestic) obj;
            return this.getName().equals(a.getName());
        }
        return false;
    }
}
