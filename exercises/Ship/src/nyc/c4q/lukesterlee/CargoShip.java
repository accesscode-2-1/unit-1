package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 5/2/15.
 */
public class CargoShip extends Ship {
    int tonnage;

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
