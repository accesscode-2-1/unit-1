package nyc.c4q.charlyn23;
/**
* Created by charlynbuchanan on 4/29/15.
*/
public class DomesticCat extends Animal implements Domestic {

    String name;

    public DomesticCat(String speciesName)
    {
        super(speciesName);
    }

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
