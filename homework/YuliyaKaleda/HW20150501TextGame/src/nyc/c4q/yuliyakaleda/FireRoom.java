package nyc.c4q.yuliyakaleda;
/**
 * Created by Yuliya Kaleda on 4/29/15.
 */
public class FireRoom extends Room
{
    BucketOfWater bucketOfWater = new BucketOfWater();

    public FireRoom()
    {
        super("Fire", "water");
    }

    public String revealChallenge()
    {
        return "Room is on fire. Which weapon do you choose to get to the next room?";
    }

    public BucketOfWater fetchWeapon() {
        return bucketOfWater;
    }

}
