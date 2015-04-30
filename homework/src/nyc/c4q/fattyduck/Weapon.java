package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/27/15.
 */
public class Weapon
{
    public String name(int num){
        String w = "";
        if(num <1){
            w="Spear";
        }else {
            w= "Sword";
        }
        return w;
    }

}

