package nyc.c4q.Amcbri15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    String string;
        System.out.println("String: ");
        string = in.next();
        System.out.println("Reverse string: " + reverse(string));

        System.out.println(reverseWords("Hello New World!"));


    }
    public static String reverse(String string){
        String newString = "";
        for (int i = string.length()-1; i >= 0; i--){
            newString = newString + string.charAt(i);
            System.out.println(newString);
        }

        return newString;
    }
    public static String upperCase(String string){
        String newString;
        String[] words = string.split(" ");
        }
        return "";
    }
    public static String reverseWords(String string){
        String[] words = string.split(" ");
        String newString = "";

        for (int i = words.length-1; i < words.length; i--){
            newString+= i;
        }
        return newString;
    }



}
