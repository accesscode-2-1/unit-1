import java.util.Scanner;

/**
 * Created by c4q-madelyntavarez on 5/1/15.
 */
public class textBasedGame
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Hello Welcome To Interface World. Please choose a character(Wizard or Sage)");
        while(true)
        {
            String character = scanner.next();
            if(character.equalsIgnoreCase("Wizard"))
            {
                Staff staff=new Staff();
                Wizard newPlayer = new Wizard("Tim", staff);
                System.out.println("What would you like to name your Wizard?");
                String name = scanner.next();
                newPlayer.setName(name);
                break;

            }
            else if(character.equalsIgnoreCase("Sage"))
            {
                Knife knife=new Knife();
                Sage sage = new Sage("John", knife);
                System.out.println("What would you like to name your Sage?");
                String name = scanner.next();
                sage.setName(name);
                break;
            }
            else
            {
                System.out.println("That is not a valid character.Please enter another character");
                String newChoice = scanner.next();
                continue;

            }

        }

        System.out.println("Which room would you like to enter first?(Kitchen or Bedroom");
        String room=scanner.next();
        if(room.equalsIgnoreCase("Kitchen")){
            Kitchen kitchen=new Kitchen();
            kitchen.setColorOfWalls("red");
            kitchen.setNumOfWalls(8);
            System.out.println("You are now in the "+room+". The walls are closing in, they are red. If you give up your weapon you can be saved! Will you give up your weapon?");
            String giveUpWeapon=scanner.next();
            if(giveUpWeapon.equalsIgnoreCase("no")){
                System.out.println("Game over, the walls have crushed you to death");
            }
            if(giveUpWeapon.equalsIgnoreCase("yes")){
                System.out.println("You can now escape the room. But there are zombies beyond these walls.Pick a color to reveal your fortune");
                String color=scanner.next();
                if(color.equalsIgnoreCase("red"))
                {
                    System.out.println("You guessed the color of the walls correctly. You win!");
                }
                else
                {
                    System.out.println("Wrong choice, you don't have time to guess again. The Zombies are going to eat you! Game over!");
                }
            }
        }
        else if(room.equalsIgnoreCase("Bedroom")){
            Bedroom bedroom=new Bedroom();
            bedroom.setColorOfWalls("blue");
            bedroom.setNumOfWalls(4);
            System.out.println("You are now in the "+room+" this room only has four walls and two doors. Pick a door to reveal your fortune.(1 or 2)");
            int door=scanner.nextInt();
            if(door==1){
                System.out.println("You have escaped without a scratch. You win!");
            }
            if(door==2){
                System.out.println("You are now in the Bedroom! The walls are closing in, they are red. If you give up your weapon you can be saved! Will you give up your weapon?");
                String giveUpWeapon=scanner.next();
                if(giveUpWeapon.equalsIgnoreCase("no")){
                    System.out.println("Game over, the walls have crushed you to death");
                }
                if(giveUpWeapon.equalsIgnoreCase("yes")){
                    System.out.println("You can now escape the room. But there are zombies beyond these walls.Pick a color to reveal your fortune");
                    String color=scanner.next();
                    if(color.equalsIgnoreCase("red"))
                    {
                        System.out.println("You guessed the color of the walls correctly. You win!");
                    }
                    else
                    {
                        System.out.println("Wrong choice, you don't have time to guess again. The Zombies are going to eat you! Game over!");
                    }
                }
            }
            else{
                System.out.println("Sorry, that room does not exist. Game Over");
            }
        }
        else{
            System.out.println("You don't know how to follow instructions. Unfortunately this game has come to an end");
        }

    }
}