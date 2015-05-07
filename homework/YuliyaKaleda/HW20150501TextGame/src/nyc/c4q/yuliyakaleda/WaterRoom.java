package nyc.c4q.yuliyakaleda;
/**
 * Created by Yuliya Kaleda on 4/29/15.
 */
public class WaterRoom extends Room {

    Boat boat = new Boat();

    public WaterRoom()
    {
        super("Water", "boat");
    }

    public String revealChallenge()
    {
        return "Room is full of water and you cannot swim. Which weapon do you choose to get to the next room?";
    }

    @Override
    public Weapon fetchWeapon()
    {
        return boat;
    }


}

