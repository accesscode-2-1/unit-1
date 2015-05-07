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

    public static void sort(DomesticCat[] cats){

        for(int i = 1; i < cats.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(cats[j-1].compareTo(cats[j]) > 0){
                    DomesticCat toSwap = cats[j-1];
                    cats[j-1] = cats[j];
                    cats[j] = toSwap;
                }else
                {
                    break;
                }
            }
        }

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
