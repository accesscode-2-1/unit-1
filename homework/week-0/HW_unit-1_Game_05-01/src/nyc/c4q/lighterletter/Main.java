package nyc.c4q.lighterletter;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static String intro()
    {
        String intro = "On a bright morning day atop a high off mountain in eastern Asia, two thousand years" +
                " ago.. \n Two foes met to engage in mortal battle over a tree's last apple. " +
                "\n   Choose your player: (Job) (Jake)";
        return intro;
    }

    public static boolean playerChoice(String choice)
    {

        if(choice.equalsIgnoreCase("job"))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        Room world = new Room();
        world.setName("eastern asia mountain.");

        Character job = new Job("Job");
        Character jake = new Jake("Jake");


        System.out.println(intro());

        String choice = scanner.next();
        while(jake.getBaseHealth() > 0 || job.getBaseHealth() > 0)
        {

            if(choice.equalsIgnoreCase("job"))
            {
                System.out.println("Job: " + job.introMessage() + "(Attack)");
            }
            else
            {
                System.out.println("Jake: " + jake.introMessage() + "(Attack)");
            }


            String attack = scanner.next();

            if(playerChoice(choice))
            {
                jake.setBaseHealth(jake.getBaseHealth() - Jobssword.weapondmg());

                System.out.println("Jake: " + jake.defendMessage() + " Jakes health: " + jake.getBaseHealth());
            }
            else
            {
                job.setBaseHealth(job.getBaseHealth() - Jakessword.weapondmg());
                System.out.println("Job: " + job.defendMessage() + " Jobs health: " + job.getBaseHealth());



                if(job.getBaseHealth() <= 0)
                {
                    System.out.println(job.defeatMessage());
                    break;

                }else if(jake.getBaseHealth() <=0){
                    System.out.println(jake.defeatMessage());
                    break;
                }
            }
        }

        Random newRand = new Random();


    }
}
