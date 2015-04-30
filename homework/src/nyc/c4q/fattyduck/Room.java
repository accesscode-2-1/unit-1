package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/27/15.
 */
public class Room extends Quit
{
    public void welcome()
    {
        System.out.print("Welcome to the Arena, brave warrior with a " );
    }

    public void death()
    {
        System.out.println("You have died");
    }

    public void victory()
    {
        System.out.println("You have slain the enemy!");
    }

    public void choices()
    {
        System.out.println("Make your decision");
        System.out.println("1. Fight");
        System.out.println("2. Drink Potion");
        System.out.println("3. Run Away!");

    }

    public void gameOver()
    {
        System.out.println("Game Over");
    }

    public void quitGame()
    {
        System.out.println("You have quit the game");
    }
}
