package nyc.c4q.RosmaryFC;
/**
 * Created by c4q-rosmary on 5/1/15.
 */

//Create an Animal class that includes a "species name" field and implements the Comparable interface.
public class Animal implements Comparable<Animal>
{
    public String speciesName;

    public Animal (String speciesName){
        this.speciesName = speciesName;
    }

    public String getSpeciesName() {
        return this.speciesName;
    }


    //// Compare two animals by species name, alphabetically.
    @Override
    public int compareTo(Animal other) // todo: looked this up, not sure how it works
    // compareTo should return < 0 if this is supposed to be
    // less than other, > 0 if this is supposed to be greater than
    // other and 0 if they are supposed to be equal
    {
        //Implement equals to compare by species name.
        int species = this.speciesName.compareTo(other.speciesName);
        return species == 0 ? this.speciesName.compareTo(other.speciesName) : species;
    }
}
