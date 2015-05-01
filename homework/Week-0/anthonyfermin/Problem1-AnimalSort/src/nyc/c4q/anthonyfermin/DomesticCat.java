package nyc.c4q.anthonyfermin;
/**
 * Created by c4q-anthonyf on 4/30/15.
 */
public class DomesticCat extends Animal implements Domestic
{
    String givenName;

    public DomesticCat(String name)
    {
        super("Cat");
        givenName = name;
    }

    @Override
    public String getGivenName()
    {
        return givenName;
    }

    @Override
    public void setGivenName(String name)
    {
        givenName = name;
    }

    public int compareTo(DomesticCat cat){

        String first = this.getGivenName().toLowerCase();
        String second = cat.getGivenName().toLowerCase();

        return compareStrings(first, second);

    }

    public boolean equals(DomesticCat cat){
        return this.getGivenName().equalsIgnoreCase(cat.getGivenName());
    }
}
