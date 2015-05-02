package nyc.c4q.abassawo;

import java.util.ArrayList;

/**
 * Created by c4q-Abass on 5/1/15.
 */
public class Room {
    private String name;

    public String getRoom() {
        return this.name;
    }



    public void setRoom(Room x) {
    }

    //private ArrayList<Object>roomObjects = new ArrayList<Object>();


    public Room(String roomName){
        this.name = roomName;
    }

    public Room(){
    }

    public void lookAround(){
        if (this.name == "dungeon"){
            System.out.println("You carefully tiptoe across the room. " +
                    "YYou follow the noise and follow the cat to another room that smells like cat food. You can't get the bag off your head, but can hear the cat still purring and pacing. Follow the cat");
        }

    }



}

