package nyc.c4q.anthonyfermin;
/**
 * Created by c4q-anthonyf on 5/1/15.
 */
public abstract class Character
{
    String name;
    int health;
    int armor;
    Weapon weapon;

    public Character(String name){
        this.name = name;
    }
}
