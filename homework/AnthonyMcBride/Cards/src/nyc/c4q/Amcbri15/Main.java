package nyc.c4q.Amcbri15;

public class Main {

    public static void main(String[] args) {

        PlayingCards poker = new PlayingCards(52);

        for (Card card: poker.getPlayingCards()){
            System.out.println(card.toString());
        }
    }
}
