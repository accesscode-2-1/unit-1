package nyc.c4q.sufeiiz.AdventureGame;

/**
 * Created by sufeizhao on 5/9/15.
 */
public class Weapon {
    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void useScrewDriver(boolean movedChair) {
        if(movedChair) {
            System.out.println("You climb on the chair and use the screwdriver on the jammed window.\nIt opens! You wiggle yourself onto the dewy grass.");
        } else {
            System.out.println("You try to use the screwdriver on the window, but it\'s too high!\nWe need something to stand on.");
        }

    }

    public void useBat(boolean movedChair) {
        if(movedChair) {
            System.out.println("You swing the bat to break the glass on the window.\nIt worked! You climb on the chair and wiggle yourself onto the dewy grass.");
        } else {
            System.out.println("You swing the bat to break the glass on the window.\nIt worked! But the window is too high up, we need something to stand on.");
        }

    }
}
