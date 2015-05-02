package nyc.c4q.abassawo;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by c4q-Abass on 5/1/15.
 */
public class GameCharacter extends Room {
    //    private Room office = new Room();
//    private Room dungeon = new Room();




    private String name;
    private float health;
    private float damage;
    private int goldCoins;
    private String room;



    public GameCharacter() {
    }

    public ArrayList<Weapon> getInventory() {
        if(this.inventory.size() == 0){
            System.out.println("Sorry, there's nothing in your inventory");
        }
        return inventory;
    }

    public ArrayList<Object> checkPockets(){
        ArrayList<Object>Pockets = new ArrayList<Object>();
        return Pockets;
    }

    public void addToPockets(Object x){
        ArrayList<Object>Pockets = new ArrayList<Object>();
        Pockets.add(x);
    }





    public void addTotInventory(Weapon x) {
        this.inventory.add(x);
    }

    private ArrayList<Weapon> inventory = new ArrayList<Weapon>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public void setRoom() {
        this.room = room;
    }
    //
//    public Room getRoom() {
//        return this.room;
//    }
//
    public void moveAround(){

    }

    public void speak(String x){
        System.out.println( x);
    }


}
