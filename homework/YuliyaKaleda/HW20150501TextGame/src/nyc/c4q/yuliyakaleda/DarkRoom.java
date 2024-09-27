package nyc.c4q.yuliyakaleda;
/**
 * Created by Yuliya Kaleda on 4/29/15.
 */
public class DarkRoom extends Room
{
    Candle candle = new Candle();

    public DarkRoom()
    {
        super("Darkness", "candle");
    }

    public String revealChallenge() {
            return "Room is very dark. Which weapon do you choose to get to the next room?";
        }

    @Override
    public Weapon fetchWeapon()
    {
        return candle;
    }


}