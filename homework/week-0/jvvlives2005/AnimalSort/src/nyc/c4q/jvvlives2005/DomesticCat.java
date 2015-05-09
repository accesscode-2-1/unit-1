package nyc.c4q.jvvlives2005;
/**
 * Created by c4q-joshelynvivas on 5/5/15.
 */
public class DomesticCat extends Animal
{

    public DomesticCat(String speciesName)
    {
        super(speciesName);
    }

    @Override
    public int compareTo(Object o)
    {
        return super.compareTo(speciesName);
    }




}
