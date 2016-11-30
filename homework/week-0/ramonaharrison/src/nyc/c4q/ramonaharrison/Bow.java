package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Bow.java
 */

public class Bow extends Item implements Weapon {

    private int arrows;
    private int damage;

    public Bow(String name, String description, String usage, String hint) {
        super(name, description, usage, hint);
        arrows = 0;
        damage = 25;
    }

    @Override
    public void load() {
        arrows += 5;
    }

    @Override
    public void use(Character character) {
        arrows -= 1;
        character.setHealth(-this.getDamage());
    }

    public int getDamage() {
        return damage;
    }
}
