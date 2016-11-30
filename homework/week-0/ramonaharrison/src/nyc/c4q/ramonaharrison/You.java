package nyc.c4q.ramonaharrison;

import java.util.ArrayList;

/**
 * Access Code 2.1
 * Ramona Harrison
 * You.java
 */

public class You extends Character {

    ArrayList<Item> inventory;

    public You(String name) {
        super(name);
        this.inventory = new ArrayList<Item>();
    }

    public void use(Item item) {

    }

    public void pickUp(Item item) {
        this.inventory.add(item);
    }

    public void putDown(Item item) {
        this.inventory.remove(item);
    }

    public String lookAt(Item item) {
        return item.getDescription();
    }

    public String lookAt(Room room) {
        return room.getDescription();
    }

}
