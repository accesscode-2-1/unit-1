package nyc.c4q.personabe1984.Characters;
import java.util.ArrayList;

import nyc.c4q.personabe1984.InventoryItem;
import nyc.c4q.personabe1984.weapon.Weapon;

/**
 * Created by Hans on 5/5/15.
 */
public class Character {
    private String                   handleName;
    private int                      lives;
    private int                      level;
    private Weapon                   weapon;
    private ArrayList<InventoryItem> inventoryItems;

    public Character()
    {
        this.handleName = "Unknown player";
        this.lives = 5;
        this.level = 1;
        setDefaultWeapon();
        inventoryItems = new ArrayList<InventoryItem>();
    }

    public Character(String handleName){
        this();
        setHandleName(handleName);
        setDefaultWeapon();
    }


    private void setDefaultWeapon(){
        this.weapon = new Weapon("Sword", 10, 20);
    }

    public String getHandleName(){
        return handleName;
    }

    public void setHandleName(String handleName){
        this.handleName = handleName;
    }

    public Weapon getWeapon()
    {
        return weapon;
    }

    public void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }

    public ArrayList<InventoryItem> getInventoryItems()
    {
        return inventoryItems;
    }

    public void addInventoryItem(InventoryItem inventoryItem){
        inventoryItems.add(inventoryItem);
    }

    public boolean dropInventoryItem(InventoryItem inventoryItem){
        if(this.inventoryItems.contains(inventoryItem)){
            inventoryItems.remove(inventoryItem);
            return true;
        }
        return false;

    }
}
