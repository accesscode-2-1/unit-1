import java.util.List;
import java.util.ArrayList;

/**
 * Created by kadeemmaragh on 5/3/15.
 */
public class Shopkeeper extends NPC
{
    private List<Item> shop = new ArrayList<Item>();

    Item potion      = new Item("Potion", 100);
    Item ether       = new Item("Ether", 300);
    Item bronzeSword = new Weapon("Bronze Sword", 500, 10);
    Item oakStaff    = new Weapon("Oak Staff", 600, 12);


    public Shopkeeper(String name)
    {
        super(name);
        createShop();


    }

    public Shopkeeper(String name, List<Item> shop){
        super(name);
        this.shop = shop;

    }

    private void createShop(){
        this.shop.add(potion);
        this.shop.add(ether);
        this.shop.add(bronzeSword);
        this.shop.add(oakStaff);


    }

    public void showShop(){
        for(Item item : shop){
            System.out.println(item.toString());
        }
    }




    @Override
    public void greeting()
    {
        System.out.println("What are you buying? Type 'exit' to leave");
    }

    @Override
    public void farewell()
    {
        System.out.println("Come again!");
    }


}
