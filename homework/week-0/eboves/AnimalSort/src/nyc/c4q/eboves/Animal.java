package com.company;
/**
 * Created by elvisboves on 4/29/15.
 */
public class Animal implements Comparable<Animal>
{
    private String species;

    public Animal() {
        this.species = "nospecies";
    }

    public Animal(String species) {
        this.species = species;
    }

    public void setSpecies(String species)
    {
        this.species = species;
    }

    public String getSpecies()
    {
        return this.species;
    }

    @Override
    public int compareTo(Animal o)
    {
        return this.getSpecies().compareTo(o.getSpecies());

    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Animal)
        {
            Animal a1 = (Animal) obj;
            return this.getSpecies().equals(a1.getSpecies());
        }else
            return  false;
    }
}
