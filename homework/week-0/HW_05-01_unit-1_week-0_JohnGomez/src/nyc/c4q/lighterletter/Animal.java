package nyc.c4q.lighterletter;
/**
 * Created by c4q-john on 4/28/15.
 */
public class Animal implements Comparable<Animal>
{
    String speciesName;

    public Animal(String speciesName)
    {
        this.speciesName = speciesName;
    }

    public Animal()
    {

    }

    public boolean equals (Animal o){
        return (this.speciesName.equals(o.getSpeciesName()));
    }

    @Override
    public int compareTo(Animal o)
    {
        return ((this.speciesName).compareTo(o.getSpeciesName()));
    }

    public String getSpeciesName()
    {

        return speciesName;
    }

    public void setSpeciesName(String speciesName)
    {

        this.speciesName = speciesName;
    }



}
