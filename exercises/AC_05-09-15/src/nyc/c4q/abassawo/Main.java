package nyc.c4q.abassawo;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverseTxt("Quispe"));
        System.out.println(upperCase("my name is bill cosby"));
        System.out.println(reverseWords("my name is bill cosby"));
    }

    public static String reverseTxt(String txt){
       String output = "";
        for (int i = txt.length() - 1; i >= 0; i--) {
            output += txt.charAt(i);
        }
        return output;
    }

    public static String upperCase(String txt){
        ArrayList<String> words = new ArrayList<String>();
     Scanner scanner = new Scanner(txt);
        String output = "";
        while (scanner.hasNext()){
            words.add(scanner.next() + " ");

            }
        for (String word : words) {
            output += word.substring(0, 1).toUpperCase() + word.substring(1);
        }

        return output;
    }

    public static String reverseWords(String x) {
        String output = "";
        ArrayList<String> words = new ArrayList<String>();
        Scanner scanner = new Scanner(x);
        while (scanner.hasNext()){
            words.add(scanner.next() + " ");

        }

        for (int i = words.size() - 1; i >= 0; i--) {
            output += words.get(i);
        }
    return output;
    }

    public static String parseAddX() {
        return "fixme";
    }
}
