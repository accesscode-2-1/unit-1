package nyc.c4q.hyunj0;

public class Main {

    public static void main(String[] args)
    {
        PlayingCards newDeck = new PlayingCards();
        for(int i = 0; i < 52; i++)
        {
            System.out.println(newDeck.getpieces(i).getSuit() + " " + newDeck.getpieces(i).getRank());
        }
    }
}
