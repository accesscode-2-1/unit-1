package nyc.c4q.sufeiiz.AdventureGame;

/**
 * Created by sufeizhao on 5/1/15.
 */
public class Weapon {

    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void useScrewDriver(boolean movedChair) {
        if (movedChair)
            System.out.println("You climb on the chair and use the screwdriver on the jammed window.\n" +
                    "It opens! You wiggle yourself onto the dewy grass.");
        else
            System.out.println("You try to use the screwdriver on the window, but it's too high!\n" +
                    "We need something to stand on.");
    }

    public void useBat(boolean movedChair) {
        if (movedChair)
            System.out.println("You swing the bat to break the glass on the window.\n" +
                "It worked! You climb on the chair and wiggle yourself onto the dewy grass.");
        else
            System.out.println("You swing the bat to break the glass on the window.\n" +
                "It worked! But the window is too high up, we need something to stand on.");
    }
}
