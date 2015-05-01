package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 4/29/15.
 */
public class Card {
    private String  rank;
    private String suit;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }



//    private String getSuit() {
//        return suit;
//    }
//
//    public void setSuit(String suit) {
//        this.suit = suit;
//    }
//
//    public char getRank() {
//        return rank;
//    }
//
//    public void setRank(char rank) {
//        this.rank = rank;
//    }

    // ACE, 2 = 10, King, Queen, Jack
}
