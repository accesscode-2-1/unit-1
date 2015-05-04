/**
 * Created by kadeemmaragh on 5/1/15.
 */
public class DomesticCat extends Animal implements Domestic
{
    private String petName;

    public DomesticCat(String species, String name){
        super(species);
        petName = name;
    }

    @Override
    public int compareTo(Animal o)
    {
        if(o instanceof DomesticCat)
        {
            if(this.petName.toLowerCase().compareTo(((DomesticCat) o).petName.toLowerCase()) < 0)
            {
                return - 1; //if the object animal's name is alphabetically before this's name
            }
            else if(this.petName.toLowerCase().compareTo(((DomesticCat) o).petName.toLowerCase()) == 0)
            {
                return 0; //If they are the same
            }
            else
            {
                return 1; // if the object animal's name is alphabetically after this's name
            }
        }
        else{
            return 1;
        }
    }

    @Override
    public boolean equals(Animal ani)
    {
        if(ani instanceof DomesticCat)
        {
            return petName.equals(((DomesticCat) ani).petName);
        }
        else {
            return false;
        }
    }

    @Override
    public String getName()
    {
        return petName;
    }

    @Override
    public void setName(String name)
    {
        petName = name;
    }
}
