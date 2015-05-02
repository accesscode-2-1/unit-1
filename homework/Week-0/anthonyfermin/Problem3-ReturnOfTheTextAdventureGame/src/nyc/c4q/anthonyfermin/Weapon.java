package nyc.c4q.anthonyfermin;
/**
 * Created by c4q-anthonyf on 5/1/15.
 */
public class Weapon
{
    String name;
    int damage;
    int speed;

    public Weapon(){
        this("Fists", 1, 2);
    }

    public Weapon(String name, int damage){
        this(name, damage, 1);
    }

    public Weapon(String name, int damage, int speed){
        this.name = name;
        this.damage = damage;
        this.speed = speed;
    }

    public int attack(){
        return damage;
    }

    public int getSpeed(){
        return speed;
    }

    public String getName(){
        return name;
    }
}
