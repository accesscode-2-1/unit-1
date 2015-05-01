package nyc.c4q.ramonaharrison;

import java.util.ArrayList;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Room.java
 */

public abstract class Room {

    String name;
    String description;
    String directions;
    ArrayList<Item> items;
    ArrayList<Room> neighbors;

    public Room(String name, String description, String directions, ArrayList<Item> items, ArrayList<Room> neighbors) {
        this.name = name;
        this.description = description;
        this.directions = directions;
        this.items = items;
        this.neighbors = neighbors;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDirections() {
        return this.directions;
    }

    public String listItems() {
        String items = "";
        for (Item item : this.items) {
            items += item.getName() + " | ";
        }
        return items;
    }

    public String listNeighbors() {
        String neighbors = "";
        for (Room room : this.neighbors) {
            neighbors += room.getName() + " | ";
        }
        return neighbors;
    }

    @Override
    public String toString() {
        return this.name;
    }


}
