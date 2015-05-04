import java.lang.*;


/**
 * Created by kadeemmaragh on 5/3/15.
 */
public class NPC extends Character implements Greeting
{
    public NPC(String name){
        characterName = name;
        healthPoints = 10;

    }
    public NPC(String name, int health){
        characterName = name;
        healthPoints = health;

    }

    @Override
    public String getCharacterName()
    {
        return this.characterName;
    }

    @Override
    public int getHealthPoints()
    {
        return this.healthPoints;
    }


    @Override
    public void greeting()
    {
        System.out.println("Hello there adventurer");
    }

    @Override
    public void farewell()
    {
        System.out.println("Goodbye adventurer");
    }
}
