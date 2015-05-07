package nyc.c4q.anthonyfermin;
/**
 * Created by c4q-anthonyf on 5/1/15.
 */
public class Card
{
    String suit;
    String valueName;
    int value;
    String[] valueNames = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    
    public Card(String suit, int value){
        this.suit = suit;
        this.value = value;
        this.valueName = this.valueNames[value];
    }

    public String getSuit(){
        return suit;
    }

    public String getValueName(){
        return valueName;
    }

    public int getValue(){
        return value;
    }
}
