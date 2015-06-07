package nyc.c4q.ahhhlvin;
import java.util.ArrayList;

/**
 * Created by alvin2 on 4/30/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Weapon implements Attributes
{

    int weaponLevel;

    public Weapon() {
        this.weaponLevel = 0;
    }

    public String assignLevel(int levelNum) {
        this.weaponLevel = levelNum;
        return "Your weapon has leveled up! Current weapon is at level: " + levelNum;
    }

    public String getWeapon() {
        return "Current weapon of choice -- HANDS";
    }


    @Override
    public int getLevel()
    {
        return this.weaponLevel;
    }
}
