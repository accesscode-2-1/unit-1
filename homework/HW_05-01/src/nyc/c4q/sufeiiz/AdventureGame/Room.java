package nyc.c4q.sufeiiz.AdventureGame;

/**
 * Created by sufeizhao on 5/1/15.
 */
public class Room {

    private Bed bed;
    private Table table;
    private Chair chair;
    private Character player;

    public Room(Character player) {
        this.bed = new Bed();
        this.table = new Table();
        this.chair = new Chair();
        this.player = player;
    }

    public Bed getBed() {
        return bed;
    }

    public Chair getChair() {
        return chair;
    }

    public Table getTable() {
        return table;
    }
}
