package nyc.c4q.sufeiiz.AdventureGame;

import java.lang.*;
import java.util.Scanner;

/**
 * Created by sufeizhao on 5/9/15.
 */
public class EscapeTheRoom {

    public static void help() {
        System.out.println("Acceptable Commands:\nSEARCH <Furniture> -> searches available furniture\nPUSH <Furniture> -> pushes available furniture\nSIT <Furniture> -> sit on avaiable furniture\nUSE <Object> -> use available objectHELP -> displays acceptable commands");
    }

    public static void unknownError() {
        System.err.println("That command does not exist");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.next();
        Character player = new Character(name);
        Room room = new Room(player);
        Weapon bat = new Weapon("bat");
        Weapon screwdriver = new Weapon("screwdriver");
        boolean hasBat = false;
        boolean hasScrewdriver = false;
        boolean movedChair = false;
        System.out.println("You wake up to find yourself in a small, cluttered room.\nYou can\'t seem to remember how you got there.\nThere is a locked door and a small window near the ceiling.\nAround you you see a bed, a dresser, and a table.\nTry to get out of the room. Type HELP for help.");

        label80:
        while(true) {
            while(true) {
                while(true) {
                    while(true) {
                        while(true) {
                            while(true) {
                                String answer = scanner.next();
                                String answer2 = scanner.next();
                                if(!answer.equalsIgnoreCase("help")) {
                                    if(!answer.equalsIgnoreCase("search")) {
                                        if(!answer.equalsIgnoreCase("push")) {
                                            if(!answer.equalsIgnoreCase("sit")) {
                                                if(answer.equalsIgnoreCase("use")) {
                                                    if(answer2.equalsIgnoreCase("screwdriver")) {
                                                        if(hasScrewdriver) {
                                                            screwdriver.useScrewDriver(movedChair);
                                                            break label80;
                                                        }

                                                        System.out.println("You don\'t have a screwdriver to use.");
                                                    } else if(answer2.equalsIgnoreCase("bat")) {
                                                        if(hasBat) {
                                                            bat.useBat(movedChair);
                                                            break label80;
                                                        }

                                                        System.out.println("You don\'t have a bat to use.");
                                                    } else {
                                                        unknownError();
                                                    }
                                                } else {
                                                    unknownError();
                                                    System.out.println("Type HELP for help.");
                                                }
                                            } else if(answer2.equalsIgnoreCase("bed")) {
                                                room.getBed().sitOn();
                                            } else {
                                                unknownError();
                                            }
                                        } else if(answer2.equalsIgnoreCase("bed")) {
                                            room.getBed().push();
                                        } else if(answer2.equalsIgnoreCase("table")) {
                                            room.getTable().push();
                                        } else if(answer2.equalsIgnoreCase("chair")) {
                                            room.getChair().push();
                                            movedChair = true;
                                        } else {
                                            unknownError();
                                        }
                                    } else if(answer2.equalsIgnoreCase("bed")) {
                                        room.getBed().search();
                                        hasBat = true;
                                    } else if(answer2.equalsIgnoreCase("table")) {
                                        room.getTable().search();
                                        hasScrewdriver = true;
                                    } else if(answer2.equalsIgnoreCase("chair")) {
                                        room.getChair().search();
                                    } else {
                                        unknownError();
                                    }
                                } else {
                                    help();
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("You made it out of the room!");
    }
}
