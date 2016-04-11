package nyc.c4q.hyunj0;

/**
* Created by c4q-sarahkim on 5/1/15.
*/
public class DomesticCat extends Animal implements Domestic
{
    private String name;

    public DomesticCat(String speciesName, String name)
    {
        super(speciesName);
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String givenName) {
        this.name = givenName;
    }

    @Override
    public int compareTo (Animal animal) {
        DomesticCat animalNow = (DomesticCat) animal;
        return this.getName().compareTo(animalNow.getName());
    }

    @Override
    public boolean equals(Object animal)
    {
        DomesticCat animalNow = (DomesticCat) animal;
        return this.getName().equals(animalNow.getName());
    }

}
