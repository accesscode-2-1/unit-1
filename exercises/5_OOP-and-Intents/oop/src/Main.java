package src;

/**
 * Created by c4q-george on 4/30/15.
 */
public class Main {
    public static void main(String[] args){
        Musician beethoven = new Musician();
        Violin viola = new Violin();
        System.out.println(beethoven.play_instrument(viola));
    }
}
