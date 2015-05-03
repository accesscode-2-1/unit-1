package hw0501;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Access Code 2.1
 * Ray Acevedo
 * DomesticCat.java
 */
public class DomesticCat extends Animal implements Domestic
{
    private String name;
    private String species;


    public DomesticCat (){}
    public DomesticCat (String name){}
    public DomesticCat (String name, String species){
        this.name=name;
        this.species=species;
    }
    @Override
    public int compareTo(Animal animal)
    {
        animal = new DomesticCat();
        DomesticCat domesticCat = (DomesticCat) animal;
        return name.compareTo(domesticCat.getName());
    }

    @Override
    public void setName(String Name)
    {
        this.name=name;
    }

    @Override
    public String getName()
    {
        return name;
    }
}
