package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Screwdriver.java
 */

public class Screwdriver extends Item implements Tool {

    public Screwdriver(String name, String description, String usage, String hint) {
        super(name, description, usage, hint);
    }

    @Override
    public void use(Item item) {

    }
}
