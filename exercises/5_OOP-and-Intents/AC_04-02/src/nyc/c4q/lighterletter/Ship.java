package nyc.c4q.lighterletter;
/**
 * Created by c4q-john on 5/2/15.
 */
public class Ship
{
    private String shipName;
    private String yearBuilt;


    public Ship(String shipName, String yearBuilt)
    {
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }

    public Ship()
    {

    }

    public String getYearBuilt()
    {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt)
    {
        this.yearBuilt = yearBuilt;
    }

    public String getShipName()
    {
        return shipName;
    }

    public void setShipName(String shipName)
    {
        this.shipName = shipName;
    }

    @Override
    public String toString()
    {
        return "Ship: " + getClass().getSimpleName() + "\n"+
                "shipName: " + this.shipName + "\n"+
                "YearBuilt: " + this.yearBuilt;
    }
}
