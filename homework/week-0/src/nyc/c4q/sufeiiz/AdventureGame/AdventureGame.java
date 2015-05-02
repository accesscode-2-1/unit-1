package nyc.c4q.sufeiiz.AdventureGame;

import java.util.Scanner;

/**
 * Created by sufeizhao on 4/27/15.
 * Problem 3: Return of the text adventure game
 *
 * Create your own text adventure game!
 * This is a similar concept to one of your earlier assignments but with a few requirements:
 *     You must create Character, Weapon and Room classes.
 *     Every character must be an instance of a Character or an instance of a sub-class of Character.
 *     Every weapon must be an instance of a Weapon or an instance of a sub-class of Weapon.
 *     Every room must be an instance of a Room or of a sub-class of Room.
 *     You must create an abstract class and use it at least twice.
 *     You must create an interface and use it at least twice.
 *     You may create other classes including container classes (e.g. the World class may be a collection of Rooms).
 * This assignment is the more object-oriented version of the previous assignment.
 * Be very careful in the way you design your code.
 * Here's an example: You can make Character an abstract class, and create a Non-Player Character class and a
 * Player Character class inheriting from it, and then make all characters instances of either NPCs or PCs.
 * Although it may take a little more thinking, these kinds of decisions can prevent copy-pasting code and help you debug.
 */

public class AdventureGame {

    public static void help() {
        System.out.println("Acceptable Commands:\n" +
                "SEARCH <Furniture> -> searches available furniture\n" +
                "PUSH <Furniture> -> pushes available furniture\n" +
                "SIT <Furniture> -> sit on avaiable furniture\n" +
                "USE <Object> -> use available object" +
                "HELP -> displays acceptable commands");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, answer, answer2;

        System.out.print("What is your name? ");
        name = scanner.next();
        Character player = new Character(name);
        Room room = new Room(player);

        System.out.println("You wake up to find yourself in a small, cluttered room.\n" +
                "You can't seem to remember how you got there.\n" +
                "The door is locked. Around you you see a bed, a dresser, and a table.\n" +
                "Try to get out of the room. Type HELP for help.");

        while (true) {
            answer = scanner.next();
            answer2 = scanner.next();
            if (answer.equalsIgnoreCase("help"))
                help();
            else if (answer.equalsIgnoreCase("search")) {
                if (answer2.equalsIgnoreCase("bed"))
                    room.getBed().search();
                else if (answer2.equalsIgnoreCase("table"))
                    room.getTable().search();
                else if (answer2.equalsIgnoreCase("chair"))
                    room.getChair().search();
                else
                    System.err.println("That furniture does not exist");
            } else if (answer2.equalsIgnoreCase("push")) {
                
            }

        }
    }

}