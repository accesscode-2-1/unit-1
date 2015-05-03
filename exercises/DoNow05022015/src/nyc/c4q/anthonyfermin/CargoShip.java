package nyc.c4q.anthonyfermin;
/**
 * Created by c4q-anthonyf on 5/2/15.
 */
public class CargoShip extends Ship
{
    int cargoCapacity;

    public CargoShip(String name, String year, int cargoCapacity)
    {
        super(name, year);
        this.cargoCapacity = cargoCapacity;
    }
    //accessor
    public int getCargoCapacity(){
        return cargoCapacity;
    }
    //mutator
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    @Override
    public String toString(){
        return "Name: " + getName() + " Cargo Capacity: " + cargoCapacity + "tons";

    }
}
