package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/27/15.
 */
public class Character extends Quit
{

    private int health = 200;
    private int damage = 50;
    private int numOfPots = 3;

    public Character(){

    }

    public Character(int health, int damage){
        this.health=health;
        this.damage=damage;
    }
    public int getHealth(){
        return this.health;
    }
    public void fight(Character c){
        this.health=this.health-c.damage;
        c.health=c.health-this.damage;
    }

    public void drinkPot(){
        if(this.numOfPots>0){
            this.health+=50;
            this.numOfPots=this.numOfPots-1;
        }else{
            System.out.println("No more Health Pots");
        }
    }

    public void run(){
        System.out.println("You ran away like a coward!");
    }

    public void quitGame(){
        System.out.println("You have quit the game");
    }
}
