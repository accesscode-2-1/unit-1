package nyc.c4q.hyunj0;

public class Animal implements Comparable<Animal>
{
    private String speciesName;

    public Animal (String speciesName) {
        this.speciesName = speciesName;
    }

    public String getSpeciesName () {
        return speciesName;
    }

    public void setSpeciesName (String speciesName) {
        this.speciesName = speciesName;
    }

    @Override
    public int compareTo (Animal animal) {
        return this.getSpeciesName().compareTo(animal.getSpeciesName());
    }

    @Override
    public boolean equals(Object animal)
    {
        Animal animalNow = (Animal) animal;
        return this.getSpeciesName().equals(animalNow.getSpeciesName());
    }
}
