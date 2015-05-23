package nyc.c4q.poojawins;

/**
 * Created by pooja on 5/5/15.
 */
public class Item {
    private String name;
    private String description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
