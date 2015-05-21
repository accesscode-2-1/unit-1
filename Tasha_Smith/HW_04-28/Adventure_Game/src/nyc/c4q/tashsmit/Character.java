package nyc.c4q.tashsmit;
/**
 * Created by c4q-tashasmith on 5/4/15.
 *
 */
public class Character
{
    String name;
    boolean isDead;
    boolean hasWeapon;
    int health;
    Room room;
    Weapon weapon;

    public Character (String name, Weapon weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    public void setWeapon (Weapon weapon) {
        this.weapon = weapon;
    }

    public boolean isDead () {
        return isDead;
    }

    public void setHealth (int health) {
        this.health = health;
    }

    public int health () {
        return health;
    }

    public void setRoom (Room room) {
        this.room = room;
    }
    public Room inRoom () {
        return room;
    }

    public boolean hasWeapon() {
        return hasWeapon;
    }

    public void takeDamage (int damage) {
        health -= damage;
    }

    public void destroyWeapon(Character character) {
        character.hasWeapon = false;
    }
}
