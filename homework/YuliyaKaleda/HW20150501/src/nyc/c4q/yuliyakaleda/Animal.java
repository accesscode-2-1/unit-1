package nyc.c4q.yuliyakaleda;

/**
 * First Exercise
 * Created by Yuliya Kaleda on 4/27/15.
 */
public class Animal implements Comparable<Animal>
{
    private String speciesName;

    public Animal()
    {
    }

    public Animal(String speciesName)
    {
        speciesName = speciesName;
    }

    public String getSpeciesName()
    {
        return this.speciesName;
    }

    @Override
    public int compareTo(Animal ani)
    {
        if(this.speciesName.equals(ani.getSpeciesName()))
        {
            System.out.println("Animals have the same species name.");
            return 0;
        }
        else if(this.speciesName.charAt(0) > (ani.getSpeciesName()).charAt(0))
        {
            System.out.println("Animals have different species names.");
            return 1;
        }
        else
        {
            System.out.println("Animals have different species names.");
            return - 1;
        }
    }

    public boolean equals(Animal ani)
    {
        return (this.speciesName.compareTo(ani.getSpeciesName()) == 0);
    }
}
