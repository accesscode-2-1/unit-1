package nyc.c4q.sufeiiz.AdventureGame;

import java.lang.*;

/**
 * Created by sufeizhao on 5/9/15.
 */
public class Room {
    private Bed bed = new Bed();
    private Table table = new Table();
    private Chair chair = new Chair();
    private Character player;

    public Room(Character player) {
        this.player = player;
    }

    public Bed getBed() {
        return this.bed;
    }

    public Chair getChair() {
        return this.chair;
    }

    public Table getTable() {
        return this.table;
    }
}
