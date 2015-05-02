package nyc.c4q.sufeiiz.AnimalSort;

/**
 * Created by sufeizhao on 4/25/15.
 * Problem 1: Animal Sort
 *
 * Create an Animal class that includes a "species name" field and implements the Comparable interface.
 * Compare two animals by species name, alphabetically.
 * Override equals to compare by species name.
 */

public class Animal implements Comparable<Animal>{

    private String speciesName;

    public Animal() {
        speciesName = "Unknown";
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

    @Override
    public int compareTo(Animal o) {
        String bName = ((Animal) o).getSpeciesName();
        return speciesName.compareTo(bName);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            String bName = ((Animal) obj).getSpeciesName();
            return speciesName.equals(bName);
        }
        return false;
    }
}
