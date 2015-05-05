package nyc.c4q.jaellysbales;
/**
 * Access Code 2.1
 * Created by Jaellys Bales on 5/4/15.
 * Project: textadv
 */
public class Room
{
    // Every room has...
    String roomName;
    String roomDescription;
    // ArrayList<Item> items?

    public Room(String roomName, String roomDescription)
    {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
    }

    public String getRoomName()
    {
        return roomName;
    }

    public void setRoomName(String name)
    {
        roomName = name;
    }

    public String getRoomDescription()
    {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription)
    {
        this.roomDescription = roomDescription;
    }
}
