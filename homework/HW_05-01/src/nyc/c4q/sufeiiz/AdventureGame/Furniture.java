package nyc.c4q.sufeiiz.AdventureGame;

/**
 * Created by sufeizhao on 5/2/15.
 */
public abstract class Furniture implements Movable{
    @Override
    public void sitOn() {
        System.out.println("You sit for awhile, but the claustrophobia sets in.\n" +
                "Stop wasting time and try to break out!");
    }
}
