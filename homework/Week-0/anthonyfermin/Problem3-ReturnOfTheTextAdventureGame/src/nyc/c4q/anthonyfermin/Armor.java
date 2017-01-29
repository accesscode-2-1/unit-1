package nyc.c4q.anthonyfermin;
/**
 * Created by c4q-anthonyf on 5/1/15.
 */
public class Armor extends Item
{
    int armorPoints;

    public Armor(){
        armorPoints = ((int) ((Math.random() * (40 - 20)) + 20));
    }

    public int getArmorPoints(){
        return armorPoints;
    }
}
