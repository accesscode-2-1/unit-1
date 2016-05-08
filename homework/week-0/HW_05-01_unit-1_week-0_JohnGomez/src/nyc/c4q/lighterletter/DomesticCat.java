package nyc.c4q.lighterletter;
/**
 * Created by c4q-john on 4/29/15.
 */
public class DomesticCat extends Animal implements Domestic
{
    String name;

    public DomesticCat(String name,String speciesName)
    {
        super(speciesName);
        this.name = name;
    }


    @Override
    public void setName(String name)
    {

    }

    @Override
    public String getname()
    {
        return null;
    }
    public int compareTo(DomesticCat o)
    {
        return ((this.name).compareTo(o.getname()));
    }
    public boolean equals (DomesticCat o){
        return (this.name.equals(o.getname()));
    }
}
