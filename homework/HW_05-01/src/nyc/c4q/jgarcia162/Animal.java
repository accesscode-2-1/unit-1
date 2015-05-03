package nyc.c4q.jgarcia162;
/**
 * Created by Jose on 4/29/15.
 */

// Create an Animal class that includes a "species name" field and implements the Comparable interface. Compare two animals by species name, alphabetically.
public class Animal implements Comparable<Animal> {

    String species;

    public Animal() {

    }

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public int compareTo(Animal o) {
        return this.getSpecies().compareTo(o.getSpecies());
    }

    //Implement equals to compare by species name.
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            Animal a = (Animal) obj;
            return this.getSpecies().equals(a.getSpecies());
        }
        return false;
    }



}
