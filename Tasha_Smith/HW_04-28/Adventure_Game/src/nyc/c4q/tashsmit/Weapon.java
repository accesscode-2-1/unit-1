package nyc.c4q.tashsmit;
/**
 * Created by c4q-tashasmith on 5/4/15.
 */
public interface Weapon
{
    public void fire();

    public void reload(int ammo);

    public boolean hasAmmo();
}
