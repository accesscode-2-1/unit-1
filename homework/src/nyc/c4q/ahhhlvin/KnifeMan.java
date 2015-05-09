package nyc.c4q.ahhhlvin;
/**
 * Created by alvin2 on 5/1/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class KnifeMan extends Character
{

    public Weapon knife;


    public KnifeMan(int charLevel, int HP, String name, String specialty) {
        super(charLevel, HP, name, specialty);
    }


    @Override
    public String attack()
    {
        return "Uses KNIFE and stabs!";
    }

    @Override
    public int getLevel()
    {
        return getcharLevel();
    }
}
