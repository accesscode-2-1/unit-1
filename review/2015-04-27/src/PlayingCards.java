/**
 * Created by c4q-madelyntavarez on 5/1/15.
 */
public class PlayingCards extends AGame
{
    public static int numbers = 13;
    public static int Suits = 4;
    public static int nCard = numbers * Suits;
    Card[] deck = new Card[nCard];

    public PlayingCards(){
            for(int i = 0; i < numbers; i++){
                for(int j = 0; j < Suits; j++){
                    deck[j * numbers + i] = new Card(i,j);
                }
            }
        }
    public Card getCard(int x){
        return deck[x-1];

    }

    @Override
    Card getPieces(int x)
    {
        return deck[x - 1];
    }
}
