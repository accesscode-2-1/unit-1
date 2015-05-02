package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Created by Luke Lee on 5/2/15.
 *
 * Design a CruiseShip class that extends the Ship class. The CruiseShip class should have the following members :
 * A field for the maximum number of passengers (an int).
 * A constructor and appropriate accessors and mutators.
 * A toString method that overrides the toString method in the base class.
 * The CruiseShip class's toString method should display only the ship's name and the maximum number of passengers.
 */
public class CruiseShip extends Ship {
    private int maxPassenger;

    public CruiseShip() {
        super();
    }

    public CruiseShip(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public CruiseShip(String name, String year, int maxPassenger) {
        super(name, year);
        this.maxPassenger = maxPassenger;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getMaxPassenger();
    }
}
