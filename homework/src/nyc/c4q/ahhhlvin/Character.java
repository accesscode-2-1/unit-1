package nyc.c4q.ahhhlvin;
/**
 * Created by alvin2 on 4/30/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public abstract class Character implements Attributes
{

    private int charLevel;
    private int HP;
    private String name;
    private String specialty;

    public Character()
    {
        this.charLevel = 0;
    }

    public Character(int charLevel, int HP, String name, String specialty)
    {
        this.charLevel = charLevel;
        this.HP = HP;
        this.name = name;
        this.specialty = specialty;

    }

    public int getcharLevel()
    {
        return charLevel;
    }

    public void setcharLevel(int charLevel)
    {
        this.charLevel = charLevel;
    }

    public int getHP()
    {
        return HP;
    }

    public void setHP(int HP)
    {
        this.HP = HP;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSpecialty()
    {
        return specialty;
    }

    public void setSpecialty(String specialty)
    {
        this.specialty = specialty;
    }

    public String attack(){
        return "Uses HANDS and punches!";
    }



}
