package nyc.c4q.sufeiiz.AdventureGame;

/**
 * Created by sufeizhao on 5/9/15.
 */
public class Bed extends Furniture implements Movable {
    public Bed() {
    }

    public void search() {
        System.out.println("You look around the bed and find a bat. You pick up the bat.");
    }

    public void push() {
        System.out.println("The bed is too heavy to push");
    }
}
