/**
 * Created by kadeemmaragh on 5/3/15.
 */
public class Item
{
    private String itemName;
    private int itemPrice;

    public Item(String name, int price){

        itemName = name;
        itemPrice = price;
    }

    public void setItemPrice(int num){
        itemPrice = num;
    }

    public String getItemName(){
        return this.itemName;
    }

    public int getItemPrice(){
        return this.itemPrice;
    }

    @Override
    public String toString()
    {
        return "Item: " + itemName + ", Price: " + itemPrice;
    }
}
