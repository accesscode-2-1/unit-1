import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kadeemmaragh on 5/2/15.
 * Things to do:
 * 1.Add user interaction with shop
 * 2.Allow user to exit interaction with NPC and return to the Room options
 * 3.Add other rooms so user can switch between them
 * 4.Add combat for certain NPC's(Majority of work)
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! What is your name adventurer?");
        String playerName = input.nextLine();
        System.out.println("Hello " + playerName + ". Welcome to the wonderful world of shopping.");
        System.out.println();
        Shopkeeper melchior = new Shopkeeper("Melchior");
        NPC taban = new NPC("Taban");
        Room lobby = new Room("Lobby");
        lobby.addNpcs(melchior);
        lobby.addNpcs(taban);
        lobby.showNpcs();

        while(true)
        {
            String choice = chooseNPC(input.next());
            if(choice.equals("taban")){
                taban.greeting();
            }
            else if(choice.equals("melchior")){
                melchior.showShop();
            }
            else{
                System.out.println("That is not an NPC in this room! Try again.");
                continue;
            }

        }
    }


    public static String chooseNPC(String choice)
    {

        if(choice.equalsIgnoreCase("taban"))
        {
            return "taban";
        }
        else if(choice.equalsIgnoreCase("melchior"))
        {
            return "melchior";
        }
        else
        {
            return "no npc picked";
        }
    }

}
