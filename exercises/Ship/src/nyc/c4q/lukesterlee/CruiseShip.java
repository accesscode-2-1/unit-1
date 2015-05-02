package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 5/2/15.
 */
public class CruiseShip extends Ship {
    int maxPassenger;

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
