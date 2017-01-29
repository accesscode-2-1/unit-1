package nyc.c4q.anthonyfermin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("What's your name? ");

        Hero player = new Hero(in.next());


    }
}
