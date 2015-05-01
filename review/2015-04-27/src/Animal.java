import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *Created by c4q-madelyntavarez on 4/28/15.
 *Create an Animal class that includes a "species name" field
 * and implements the Comparable interface. Compare two animals
 * by species name, alphabetically.
 *Implement equals to compare by species name.
 *Test your compareTo function by creating an array of Animal
 *instances and calling sort.
 */
public class Animal implements Comparable<Animal>
{
    public String species;
    public Animal (String n){
        species=n;
    }

    public String getSpecies(){
        return species;
    }
    public void setSpecies(String n){
        species=n;
    }

    @Override
    public int compareTo(Animal o)
    {

        if(species.compareTo(o.getSpecies())>0){
            return 1;
        }
        else if (species.compareTo(o.getSpecies())<0)
        {
            return -1;
        }
        else
            return 0;
    }

    public static void main(String[] args)
    {

        String[] myAnimalList = new String[4];
        Animal animal1=new Animal("Dog");
        myAnimalList[0]=animal1.getSpecies();
        Animal animal2=new Animal("Cat");
        myAnimalList[1]=animal2.getSpecies();
        Animal animal3=new Animal("Elephant");
        myAnimalList[2]=animal3.getSpecies();
        Animal animal4= new Animal("Fish");
        myAnimalList[3]=animal4.getSpecies();

        Arrays.sort(myAnimalList);
        System.out.println(Arrays.toString(myAnimalList));

        int result= animal2.getSpecies().toLowerCase().compareTo(animal1.getSpecies().toLowerCase());

        if(result==0){
            System.out.println("Can't decipher");
    }
        else if(result == - 1)
        {
            System.out.println(animal2.getSpecies() + "," + animal1.getSpecies());
        }
        else
        {
            System.out.println(animal1.getSpecies()+","+animal2.getSpecies());
        }

        DomesticAnimal kitty=new DomesticAnimal("Kitty");
        DomesticAnimal tommy= new DomesticAnimal("Doggie");
        tommy.setName("doggie");
        tommy.setSpecies("Dog");
        kitty.setName("kitty");
        kitty.setSpecies("cat");

        int result2=kitty.compareTo(tommy);

        if(result2==0){
            System.out.println("Can't decipher");
        }
        else if(result2 == - 1)
        {
            System.out.println(tommy.getName() + "," + kitty.getName());
        }
        else
        {
            System.out.println(kitty.getName()+","+tommy.getName());
        }

    }
}

