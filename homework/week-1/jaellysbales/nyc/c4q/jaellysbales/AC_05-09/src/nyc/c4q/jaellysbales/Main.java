package nyc.c4q.jaellysbales;

import java.util.Scanner;

public class Main {

    public static String reverseWords(String input)
    {
        String reversed = "";

        //split string to string array
        //build, put in spaces.

        return reversed;
    }

    public static String uppercaseString(String input)
    {
        String toUpper = "";
        int spaceInd = input.indexOf(' ');
        String word = input.substring(0, spaceInd);
        Scanner sc = new Scanner(input);
//        String firstLtr = String.valueOf(input.charAt(0));

        while (sc.hasNext())
        {
            word = sc.next(); //cap this

        }

        //while scanner hasnext, capitalize first letter
        //append words to new string using substring

        return toUpper;
    }

    public static String reverse(String input)
    {
        String toReverse = "";

        for(int i = input.length() - 1; i >= 0; i--)
        {
            toReverse += input.charAt(i);
        }

        return toReverse;
    }

    public static void main(String[] args)
    {
        System.out.println(reverse("Hello world"));
        System.out.println(uppercaseString("i love java"));
    }
}
