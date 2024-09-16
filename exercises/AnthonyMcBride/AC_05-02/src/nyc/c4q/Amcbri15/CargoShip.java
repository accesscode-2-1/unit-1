package nyc.c4q.Amcbri15;
/**
 * Created by c4q-anthony-mcbride on 5/2/15.
 */
public class CargoShip extends Ship
{

    private int tonCapacity;

    public CargoShip(){
        super("noname", 0);
        this.tonCapacity = 0;
    }
    public CargoShip(int tonCapacity){
        super("noname", 0);
        this.tonCapacity = tonCapacity;
    }
    public CargoShip(String shipName, int yearEst, int tonCapacity)
    {
        super(shipName, yearEst);
        this.tonCapacity = tonCapacity;
    }
    public int getTonCapacity(){
        return this.tonCapacity;
    }
    public void setTonCapacity(int tonCapacity){
        this.tonCapacity = tonCapacity;
    }
    @Override
    public String toString(){
        return "I'm a " + getClass().getSimpleName() + ".\nShip Name: " + getShipName() + "\n" + "Cargo Capacity: " + getTonCapacity() + "\n";
    }
}
