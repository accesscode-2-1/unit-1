package nyc.c4q.poojawins;

/**
 * Created by pooja on 5/5/15.
 */
import java.util.ArrayList;

public class PC extends Character {
    private int health;
    ArrayList<Item> inventory;

    public PC(String name, int health) {
        super(name);
        this.health = health;
        this.inventory = new ArrayList<Item>();
    }

    public int getHealth() {
        return health;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    @Override
    public String toString() {
        return "Player is named " + name;
    }

}
