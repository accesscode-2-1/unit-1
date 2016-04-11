package nyc.c4q.jgarcia162;
/**
 * Created by Jose on 5/1/15.
 */

//You must create Character, Weapon and Room classes.
public abstract class Character{
    String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(Character character){
        return character.name;
    }
}
