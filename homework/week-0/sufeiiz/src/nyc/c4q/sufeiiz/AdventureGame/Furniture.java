package nyc.c4q.sufeiiz.AdventureGame;

/**
 * Created by sufeizhao on 5/9/15.
 */
public abstract class Furniture implements Movable {
    public Furniture() {
    }

    public void sitOn() {
        System.out.println("You sit for awhile, but the claustrophobia sets in.\nStop wasting time and try to break out!");
    }
}
