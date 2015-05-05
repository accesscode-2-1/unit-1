package nyc.c4q.Amcbri15;
/**
 * Created by c4q-anthony-mcbride on 5/1/15.
 */
public class DomesticDog extends Animal implements Domestic
{
    private String name;

    public DomesticDog(String name, String speciesName)
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

    public boolean equals(DomesticDog dog)
    {
        return (this.name.compareTo(dog.getName()) == 0);
    }

    @Override
    public int compareTo(Animal animal)
    {
        DomesticDog dog = (DomesticDog) animal;
        // Order is 1, 0, -1 for sorting
        int returnNum = 0;
        // Returns 0 if the species are the same
        if(this.getName().equals(dog.getName()))
        {
            return returnNum;
        }
        // Returns
        if(this.getName().length() < dog.getName().length())
        {
            returnNum = 1;
            for(int i = 0; i < this.getName().length(); i++)
            {
                if(this.getName().charAt(i) > dog.getName().charAt(i))
                {
                    return - 1;
                }
                if(this.getName().charAt(i) < dog.getName().charAt(i))
                {
                    return 1;
                }
            }
        }
        else
        {
            returnNum = - 1;
            for(int i = 0; i < dog.getName().length(); i++)
            {
                if(this.getName().charAt(i) > dog.getName().charAt(i))
                {
                    return - 1;
                }
                if(this.getName().charAt(i) < dog.getName().charAt(i))
                {
                    return 1;
                }
            }
        }
        return returnNum;
    }
    @Override
    public String toString(){
        return this.getName();
    }
}
