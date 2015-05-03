package hw0501;
/**
 * Access Code 2.1
 * Ray Acevedo
 * MyWeapon.java
 */
public class MyWeapon implements Weapon
{
    String name;
    int bullets;

    public MyWeapon (){}
    public MyWeapon (String name, int bullets){}
    @Override
    public void fireWeapon(Weapon weapon)
    {
        System.out.println("Bang!");
    }
}
