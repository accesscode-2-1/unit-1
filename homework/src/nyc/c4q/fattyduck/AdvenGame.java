package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/29/15.
 */
import java.util.Scanner;
import java.util.Random;

public class AdvenGame
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int[] i = {rand.nextInt(200),rand.nextInt(50),rand.nextInt(200),rand.nextInt(50)};
        Room room = new Room();
        Weapon weapon = new Weapon();

        Character player = new Player(i[0], i[1]);
        Character comp = new Computer(i[2], i[3]);
        int wp = rand.nextInt(3);
        room.welcome();
        System.out.println(weapon.name(wp));
        while(true){
            room.choices();
            int j = scan.nextInt();
            if(j==1){
                player.fight(comp);
            }else if(j==2){
                player.drinkPot();
            }else {
                player.run();
                break;
            }
            System.out.println("Your remaining HP: "+player.getHealth());
            System.out.println("Enemy remaining HP: "+comp.getHealth());

            if(player.getHealth()<1){
                room.death();
                room.gameOver();
                player.quitGame();
                break;
            }
            if(comp.getHealth()<0){
                room.victory();
                room.gameOver();
                room.quitGame();
                break;
            }


        }
    }
}
