package nyc.c4q.ahhhlvin;
import java.util.ArrayList;

/**
 * Created by alvin2 on 4/30/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Room
{
    private int    sqFt;
    private String color;
    private String name;
    ArrayList<String> roomItems = new ArrayList<String>();


    public Room()
    {
    }

    public Room(int sqFt, String color, String name)
    {
        this.sqFt = sqFt;
        this.color = color;
        this.name = name;

    }

    public ArrayList<String> getRoomItems() {
        return roomItems;
    }


}
