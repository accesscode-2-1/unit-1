package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Created by Luke Lee on 5/2/15.
 *
 * Design a CargoShip class that extends the Ship class. The CargoShip class should have the following members :
 * A field for the cargo capacity in tonnage (an int).
 * A constructor and appropriate accessors and mutators.
 * A toString method that overrides the toString method in the base class.
 * The CargoShip class's toString method should display only the ship's name and the ship's cargo capacity.
 */
public class CargoShip extends Ship {
    private int tonnage;

    public CargoShip() {
        super();
    }

    public CargoShip(int tonnage) {
        this.tonnage = tonnage;
    }

    public CargoShip(String name, String year, int tonnage) {
        super(name, year);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getTonnage();
    }
}
