package nyc.c4q.jaellysbales;
import java.util.Scanner;

/**
 * Access Code 2.1
 * Created by Jaellys Bales on 5/10/15.
 * Project: AC_05-09
 * <p/>
 * ${FILE_NAME}
 * Enter a description.
 */
public class scratch
{
    public static void main(String[] args)
    {
        String sign = "";

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter your birth month: ");
            int month = in.nextInt();
            System.out.println("Please enter your birth day: ");
            int day = in.nextInt();

            if (month == 0 || day == 0) {
                break;
            }
            else if (month == 1) {
                if (day <= 20) {
                    sign = "Capricorn";
                }
                else {
                    sign = "Aquarius";
                }
            }
            else if (month == 2) {
                if (day <= 21) {
                    sign = "Aquarius";
                }
                else {
                    sign = "Pisces";
                }
            }
            else if (month == 3) {
                if (day <= 20) {
                    sign = "Pisces";
                }
                else {
                    sign = "Aries";
                }
            }
            else if (month == 4) {
                if (day <= 19) {
                    sign = "Aries";
                }
                else {
                    sign = "Taurus";
                }
            }
            else if (month == 5) {
                if (day <= 20) {
                    sign = "Taurus";
                }
                else {
                    sign = "Gemini";
                }
            }
            else if (month == 6) {
                if (day <= 21) {
                    sign = "Gemini";
                }
                else {
                    sign = "Cancer";
                }
            }
            else if (month == 7) {
                if (day <= 22) {
                    sign = "Cancer";
                }
                else {
                    sign = "Leo";
                }
            }
            else if (month == 8) {
                if (day <= 22) {
                    sign = "Leo";
                }
                else {
                    sign = "Virgo";
                }
            }
            else if (month == 9) {
                if (day <= 22) {
                    sign = "Virgo";
                }
                else {
                    sign = "Libra";
                }
            }
            else if (month == 10) {
                if (day <= 23) {
                    sign = "Libra";
                }
                else {
                    sign = "Scorpio";
                }
            }
            else if (month == 11) {
                if (day <= 20) {
                    sign = "Scorpio";
                }
                else {
                    sign = "Sagittarius";
                }
            }
            else if (month == 12) {
                if (day <= 22) {
                    sign = "Sagittarius";
                }
                else {
                    sign = "Capricorn";
                }
            }
            System.out.println(sign);
        }
    }
}
