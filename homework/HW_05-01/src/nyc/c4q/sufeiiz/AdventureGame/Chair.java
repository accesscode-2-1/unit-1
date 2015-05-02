package nyc.c4q.sufeiiz.AdventureGame;

/**
 * Created by sufeizhao on 5/2/15.
 */
public class Chair extends Furniture implements Movable{
    @Override
    public void search() {
        System.out.println("You look under the chair and find a piece of old gum. Ew.");
    }

    @Override
    public void push() {
        System.out.println("You pushed the chair to the window, attempting to climb out. But the window is jammed.");
    }
}
