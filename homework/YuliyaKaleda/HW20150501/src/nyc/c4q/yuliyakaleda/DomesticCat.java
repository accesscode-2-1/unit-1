package nyc.c4q.yuliyakaleda;


/**
 * First Exercise
 * Created by Yuliya Kaleda on 4/27/15.
 */
public class DomesticCat extends Animal implements Domestic
{
    private String name;

    public DomesticCat(String speciesName, String name)
    {
        super(speciesName);
        this.name = name;
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

    public boolean equals(DomesticCat cat)
    {
        return (this.name.compareTo(cat.getSpeciesName()) == 0);
    }

    @Override
    public int compareTo(Animal ani)
    {
        DomesticCat cat = (DomesticCat) ani;

        if(this.name.equals(cat.getName()))
        {
            System.out.println("Domestic cats have the same name.");
            return 0;
        }
        else if(this.name.charAt(0) > cat.getName().charAt(0))
        {
            System.out.println("Animals have different names.");
            return 1;
        }
        else
        {
            System.out.println("Animals have different names.");
            return - 1;
        }
    }
}
