package nyc.c4q.alizinha;
/**
 * Created by c4q-Allison on 5/6/15.
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

    // Get room name
    public String getRoomName()
    {
        return roomName;
    }

    // Set room name
    public void setRoomName(String name)
    {
        roomName = name;
    }

    // Print desc
}
