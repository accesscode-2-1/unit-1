package nyc.c4q.sufeiiz.AdventureGame;

/**
 * Created by sufeizhao on 5/9/15.
 */
public class Chair extends Furniture implements Movable {
    public Chair() {
    }

    public void search() {
        System.out.println("You look under the chair and find a piece of old gum. Ew.");
    }

    public void push() {
        System.out.println("You pushed the chair to the window, attempting to climb out. But the window is jammed.");
    }
}
