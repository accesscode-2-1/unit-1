package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Character.java
 *
 * Create your own text adventure game! This is a similar concept to one of your earlier assignments but with a few requirements:
 * You must create Character, Weapon and Room classes.
 * Every character must be an instance of a Character or an instance of a sub-class of Character.
 * Every weapon must be an instance of a Weapon or an instance of a sub-class of Weapon.
 * Every room must be an instance of a Room or of a sub-class of Room.
 * You must create an abstract class and use it at least twice.
 * You must create an interface and use it at least twice.
 * You may create other classes including container classes (e.g. the World class may be a collection of Rooms).
 * This assignment is the more object-oriented version of the previous assignment. Be very careful in the way you design your code.
 * Here's an example: You can make Character an abstract class, and create a Non-Player Character class and a Player Character class
 * inheriting from it, and then make all characters instances of either NPCs or PCs. Although it may take a little
 * more thinking, these kinds of decisions can prevent copy-pasting code and help you debug.
 *
 */

public abstract class Character {

    private String name;
    private int health;
    private boolean alive;

    public Character(String name) {
        this.name = name;
        alive = true;
        health = 100;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHealth(int health) {
        this.health += health;
    }

    public int getHealth() {
        return this.health;
    }

    public void kill() {
        this.alive = false;
    }

    public void revive() {
        this.alive = true;
    }

    public boolean isAlive() {
        return this.alive;
    }

    @Override
    public String toString() {
        return this.name;
    }

}