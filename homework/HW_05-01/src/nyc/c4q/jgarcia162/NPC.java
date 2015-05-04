package nyc.c4q.jgarcia162;

/**
 * Created by Jose on 5/4/15.
 */
public class NPC extends Character {
    @Override
    public void setName(String name) {
        super.setName(name);
        this.name = name;
    }

    @Override
    public String getName(Character character) {
        super.getName(character);
        return character.name;
    }
}
