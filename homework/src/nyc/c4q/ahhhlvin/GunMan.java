package nyc.c4q.ahhhlvin;
import java.util.ArrayList;

/**
 * Created by alvin2 on 4/30/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class GunMan extends Character
{

    public Weapon gun;

    public GunMan(int charLevel, int HP, String name, String specialty) {
        super(charLevel, HP, name, specialty);
    }


    @Override
    public String attack()
    {
        return "Uses GUN and shoots!";
    }

    @Override
    public int getLevel()
    {
        return getcharLevel();
    }
}
