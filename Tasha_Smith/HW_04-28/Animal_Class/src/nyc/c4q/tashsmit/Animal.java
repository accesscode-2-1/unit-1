package nyc.c4q.tashsmit;
/**
 * Created by c4q-tashasmith on 4/28/15.
 */
public class Animal implements Comparable<Animal>
{
    String speciesName;

    public Animal (String speciesName) {
        this.speciesName= speciesName;
    }

    public String getSpeciesName()
    {
        return speciesName;
    }

    public void setSpeciesName(String speciesName)
    {
        this.speciesName = speciesName;
    }

    @Override
    public int compareTo(Animal o)
    {
        return ((this.speciesName).compareTo(o.getSpeciesName()));
    }

    public boolean equalsTo (Animal o) {
        return (this.speciesName.equals(o.getSpeciesName()));
    }


    public static void main (String args []) {

    }

}
