package nyc.c4q.jvvlives2005;
/**
 * Created by c4q-joshelynvivas on 5/5/15.
 */
public class Animal implements Comparable
{
    String speciesName;

    public Animal(String speciesName)
    {
        this.speciesName = speciesName;
    }

    @Override
    public int compareTo(Object o)
    {
        return 0;
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }
}