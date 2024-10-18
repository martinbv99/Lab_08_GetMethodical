import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        int maxDays = 0;



        year = SafeInput.getRangedInt(in, "Enter the year you were born [1950-2015]", 1950, 2015);
        System.out.println("The year you were born is: " + year);

        month = SafeInput.getRangedInt(in, "Enter the month you were born [1-12]", 1, 12);
        System.out.println("The month you were born is: " + month);
        switch (month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            maxDays = 31; // Months with 31 days
            break;
            case 4: case 6: case 9: case 11:
            maxDays = 30; // Months with 30 days
            break;
            case 2:
                maxDays = 28; // February has 28 days (ignoring leap year)
                break;
            default:
                System.out.println("The day does not match the month! Try again");
        }

        day = SafeInput.getRangedInt(in, "Enter the day you were born [1-31]", 1, maxDays);

        System.out.println("You day you were born is " + day);

        hour = SafeInput.getRangedInt(in, "Enter the hour you were born [1-12]",1,12);
        System.out.println("The hour you were born was " + hour);

        minute = SafeInput.getRangedInt(in, "Enter the minute you were born [1-59]",1,59);
        System.out.println("The minute you were born was " + minute);

    }
}
