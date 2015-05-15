import java.util.ArrayList;
import java.util.List;

/**
 * Created by kadeemmaragh on 5/3/15.
 */
public class Room
{
    private String roomName;
    private String roomDescription;
    private List<NPC> npcsInRoom = new ArrayList<NPC>();

    public Room(String name)
    {
        roomName = name;
        roomDescription = "Wouldn't you like to know...";
    }


    public void addNpcs(NPC npc){
        npcsInRoom.add(npc);
    }
    public void removeNpcs(NPC npc){
        if(npcsInRoom.contains(npc))
        {
            npcsInRoom.remove(npc);
        }

    }
    public void showNpcs(){
        System.out.println("These are the NPC's in the room. Who do you wish to speak to? ");
        for(NPC npc:npcsInRoom){
            System.out.println("Name: " + npc.getCharacterName() );
        }
        System.out.println();
    }

    public void setRoomDescription(String description){
        roomDescription = description;
    }



}
