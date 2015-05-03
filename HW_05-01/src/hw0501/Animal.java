package hw0501;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Access Code 2.1
 * Ray Acevedo
 * Animal.java
 */

public class Animal implements Comparable<Animal>
{
    String speciesName;
    public Animal(){}
    public Animal(String speciesName){}
    public void setSpeciesName (String speciesName){speciesName = this.speciesName;}
    public String getSpeciesName(){return speciesName;}


    public static void putInAlphabetical (Animal a, Animal b)
    {
        ArrayList<Animal>animals = new ArrayList<Animal>();
        animals.add(a);
        animals.add(b);
        Collections.sort(animals);
        for(Animal animal:animals){
            System.out.println(animal);
        }
    }

    @Override
    public int compareTo(Animal animal)
    {
        return speciesName.compareTo(animal.getSpeciesName());
    }

    public static void main(String[] args){}
}