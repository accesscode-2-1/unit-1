package nyc.c4q.personabe1984;

import java.util.ArrayList;

import nyc.c4q.personabe1984.Characters.Character;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /***
         * Problem 3: Return of the text adventure game

         Create your own text adventure game! This is a similar concept to one of your earlier assignments but with a few requirements:

         ~You must create Character, Weapon and Room classes.
         ~Every character must be an instance of a Character or an instance of a sub-class of Character.
         Every weapon must be an instance of a Weapon or an instance of a sub-class of Weapon.
         Every room must be an instance of a Room or of a sub-class of Room.
         You must create an abstract class and use it at least twice.
         You must create an interface and use it at least twice.
         You may create other classes including container classes (e.g. the World class may be a collection of Rooms).
         This assignment is the more object-oriented version of the previous assignment. Be very careful in the way you design your code.
         Here's an example: You can make Character an abstract class, and create a Non-Player Character class and a Player Character class inheriting from it,
         and then make all characters instances of either NPCs or PCs. Although it may take a little more thinking, these kinds of decisions can prevent
         copy-pasting code and help you debug.

         */


        //You should always bring a banana to party.


        nyc.c4q.personabe1984.Characters.Character hans = new Character();

        InventoryItem redPotion = new InventoryItem(ItemType.POTION, "Red Potion");
        hans.addInventoryItem(redPotion);



        hans.addInventoryItem(new InventoryItem(ItemType.ARMOR, "+3 Chest Armor"));
        hans.addInventoryItem(new InventoryItem(ItemType.RING, "Ring of Protection"));
        hans.addInventoryItem(new InventoryItem(ItemType.POTION, "Invisibility Potion"));

        InventoryItem bluePotion = new InventoryItem(ItemType.POTION, "Blue Potion");

        boolean wasDeleted = hans.dropInventoryItem(bluePotion);
        System.out.println(wasDeleted);




        ArrayList<InventoryItem> allItem = hans.getInventoryItems();
        for(InventoryItem item : allItem){
            System.out.println(item.getName());
        }

        Enemy enemy = new Enemy(10,3);

        enemy.takeDamage(3);
        //the three axe story gold axe, silver axe, regular axe.

        Soldier soldier = new Soldier(25, 1);
        System.out.println(soldier.getHitPoints() + "  " + soldier.getLives());
        soldier.takeDamage(8);
        System.out.println();

        SuperSoldier superSoldier = new SuperSoldier(25,1);
        System.out.println(superSoldier.getHitPoints() + "  " + superSoldier.getLives());
        superSoldier.takeDamage(8);


    }
}
