package nyc.c4q.ahhhlvin;


import java.util.ArrayList;

/**
 * Created by alvin2 on 4/30/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class LivingRoom extends Room
{

    public LivingRoom()
    {
    }

    public LivingRoom(int sqFt, String color, String name)
    {
        super(sqFt, color, name);
        roomItems.add("Chaise");
        roomItems.add("Couch");
        roomItems.add("Coffee Table");
    }

}
