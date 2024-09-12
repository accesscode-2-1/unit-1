package nyc.c4q.yuliyakaleda;

/**
 * Created by Yuliya Kaleda on 4/28/15.
 */
public abstract class Room
{
    String challenge;
    String requiredWeapon;

    public Room(String challenge, String requiredWeapon) {
        this.challenge = challenge;
        this.requiredWeapon = requiredWeapon;
    }

    public abstract String revealChallenge();

    public String getRequiredWeapon() {
        return requiredWeapon;
    }

    public abstract Weapon fetchWeapon();
}
