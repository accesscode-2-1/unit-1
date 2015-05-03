package nyc.c4q.m47bell;
import nyc.c4q.m47bell.Ship;

/**
 * Created by c4q-marbella on 5/2/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class CruiseShip extends Ship
{
    private int maxPassengers;

    public CruiseShip(String shipName, String builtYear, int maxPassengers)
    {
        super(shipName, builtYear);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers()
    {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers)
    {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString()
    {

        return "Cruise ship name: "+ getShipName() +
            ", built year: " + getBuiltYear() +
                ", maximum number of passengers: " + maxPassengers;
    }
}
