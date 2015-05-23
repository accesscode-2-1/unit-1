package nyc.c4q.poojawins;

/**
 * Created by pooja on 5/1/15.
 */
public class Weapon extends Item {
    private int damage;

    public Weapon(String name, String description, int damage ) {
        super(name, description);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void use(Weapon weapon) {

    }

}
