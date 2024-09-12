package nyc.c4q.yuliyakaleda;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Room> rooms;

    public static void main(String[] args) {

        //create an arrayList of rooms
        rooms = new ArrayList<Room>();

        FireRoom fireRoom = new FireRoom();
        WaterRoom waterRoom = new WaterRoom();
        DarkRoom darkRoom = new DarkRoom();
        TigerRoom tigerRoom = new TigerRoom();

        rooms.add(fireRoom);
        rooms.add(waterRoom);
        rooms.add(darkRoom);
        rooms.add(tigerRoom);


        // intro
        System.out.println("You can choose to play either IronMan or SpiderMan or Barbie character. " +
                                   "Your task will be to go through 5 rooms. Every room has some obstacle " +
                                   "to overcome. But do not worry, you have some weapons to use that " +
                                   "will help you to remove the obstacle. You have a candle, a gun, a boat," +
                                   " and a bucket. You have a choice of either entering a room, skipping a " +
                                   "room or finish the game. Type in \"IronMan\" to play an" +
                                   " Iron Man, \"SpiderMan\" to play a Spider Man or \"Barbie\" to become a Barbie!");

        //user chooses a hero to play
        Scanner in = new Scanner(System.in);
        String userInput = in.next();

        IronMan iron = new IronMan();
        SpiderMan spider = new SpiderMan();
        Barbie barbie = new Barbie();

        System.out.println("Great! " + userInput + ", let's start!");

        // start game
        for (int i = 0; i <=4; i ++) {

            //break when user explores all rooms
            if (i==4) {
                System.out.println("Congratulations! You have overcome all obstacles!");
                break;
            }

            System.out.println("You are standing in front of a room with an obstacle. Type in \"E\" to enter the room," +
                                       " \"S\" to skip the room or \"F\" to finish the game.");
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.next();

            // enter a room
            if (userInput.equalsIgnoreCase("e")) {
                iron.enterRoom();
                Room currentRoom = rooms.get(i);
                System.out.println(currentRoom.revealChallenge());
                System.out.println("Type in \"Gun\" to choose a gun, \"Candle\" to choose a candle, \"Water\" to get a bucket of water " +
                                           " \"Boat\" to use a boat.");
                Scanner weapon = new Scanner(System.in);
                String weaponChoice = weapon.nextLine();

                //user chooses the right weapon and moves to the next room
                 if (weaponChoice.equalsIgnoreCase(currentRoom.getRequiredWeapon())) {
                     currentRoom.fetchWeapon().useWeapon();
                     System.out.println("Great! You are moving to the next room!");
                 }

                 //user chooses the wrong weapon, game over
                else {
                     System.out.println("You chose the wrong weapon! Game over!");
                     break;
                 }
            }

            //skip a room
            else if (userInput.equalsIgnoreCase("s")) {
                iron.skipRoom();
                i--;
            }

            //finish the game
            else if (userInput.equalsIgnoreCase("f")) {
                iron.finishGame();
                break;
            }
        }
    }
}
