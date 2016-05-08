package nyc.c4q.lighterletter;
/**
 * Created by c4q-john on 5/2/15.
 */
public class CruiseShip extends  Ship
{
    int maxPass;

    public CruiseShip(int maxPass)
    {
        super();
        this.maxPass = maxPass;
    }

    public int getMaxPass()
    {
        return maxPass;
    }

    public void setMaxPass(int maxPass)
    {
        this.maxPass = maxPass;
    }

    @Override
    public String toString()
    {
        return "\nShip: " + getClass().getSimpleName()+ "\n"+
                "Ship name: " + super.getShipName() + "\n"+
                "Passengers:  " + getMaxPass();
    }
}
