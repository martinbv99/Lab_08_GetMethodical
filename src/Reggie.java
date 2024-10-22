import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String Mnum = "";
        String menu = "";


        /*
        SSN = SafeInput.getRegExString(in,"Enter your SSN in the form of xxx-xx-xxxx","^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN is: " + SSN + ", thanks >:) ");

         */

        Mnum = SafeInput.getRegExString(in, "Enter your M number in the form of M12345", "^(M|m)\\d{5}$");
        System.out.println("Your M# is: " + Mnum + ", ha ha ha now I have your M# too...");

        /*

        menu = SafeInput.getRegExString(in, "Would you like to open [O], view [V], save [S], or quit [Q]", "^[OoSsVvQq]$");
        System.out.println("You chose to " + menu );

         */


    }
}
