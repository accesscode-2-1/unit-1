package nyc.c4q.jaellysbales.animalsort;
/**
 * Access Code 2.1
 * Created by Jaellys Bales on 4/29/15.
 * Project: week-0
 * <p/>
 * ${FILE_NAME}
 * Enter a description.
 */
public class DomesticCat extends Animal implements Domestic
{
    String name;

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

    @Override
    public int compareTo(Animal o)
    {
        if (o instanceof Domestic) {
            Domestic a1 = (Domestic) o;
            return this.getName().compareTo(a1.getName());
        }
        return super.compareTo(o);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Domestic) {
            Domestic a1 = (Domestic) obj;
            return this.getName().equals(a1.getName());
        }
        return super.equals(obj);
    }
}
