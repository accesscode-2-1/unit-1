package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 4/29/15.
 */
import java.lang.NullPointerException;
public class Animal implements Comparable<Animal> {
    public String speciesName;
    public String name;

    public Animal(){

    }

    public Animal(String animalName) {
        super();
        name = animalName;
    }



//    public Animal DomesticDog(String speciesName, String animalName) {
//        Animal x = new Animal(animalName);
//        x.speciesName = "Canine";
//        return x;
//    }


    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }







//    The value 0 if the argument is a string lexicographically equal to this string; a value less than 0 if the argument is a string lexicographically greater than this string;
//    and a value greater than 0 if the argument is a string lexicographically less than this string.
    @Override
    public int compareTo(Animal z) {

        return this.getSpeciesName().compareTo(z.getSpeciesName());
    }

    public boolean equals(Animal z) {
        return ((this.getSpeciesName()).equals(z.getSpeciesName()));
    }
}

