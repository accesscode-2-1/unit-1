package nyc.c4q.sufeiiz;

/**
 * Created by sufeizhao on 5/2/15.
 */
public class Ship {
    private String shipName;
    private int year;

    public Ship(String shipName, int year) {
        this.shipName = shipName;
        this.year = year;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.getShipName() + " built in " + this.getYear();
    }
}
