package nyc.c4q.sufeiiz.AdventureGame;

/**
 * Created by sufeizhao on 5/9/15.
 */
public class Table extends Furniture implements Movable {
    public Table() {
    }

    public void search() {
        System.out.println("You look in the table drawers and find a screwdriver. You pick up the screwdriver");
    }

    public void push() {
        System.out.println("You push the table to the door, but realize that\'s not productive. So you move it back.");
    }
}
