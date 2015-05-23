package nyc.c4q.poojawins;

/**
 * Created by pooja on 5/5/15.
 */
public class NPC extends Character {
    private String message;
    private String location;

    public NPC(String name, String message, String location) {
        super(name);
        this.message = message;
        this.location = location;
    }

    public String getMessage() {
        return message;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "This NPC is called " + name;
    }
}
