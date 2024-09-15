package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by c4q-george on 4/29/15.
 */
public class Adventure {

    public static void battle(ArrayList<Object> game){
        Character jim = (Character) game.get(0);
        Scanner keyboard = (Scanner) game.get(1);
        Character carter = (Character) game.get(2);
        String input = "";

        while(carter.getHP()>0){
            System.out.println("Type SHOOT to fire your weapon");
            input=keyboard.nextLine();
            if(input.equalsIgnoreCase("shoot")){
                jim.currentWeapon.attack(carter);
            }else{
                System.out.println("The enemy attacked you.");
                carter.currentWeapon.attack(jim);
            }
            if(jim.getHP()<=0){
                System.out.println("YOU DIED!");
                System.out.println("Game Over");
                return;
            }
        }
    }

    public static void questRadius(ArrayList<Object> playerInterface, int x,int y){
        Character jim = (Character) playerInterface.get(0);
        Scanner keyboard = (Scanner) playerInterface.get(1);
        String input="";

        int startX = jim.getCurrentRoom().getX();
        int startY = jim.getCurrentRoom().getY();

        while(
                (jim.getCurrentRoom().getX()< x+startX && jim.getCurrentRoom().getX()>-x-startX)
                        &&
                        (jim.getCurrentRoom().getY()<y+startY&&jim.getCurrentRoom().getY()>-y-startY)
                ) {

            System.out.println("WHERE DO YOU WANT TO GO?");
            System.out.println("UP,DOWN,LEFT,RIGHT");
            input = keyboard.nextLine();
            jim.move(input);
        }

    }

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        //Setting up rooms
        Room room1 = new Room(0,0);
        Room room2 = new Room(15,15);
        // Creating characters
        Character jim = new Character("Jim");
        Character carter = new Character("Carter");

        // Placing characters in rooms
        jim.enterRoom(room1);
        carter.enterRoom(room1);

        // Creating weapons
        SemiAutoGun desertEagle = new SemiAutoGun(50,15);
        SemiAutoGun revolver = new SemiAutoGun(30,6);
        FullAutoGun m60 = new FullAutoGun(100,100);
        FullAutoGun g3 = new FullAutoGun(10,20);
        Spear longSpear = new Spear(15);

        //Creating MedPacks
        MedPack thirty = new MedPack(30);
        MedPack ten = new MedPack(10);
        MedPack hundred = new MedPack(100);

        carter.pickUpWeapon(longSpear);
        ArrayList<Object> game = new ArrayList<Object>();
        game.add(jim);
        game.add(keyboard);
        game.add(carter);


//        // Testing weapons
//        jim.pickUpWeapon(revolver);
//        jim.currentWeapon.attack(carter);


//        // Testing inventory and Meds
//        carter.pickUpMedPack(ten);
//        carter.showInventory();
//
//        carter.showHP();
//        carter.useMedPack();
//        carter.showHP();


        System.out.println("....");
        System.out.println("");
        System.out.println("Where am I?");
        String input = keyboard.nextLine();
        System.out.println("- " + input + " -" + " That's not very helpful...");
        jim.showInventory();
        jim.showPosition();
        System.out.println("I'm all out...");
        System.out.println("We better get moving, this place don't look safe.");
        System.out.println("");


        // The player can wonder around a radius X2 and Y2

        questRadius(game,2,2);
        System.out.println("You found a REVOLVER.");
        jim.pickUpWeapon(revolver);
        System.out.println("ADDED REVOLVER TO INVENTORY");

        questRadius(game,3,1);
        System.out.println("You encountered an enemy");
        battle(game);

        System.out.println("GAME OVER");




    }

}
