/**
 * Created by c4q-madelyntavarez on 4/30/15.
 */
public class DomesticAnimal extends Animal implements Domestic
{
    String name;
    String species;


    public DomesticAnimal(String n)
    {

        super(n);
        //o=species;

    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setName(String name)
    {
        this.name=name;
    }
}
