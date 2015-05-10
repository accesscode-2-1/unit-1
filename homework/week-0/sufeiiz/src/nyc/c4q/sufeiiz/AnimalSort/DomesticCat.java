package nyc.c4q.sufeiiz.AnimalSort;

/**
 * Created by sufeizhao on 5/9/15.
 */
public class DomesticCat extends Animal implements Domestic {
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Animal o) {
        if(o instanceof Domestic) {
            String bName = ((Domestic)o).getName();
            return this.name.compareTo(bName);
        } else {
            return super.compareTo(o);
        }
    }

    public boolean equals(Object obj) {
        if(obj instanceof Domestic) {
            String bName = ((Domestic)obj).getName();
            return this.name.equals(bName);
        } else {
            return super.equals(obj);
        }
    }
}
