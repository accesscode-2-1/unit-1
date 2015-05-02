package nyc.c4q.m47bell;
/**
 * Created by c4q-marbella on 4/29/15.
 * Access Code 2-1
 * Marbella Vidals
 * Create an Animal class that includes a "species name" field and
 * implements the Comparable interface. Compare two animals by species
 * name, alphabetically.
 */
public class Animal implements Comparable
{

public String speciesName;

    @Override
    public int compareTo(Object o)
    {
        return 0;
    }

    //Implement equals to compare by species name.

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }





}
