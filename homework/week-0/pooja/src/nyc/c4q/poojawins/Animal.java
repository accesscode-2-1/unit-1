package nyc.c4q.poojawins;

/**
 * Created by pooja on 5/1/15.
 */
public class Animal implements Comparable<Animal> {
    private String speciesName;

    public Animal(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public int compareTo(Animal animal) {
        return speciesName.compareTo(animal.speciesName);
    }

    public boolean equals(Animal animal) {
        return speciesName.equals(animal.speciesName);
    }

    @Override
    public String toString() {
        return getSpeciesName() + " I am";
    }

}

