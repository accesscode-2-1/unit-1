package nyc.c4q.hyunj0;

public class Main {

    public static void main(String[] args) {
        Boys robert = new Boys("Robert", 13);
        Girls elizabeth = new Girls("Elizabeth", 15);
        for (int x = 1; x < 7; x++) {
            for (int y = 1; y < 7; y++) {
                for (int z = 1; z < 7; z ++) {
                    System.out.println(" " + x + " " + y + " " + z + " " + robert.playCeelo(x, y, z));
                }
            }
        }
    }
}
