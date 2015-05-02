package nyc.c4q.sufeiiz;

/**
 * Created by sufeizhao on 5/2/15.
 */
public class CargoShip extends Ship{

    private int capacity;

    public CargoShip(String shipName, int year, int capacity) {
        super(shipName, year);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return this.getShipName() + " holds " + this.getCapacity() + " tons";
    }
}
