package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * may9.java
 */

public class Main {

    public static String reverse(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return reversed;
    }

    public static String capitalize(String input) {
        String inputs[] = input.split(" ");
        String output = "";
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = inputs[i].substring(0, 1).toUpperCase() + inputs[i].substring(1);
            output += inputs[i] + " ";
        }
        return output.trim();
    }

    public static String reverseWords(String input) {
        String inputs[] = input.split(" ");
        String output = "";
        for (int i = inputs.length - 1; i >= 0; i--) {
            //inputs[i] = inputs[i].substring(0, 1).toUpperCase() + inputs[i].substring(1);
            output += inputs[i] + " ";
        }
        return output.trim();
    }

    public static int parseAddition(String numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length(); i++) {
            char c = numbers.charAt(i);
            if (47 < c && c < 58) {
                result += Integer.valueOf("" + c);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse("Ramona"));
        System.out.println(reverseWords("i love java"));
        System.out.println(capitalize("i love java"));
        System.out.println(parseAddition("3 + (4 + 2)"));

    }
}