import java.util.HashMap;

/**
 * Created by kadeemmaragh on 5/1/15.
 */
public class Card
{

    private int suit;
    private int type;

    private HashMap<Integer, String> suitMap = new HashMap<Integer, String>();
    private HashMap<Integer, String> typeMap = new HashMap<Integer, String>();

    public Card(int suit, int type)
    {
        this.suit = suit;
        this.type = type;


    }

    public int getSuit()
    {
        return suit;
    }

    public int getType()
    {
        return type;
    }


    public void showCard(){
        generateMaps();
        String suitS = suitMap.get(this.getSuit());
        String typeS = typeMap.get(this.getType());

        System.out.println(typeS + " of " + suitS);

    }

    public void generateMaps()
    {
        suitMap.put(1, "Heart");
        suitMap.put(2, "Diamond");
        suitMap.put(3, "Spade");
        suitMap.put(4, "Club");

        typeMap.put(1,"One");
        typeMap.put(2,"Two");
        typeMap.put(3,"Three");
        typeMap.put(4,"Four");
        typeMap.put(5,"Five");
        typeMap.put(6,"Six");
        typeMap.put(7,"Seven");
        typeMap.put(8,"Eight");
        typeMap.put(9,"Nine");
        typeMap.put(10,"Ten");
        typeMap.put(11,"Jack");
        typeMap.put(12,"Queen");
        typeMap.put(13,"King");
        typeMap.put(14,"Ace");

    }

}
