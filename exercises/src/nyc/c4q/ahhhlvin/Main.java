package nyc.c4q.ahhhlvin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse("Quispe"));
        System.out.println(uppercase("i love java"));
        System.out.println(reverseWords("i love java"));
        System.out.println(parseAddition("3 + (4+2)"));

    }


    public static String reverse(String input) {
        String str = "";

       for (int i = input.length()-1; i >= 0; i--) {
           str += input.charAt(i);
       }

        return str;
    }


    public static String uppercase(String input)
    {
        String fin = "";
        ArrayList<String> words = new ArrayList<String>();
        Scanner scanner = new Scanner(input);
        while (scanner.hasNext()) {
            words.add(scanner.next() + " ");
        }

        for (String word : words) {
            fin += word.substring(0, 1).toUpperCase() + word.substring(1);
        }

        return fin;
    }

    public static String reverseWords(String input) {
        String fin = "";
        List<String> words = new ArrayList<String>();
        Scanner scanner = new Scanner(input);
        while (scanner.hasNext()) {
            words.add(scanner.next() + " ");
        }

        for (int i = words.size()-1; i >= 0; i--) {
            fin += words.get(i).substring(0, 1).toUpperCase() + words.get(i).substring(1);
        }

        return fin;
    }


    public static int parseAddition(String input) {
        int answer = 0;
        ArrayList<Integer> ints = new ArrayList<Integer>();


        for (int i = 0; i < input.length(); i++) {


            int encode = (int) input.charAt(i);

            if (encode == 40) {
                answer = ((input.charAt(i+1)) + (input.charAt(i+3)));
            } else {
                continue;
            }
        }
        System.out.println(answer);
        answer += input.charAt(0);


        return answer;
    }





}
