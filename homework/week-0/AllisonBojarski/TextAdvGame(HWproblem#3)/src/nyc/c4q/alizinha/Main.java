package nyc.c4q.alizinha;

public class Main
{

    public static void main(String[] args)
    {
        Room basement = new Room("Basement", "You can barely see your enemy in the shadows.");
        Weapon knife = new Weapon("scimitar", 10);

        Player player = new Player("Stan", 100, knife, basement);
        Enemy enemy = new Enemy("Karl", 100, knife, basement);

        if(player.getRoom().equals(enemy.getRoom()))
        {
            while(player.getHealthPoints() > 0)
            {
                player.calcDamage(enemy.getWeapon().damagePoints);
                System.out.println("Player health points: " + player.getHealthPoints());

                enemy.calcDamage(player.getWeapon().damagePoints);
                System.out.println("Enemy health points: " + enemy.getHealthPoints());
            }
        }
    }
}
