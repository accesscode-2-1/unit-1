/**
 * Access Code 2.1
 * Created by Jaellys Bales on 4/29/15.
 * Project: Animal Sort
 */
public class Animal implements Comparable<Animal> {
    private String species;
    private String name;

    public String getSpecies()
    {
        return species;
    }

    public Animal(){}

    public Animal (String species)
    {
        this.species = species;
    }

    @Override
    public int compareTo(Animal o)
    {
        return 0;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Animal) {
            // Cast obj to Animal type to access species getter.
            Animal a1 = (Animal) obj;
            return this.getSpecies().equals(a1.getSpecies());
        }
        return false;
    }


}

