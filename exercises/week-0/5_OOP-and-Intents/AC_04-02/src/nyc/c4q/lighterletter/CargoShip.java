package nyc.c4q.lighterletter;
/**
 * Created by c4q-john on 5/2/15.
 */
public class CargoShip extends Ship
{
    int TonCap;

    public CargoShip(int tonCap)
    {
        TonCap = tonCap;
    }

    public int getTonCap()
    {
        return TonCap;
    }

    public void setTonCap(int tonCap)
    {
        TonCap = tonCap;
    }

    @Override
    public String toString()
    {
        return "\nShip: " + getClass().getSimpleName()+ "\n"+
                "Ship name: "+ super.getShipName()+ "\n"+
                "TonCap: " + getTonCap();
    }
}
