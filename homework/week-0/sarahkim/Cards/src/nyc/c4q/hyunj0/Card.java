package nyc.c4q.hyunj0;

public class Card
{
    String suit, rank;

    public Card (String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    String getSuit () {
        return this.suit;
    }

    String getRank () {
        return this.rank;
    }
}
