package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Weapon.java
 */

public abstract class Item {
    String name, description, usage, hint;

    public Item(String name, String description, String usage, String hint) {
        this.name = name;
        this.description = description;
        this.usage = usage;
        this.hint = hint;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getUsage() {
        return this.usage;
    }

    public String getHint() {
        return this.hint;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
