package nyc.c4q.abassawo;

import java.util.Scanner;

/**
 * Created by c4q-Abass on 5/1/15.
 */
public class World extends Room {
    Scanner playerInput = new Scanner(System.in);
    public Room office = new Room("office");
    public Room dungeon = new Room("dungeon");
    GameCharacter professor = new GameCharacter();
    GameCharacter player = new GameCharacter();
    GameCharacter cat = new GameCharacter();

    String intro = ("You are about to embark on an adventure in interactive fiction where you control the main character as you play thought the story. " +
            "To see what you are carrying press 'inventory' You can pick up items, examine them, use them, talk to other characters. If you get stuck, type 'hints Happy Adventure" + "\n\n Press Start to begin");


    String gamePremise = ("\n After your professor's untimely death, you explore his empty office gathering all of his belongings and looking for clues. " +
            "You learn that the professor's scientific skills were being abused by a sinister corporation developing an untraceable toxin for assassinations, " +
            "and that when your uncle tried to destroy his work, he was silenced.\n" +
            "You were confronted by the corporation's agents, but fought back, killing one. Unfortunately you were struck by a tazer before you could escape from the school. " +
            "Unconsciousness. They took you and you remember nothing.. You have awoken in darkness, a bag on your head and handcuffs on your wrists...");


     String catPremise = ("It turns out that this cat is no ordinary cat, but actually a cat from the future. Jinxie The professor has programmed Jinxie with a computer chip so that instead of a normal brain, it can process the things much like a computer can. The cat fills you in on the professor's disappearance," +
            " and explains that the professor actually isn't dead, but is in hiding. Unfortunately, the cat's feeble computer brain is too simple to crack the clues that the professor has left behind." +
            "No worries, you can still use the cat to guide you around the room. You can communicate with Jinxie, and you can run computer programs directly on her micro-chip");



    public World(){
    }

    public void startGame() {
        Scanner playerInput = new Scanner(System.in);

        GameCharacter player = new GameCharacter();

        System.out.println(intro);

        if (playerInput.next().equals("Start")) {
            System.out.println(gamePremise);
            System.out.println("\n It is complete darkness in the room and complete silence other than the sound of a purring cat. The cat doesn't seem too interested in helping you, she's probably just too hungry to help you");
            player.setRoom(dungeon);
            System.out.println("\nType go to move around and explore the room with touch");

            if (playerInput.next().equals("go")) {
                dungeon.lookAround();
                if(playerInput.next().equals("follow")){

                    GameCharacter cat = new GameCharacter();

                    cat.speak("\nThank you so much, I really needed that");
                }
            }
        }
        //methd for removing blindfold, uncovering more information aboiut identity.
    }

    public void catHelp(){
        System.out.println("Wait, the cat can talk?");
        System.out.println(catPremise);
        System.out.println("Press enter to continue");
        if (playerInput.next().equals("enter")) {
            stageTwo();
        }
    }

    public void stageTwo() {
            System.out.println("The cat has led you to another room where there is a girl also being held captive");
            GameCharacter cassie = new GameCharacter();

            System.out.println("move to approach the girl and help free her");
            if (playerInput.next().equals("move")){
                this.setRoom(office);
                System.out.println("Jinxie says the girl is actually the professor's daughter. " +
                        "You have both been held hostage by the bad guy so they can use you as leverage if the professor returns. But you're running out of time. they'll be back any minute!");
            } else {
                System.out.println("Feel around the room or have Jinxie help guide you.");
            }
        System.out.println("You can abandon the daughter and escape, or you can follow Jinxie to help");
            if (playerInput.next().equals("follow")){
                System.out.println("Jinxie pointed out a knife in the small office you are now in near the kitchen. You use the knife to cut open the ropes and mouth gag ");
                Object gag = new Object();
                PocketKnife knife = new PocketKnife();
                knife.cut(gag);
                System.out.println("the knife has been added to your weapons inventory. You can pick up more along the ways, but first we need to stop the bad guys from finding and destroying the professor's vaccine.");
                cassie.speak("Helpppp!!!");

                System.out.println("The professor's daughter helps take the bag off your heads and helps you look for keys to the handcuffs");
            }
    }

    public void gotoHomeDepot() {}
            //ChainSaw x = new ChainSaw();
}