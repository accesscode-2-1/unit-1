package nyc.c4q.anthonyfermin;
import java.util.ArrayList;

/**
 * Created by c4q-anthonyf on 5/1/15.
 */
public class Chest implements Renewable
{

    ArrayList<Item> items;
    boolean itemsRemoved;

    public Chest(){
    }

    public void addItem(Item item){
        items.add(item);
        itemsRemoved = false;
    }

    public int itemAmount(){
        return items.size();
    }

    public ArrayList<Item> getItems(){
            return items;
    }



    @Override
    public void renew()
    {

    }
}
