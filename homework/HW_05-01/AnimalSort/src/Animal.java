

public class Animal implements Comparable<Animal>
{
    String speciesName;

    public Animal(String s){
        speciesName = s;
    }

    @Override
    public int compareTo(Animal o)
    {
        if(this.speciesName.toLowerCase().compareTo(o.speciesName.toLowerCase()) < 0)
        {
            return - 1; //if the object animal's name is alphabetically before this's name
        }
        else if(this.speciesName.toLowerCase().compareTo(o.speciesName.toLowerCase()) == 0)
        {
            return 0; //If they are the same
        }
        else
        {
            return 1; // if the object animal's name is alphabetically after this's name
        }

    }

    public boolean equals(Animal ani)
    {
        return speciesName.equals(ani.speciesName);
    }


}
