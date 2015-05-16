package nyc.c4q.jorgereina1986;

/**
 * Access Code 2.1
 * Created by Jorge Reina on 5/4/15.
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
        return super.compareTo(o);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof DomesticCat) {
            DomesticCat cat1 = (DomesticCat) obj;
            return this.getName().equals(cat1.getName());
        }
        return false;
    }

    public DomesticCat()
    {
    }
}
