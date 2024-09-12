package nyc.c4q.tashsmit;

/**
 * Created by c4q-tashasmith on 4/29/15.
 */
public class DomesticCat extends Animal implements Domestic
{
    String name;

    public DomesticCat(String speciesName, String name)
    {

        super(speciesName);
        this.name = name;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    public int compareTo(DomesticCat o)
    {
        return ((this.name).compareTo(o.getName()));
    }

    public boolean equalsTo (DomesticCat o) {
        return (this.name.equals(o.getName()));
    }
}


