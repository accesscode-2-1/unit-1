package nyc.c4q.charlyn23;

/**
 * Created by charlynbuchanan on 4/29/15.
 */
/*Create an Animal class that includes a "species name" field and implements the Comparable
 interface.
  */
public class Animal implements Comparable<Animal> {
    String speciesName;

    public Animal(String speciesName)
    {
        this.speciesName = speciesName;
    }

    public String getSpecies()
    {
        return speciesName;
    }
//Compare two animals by species name, alphabetically.
    @Override
    public int compareTo(Animal o)
    {
        if (this.speciesName)
        return this.speciesName.compareTo(o.getSpecies());
    }


    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Animal) {
            Animal a1 = (Animal) obj;
            return this.getSpecies().equals(a1.getSpecies());
        }
        return false;

    }


}
