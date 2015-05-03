package nyc.c4q.m47bell;
import nyc.c4q.m47bell.Ship;

/**
 * Created by c4q-marbella on 5/2/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class CargoShip extends Ship
{
   private int cargoCapacity;

    public CargoShip(String shipName, String builtYear, int cargoCapacity)
    {
        super(shipName, builtYear);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity()
    {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity)
    {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString()
    {
        return "Cargo ship name: " + getShipName()+
                ", built year: " + getBuiltYear()+
                ", cargo capacity: " + cargoCapacity;
    }
}
