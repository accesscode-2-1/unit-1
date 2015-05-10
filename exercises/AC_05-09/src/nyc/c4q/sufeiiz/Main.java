package nyc.c4q.sufeiiz;

import sun.jvm.hotspot.interpreter.Interpreter;

import java.util.Scanner;

public class Main {

    public static String reverse(String word) {
        String reversed = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return reversed;
    }

    public static String capitalize(String words) {
        String capitalized = "";
        Scanner scanner = new Scanner(words);

        while (scanner.hasNext()) {
            String curr = scanner.next();
            capitalized += curr.toUpperCase().charAt(0);

            if (curr.length() > 1) {
                for (int i = 1; i < curr.length(); i++) {
                    capitalized += curr.charAt(i);
                }
            }
        }

        return capitalized;
    }

    public static String reverseWords(String words) {
        String reversed = "";
        Scanner scanner = new Scanner(words);

        while (scanner.hasNext()) {
            reversed = scanner.next() + " " + reversed;
        }

        return reversed;
    }

    public static long parseEquation(String equation) {
        long answer = 0;

        for (int i = 0; i < equation.length(); i++) {
            if (Character.isSpaceChar(equation.charAt(i)))
                continue;
            else if (Character.isDigit(equation.charAt(i)))
                ;
            else if (equation.charAt(i) == '+')
                ;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(reverse("Quispe"));
    }
}
