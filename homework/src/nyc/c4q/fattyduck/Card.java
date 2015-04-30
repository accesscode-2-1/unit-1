package nyc.c4q.fattyduck;
import java.util.Random;

/**
 * Created by fattyduck on 4/27/15.
 */
public class Card
{
    String s;
    int num;

    public Card(int num){
        this.num=num+1;
    }

    public void card(){
         if(num<14){
             s= String.valueOf(num)+" of diamonds";
         }else if(num<27){
             num-=13;
             s= String.valueOf(num)+" of clubs";
         }else if(num<40){
             num-=13;
             s= String.valueOf(num)+" of hearts";
         }else if(num<53){
             num-=13;
             s= String.valueOf(num)+" of spades";
         }
    }



}
