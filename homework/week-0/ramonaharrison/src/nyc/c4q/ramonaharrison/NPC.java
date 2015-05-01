package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * NPC.java
 */

public class NPC extends Character {

    String greeting;
    String hint;

    public NPC(String name, String greeting, String hint) {
        super(name);
        this.greeting = greeting;
        this.hint = hint;
    }

    public String greet() {
        return this.greeting;
    }

    public String getHint() {
        return this.hint;
    }

}
