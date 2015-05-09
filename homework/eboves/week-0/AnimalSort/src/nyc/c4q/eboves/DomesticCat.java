package com.company;
/**
 * Created by elvisboves on 5/4/15.
 */
public class DomesticCat extends Animal implements Domestic
{

    private String name;



    public DomesticCat(String species, String name)
    {
        super(species);
        this.name = name;
    }



    @Override
    public int compareTo(Animal o)
    {
        if(o instanceof Domestic) {
            Domestic cat1 = (Domestic) o;
            return this.getName().compareTo(cat1.getName());
        }
        return super.compareTo(o);

    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Domestic)
        {
            Domestic a2 = (Domestic) obj;
            return this.getName().equals(a2.getName());
        }
        else if (obj instanceof Animal ) {

            Animal a3 = (Animal) obj;
            return super.equals(a3);
        }else
            return false;
    }

    @Override
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
