package nyc.c4q.jaellysbales;
/**
 * Access Code 2.1
 * Created by Jaellys Bales on 5/4/15.
 * Project: textadv
 */
public class Main
{
    public static void main(String[] args)
    {
        Room basement = new Room("basement", "It's dark and damp.");
        Weapon knife = new Weapon("blade", 20);
        Weapon bat = new Weapon("baseball bat", 10);
        Player player = new Player("Bob", 100, bat, basement);
        Enemy enemy = new Enemy("Joe", 100, knife, basement);

        // If both characters are in the same room, start fight.
        if(player.getRoom().equals(enemy.getRoom()))
        {
            System.out.println(player.getCharName() + " and " + enemy
                    .getCharName() + " are about to rumble in this " + player.getRoom()
                                                                             .getRoomName() + ".");
            System.out.println(player.getRoom().getRoomDescription() + "\n");

            // Fight until one dies.
            int round = 1;
            while(player.getHealthPoints() > 0 || enemy.getHealthPoints() > 0)
            {
                System.out.println("ROUND " + round);

                // Enemy turn. Print attacker and defender, weapon and damage sustained, defender's new HP.
                player.calcDamage(enemy.getWeapon().damagePoints);

                System.out.println(enemy.getCharName() + " attacks " + player
                        .getCharName() + " with his " + enemy.getWeapon().getWeaponName() + ".");

                System.out.println(player.getCharName() + " takes " + enemy.getWeapon()
                                                                           .getDamagePoints() + " damage.");

                System.out.println(
                        player.getCharName() + "'s health points: " + player.getHealthPoints());

                // If character has 0 HP, he's dead. Break.
                if(player.getHealthPoints() == 0)
                {
                    System.out.println(
                            player.getCharName() + " has died. " + enemy.getCharName() + " wins!");
                    break;
                }

                // Player turn, same process.
                enemy.calcDamage(player.getWeapon().damagePoints);

                System.out.println(player.getCharName() + " attacks " + enemy
                        .getCharName() + " with his " + player.getWeapon().getWeaponName() + ".");

                System.out.println(enemy.getCharName() + " takes " + player.getWeapon()
                                                                           .getDamagePoints() + " damage.");

                System.out.println(
                        enemy.getCharName() + "'s health points: " + enemy.getHealthPoints());

                round++;

                if(enemy.getHealthPoints() == 0)
                {
                    System.out.println(
                            enemy.getCharName() + " has died. " + player.getCharName() + " wins!");
                    break;
                }
            }
        }
    }
}
