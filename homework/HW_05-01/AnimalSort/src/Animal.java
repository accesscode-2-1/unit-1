

public class Animal implements Comparable<Animal>
{
    String speciesName;

    public Animal(String s){
        speciesName = s;
    }

    @Override
    public int compareTo(Animal o)
    {
       return this.speciesName.toLowerCase().compareTo(o.speciesName.toLowerCase());
       
    }

    public boolean equals(Animal ani)
    {
        return speciesName.equals(ani.speciesName);
    }



}
