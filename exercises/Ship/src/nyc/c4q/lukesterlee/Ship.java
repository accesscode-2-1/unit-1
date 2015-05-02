package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 5/2/15.
 */
public class Ship {
    String name;
    String year;

    public Ship() {

    }

    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getYear();
    }
}
