package nyc.c4q.ahhhlvin;
/**
 * Created by alvin2 on 4/29/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
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

    }

    @Override
    public String getName()
    {
        return this.name;
    }


    public int compareTo(DomesticCat o)
    {
        // return -1 if first one is EARLIER in alphabet than what comes after compareTo, return 0 if both are same, return +1 if LATER in alphabet
        return ((this.name).compareTo(o.getName()));
    }

    public boolean equals(Domestic o)
    {
        return (this.name.equals(o.getName()));
    }



}
