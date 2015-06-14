package nyc.c4q.alizinha;
/**
 * Created by c4q-Allison on 5/1/15.
 */
public class DomesticCat extends Animal implements Domestic
{

    String name;

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public int compareTo(Animal o)
    {
        if (o instanceof Domestic) {
            Domestic a1 = (Domestic) o;
            return this.getName().compareTo(a1.getName());
        }
        return super.compareTo(o);
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }
}
