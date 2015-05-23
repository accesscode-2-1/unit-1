package nyc.c4q.poojawins;

/**
 * Created by pooja on 5/1/15.
 */
public class Room {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "This is the " + name;
    }
}
