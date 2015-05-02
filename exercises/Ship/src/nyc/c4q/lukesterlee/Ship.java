package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Created by Luke Lee on 5/2/15.
 *
 * Design a Ship class that the following members :
 * A field for the name of the ship (a string).
 * A field for the year that the ship was built (a string).
 * A constructor and appropriate accessors and mutators.
 * A toString method that displays the ship's name and the year it was built.
 */
public class Ship {
    private String name;
    private String year;

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
