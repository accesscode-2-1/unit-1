//package nyc.c4q.charlyn23;
//import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Collections;
//
///**
// * Created by charlynbuchanan on 4/29/15.
// */
//public class PlayingCards extends Game  {
//    ArrayList<Card> deck;
//
//    public playingCards() {
//
//        String[] number = new String[]{"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
//        String[] suit = new String[] {"Spades", "Clubs", "Hearts", "Diamonds"};
//        deck = new ArrayList<Card>();
//        for  (int i = 0; i < number.length; i++) {
//            for (int j = 0; j < suit.length; j++ ){
//                deck.add(new Card(number[i], suit[j]));
//            }
//        }
//    }
//    @Override
//    ArrayList<Card> getPieces(){
//        Collections.shuffle(deck);
//        return deck;
//    }
//
//    public static void main(String[] args){
//
//    }
//
//
//}
