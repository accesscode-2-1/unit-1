package nyc.c4q.tashsmit;
/**
 * Created by c4q-tashasmith on 5/4/15.
 */
public class Cannon implements Weapon
{
    int cannonBall;
    boolean hasAmmo;

    public Cannon (int cannonBall) {
        this.cannonBall = cannonBall;
    }

    @Override
    public void fire()
    {
        System.out.println("capult!");
    }

    @Override
    public void reload(int cannonBall)
    {
        this.cannonBall += cannonBall;
    }

    @Override
    public boolean hasAmmo()
    {
        return hasAmmo;
    }
}
