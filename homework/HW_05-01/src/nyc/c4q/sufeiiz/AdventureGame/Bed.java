package nyc.c4q.sufeiiz.AdventureGame;

/**
 * Created by sufeizhao on 5/2/15.
 */
public class Bed extends Furniture implements Movable {
    @Override
    public void search() {
        System.out.println("You look around the bed and find a bat. You pick up the bat.");
    }

    @Override
    public void push() {
        System.out.println("The bed is too heavy to push");
    }
}
