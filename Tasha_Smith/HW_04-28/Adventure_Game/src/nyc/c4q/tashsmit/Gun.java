package nyc.c4q.tashsmit;
/**
 * Created by c4q-tashasmith on 5/4/15.
 */
public class Gun implements Weapon
{
    int ammo;
    boolean hasAmmo;

    public Gun (int ammo) {
        this.ammo = ammo;
    }

    @Override
    public void fire()
    {
        System.out.println("bam bam!");
    }

    @Override
    public void reload(int ammo)
    {
        this.ammo += ammo;
    }

    @Override
    public boolean hasAmmo()
    {
        return hasAmmo;
    }
}
