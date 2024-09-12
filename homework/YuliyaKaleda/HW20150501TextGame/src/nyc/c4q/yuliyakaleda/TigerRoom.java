package nyc.c4q.yuliyakaleda;
/**
 * Created by Yuliya Kaleda on 4/29/15.
 */
public class TigerRoom extends Room
{
    Gun gun = new Gun();

    public TigerRoom()
    {
        super("Tiger", "gun");
    }

    public String revealChallenge() {
            return "There is a tiger in the room. Which weapon do you choose to get to the next room?";
        }

        @Override
        public Weapon fetchWeapon()
        {
            return gun;
        }
    }
