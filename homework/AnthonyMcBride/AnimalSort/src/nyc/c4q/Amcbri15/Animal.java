package nyc.c4q.Amcbri15;
/**
 * Created by c4q-anthony-mcbride on 5/1/15.
 */

public class Animal implements Comparable<Animal>
{
    private String speciesName;

    public Animal()
    {
    }

    public Animal(String speciesName)
    {
        this.speciesName = speciesName;
    }

    public String getSpeciesName()
    {
        return this.speciesName;
    }

    @Override
    public int compareTo(Animal animal)
    {
        // Order is 1, 0, -1 for sorting
        int returnNum = 0;
        // Returns 0 if the species are the same
        if(this.getSpeciesName().equals(animal.getSpeciesName()))
        {
            return returnNum;
        }
        // Returns
        if(this.getSpeciesName().length() < animal.getSpeciesName().length())
        {
            returnNum = 1;
            for(int i = 0; i < this.getSpeciesName().length(); i++)
            {
                if(this.getSpeciesName().charAt(i) > animal.getSpeciesName().charAt(i))
                {
                    return - 1;
                }
                if(this.getSpeciesName().charAt(i) < animal.getSpeciesName().charAt(i))
                {
                    return 1;
                }
            }
        }
        else
        {
            returnNum = - 1;
            for(int i = 0; i < animal.getSpeciesName().length(); i++)
            {
                if(this.getSpeciesName().charAt(i) > animal.getSpeciesName().charAt(i))
                {
                    return - 1;
                }
                if(this.getSpeciesName().charAt(i) < animal.getSpeciesName().charAt(i))
                {
                    return 1;
                }
            }
        }
        return returnNum;
    }

    public boolean equals(Animal animal)
    {
        // Compare species name by length
        if(this.getSpeciesName().length() != animal.getSpeciesName().length())
        {
            return false;
        }
        //Compare species name alphabetically (by each character)
        for(int i = 0; i < this.getSpeciesName().length(); i++)
        {
            if(this.getSpeciesName().charAt(i) != animal.getSpeciesName().charAt(i))
            {
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString(){
        return this.getSpeciesName();
    }
}

