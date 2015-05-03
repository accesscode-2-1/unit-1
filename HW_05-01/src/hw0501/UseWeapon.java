package hw0501;
/**
 * Access Code 2.1
 * Ray Acevedo
 * UseWeapon.java
 */
public class UseWeapon implements Weapon
{
    @Override
    public void fireWeapon(Weapon weapon)
    {
        System.out.println("Bang!");
    }
}
