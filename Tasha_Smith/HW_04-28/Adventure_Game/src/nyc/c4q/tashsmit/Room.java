package nyc.c4q.tashsmit;
/**
 * Created by c4q-tashasmith on 5/4/15.
 */
public abstract class Room
{
    int ammo; //a room should have ammo so character can choose to pick it up

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public abstract void draw(); //to draw what the room looks like for user

}
