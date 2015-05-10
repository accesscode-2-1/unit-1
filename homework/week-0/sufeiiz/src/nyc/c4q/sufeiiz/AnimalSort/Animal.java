package nyc.c4q.sufeiiz.AnimalSort;

/**
 * Created by sufeizhao on 5/9/15.
 */
public class Animal implements Comparable<Animal> {
    private String speciesName;

    public Animal() {
        this.speciesName = "Unknown";
    }

    public Animal(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getSpeciesName() {
        return this.speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public int compareTo(Animal o) {
        String bName = o.getSpeciesName();
        return this.speciesName.compareTo(bName);
    }

    public boolean equals(Object obj) {
        if(obj instanceof Animal) {
            String bName = ((Animal)obj).getSpeciesName();
            return this.speciesName.equals(bName);
        } else {
            return false;
        }
    }
}
