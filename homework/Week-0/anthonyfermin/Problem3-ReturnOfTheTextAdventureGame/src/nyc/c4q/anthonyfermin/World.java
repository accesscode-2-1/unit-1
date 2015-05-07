package nyc.c4q.anthonyfermin;
import java.util.ArrayList;

/**
 * Created by c4q-anthonyf on 5/1/15.
 */
public class World
{
    ArrayList<Room> world;

    public World(){
        world = new ArrayList<Room>();
    }

    public void addRoom(Room room){
        world.add(room);
    }
}
