package nyc.c4q.tashsmit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Weapon AK47 = new Gun(30);
        Weapon handGun = new Gun(100);
        Weapon tsarCannon = new Gun(5);

        Character soldier = new Character("Kernel", AK47, 100 );
        Character confederate = new Character("Lincoln", tsarCannon, 100 );
        Character sheriff = new Character("Sheriff Donald", handGun, 100 );

        Room forest = new Forest();


        System.out.printf("Welcome to my adventure game!\nI need to know some information before we get started\n");
        System.out.println("What is your name? ");

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.printf("What's your weapon type: \nGun   choose 1\nCannon    choose2  ");
        int weaponchoice = input.nextInt();
        input.nextLine();

        while(true)
        {

            if(weaponchoice == 1)
            {
                System.out.println("Gun! Nice choice, tell me what gun you want? ");
                break;
            }
            else if(weaponchoice == 2)
            {
                System.out.println(
                        "A cannon! Someone's feeling brave. Whats the name of your cannon? ");
                break;
            }
            else
            {
                System.out.println("Please choose option 1 or 2");
            }
        }

        String weaponName = input.nextLine();

        System.out.println("Choose your HP\n type 200 for easy, 100 for medium or 50 for hard mode! ");

        int hpChoice = input.nextInt();

        while(true)
        {

            if(hpChoice==100)
            {
                break;
            }
            else if(hpChoice==200)
            {
                break;
            }
            else if(hpChoice == 50)
            {
                break;
            }
            else
            {
                System.out.println("Please choose 50,100 or 200");
            }
        }

        if (weaponchoice == 1) {
            Weapon userWeapon = new Gun (50);
            Character user = new Character(name, userWeapon, hpChoice);
        }
        else {
            Weapon userWeapon = new Cannon (5);
            Character user = new Character(name, userWeapon, hpChoice);
        }

        System.out.println("Okay " + name + " you are now ready for your adventure!");
        System.out.println();
        System.out.println();
        System.out.println(name + ", your are now entering the " + forest.getClass().getSimpleName());
        System.out.println();
        System.out.println();
        forest.draw();

    }
}
