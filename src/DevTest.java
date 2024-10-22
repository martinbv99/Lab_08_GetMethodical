import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        int age = 0;
        double salary = 0;
        int favNum = 0;
        double constrained = 0;
        boolean wantToQuit = false;
        String SSN = "";


        /*
        firstName = getNonZeroLenString(in, "Enter your first name");

        System.out.println("Name is " + firstName);

        age = getInt(in, "Enter your age");
        System.out.println("You said your age is "+age);

        salary = getDouble(in,"Enter your salary");
        System.out.println("Salary is " + salary);



        favNum = getRangedInt(in, "Enter your favorite number [1-10]", 1, 10);
        System.out.println("Your favorite number is: "+ favNum);

        constrained = getRangedDouble(in, "Enter the constrained double [100 - 100,000]" , 100, 100000);
        System.out.println("Constrained is " + constrained);



        wantToQuit = getYNConfirm(in, "Do you think you are super cool? [Y/N]");
         System.out.println("You said " + wantToQuit ); */

        SSN = getRegExString(in, "Enter your SSN","^\\d{3}-\\d{2}-\\d{4}$");





    }

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retVal = "";


        do
        {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();

            if(retVal.isEmpty())
                System.out.println("You must enter at least one character grrrr");

        }while(retVal.isEmpty());

        return retVal;

    }


    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";


        do
        {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer, not " + trash);
            }

        }while(!done);


        return retVal;

    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";


        do
        {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer, not " + trash);
            }

        }while(!done);


        return retVal;



    }

    /**
     * gets an integer from the user using the console within a specified range
     * @param pipe scanner to use input
     * @param prompt prompt to tell user what to use what is required
     * @param low the low inclusive low bound
     * @param high the inclusive high bound
     * @return int within specified bounds
     */

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";


        do
        {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value within the range [" + low + "-"+ high + "] ");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer, not " + trash);
            }

        }while(!done);


        return retVal;
    }
    /**
     * gets an integer from the user using the console within a specified range
     * @param pipe scanner to use input
     * @param prompt prompt to tell user what to use what is required
     * @param low the low inclusive low bound
     * @param high the inclusive high bound
     * @return double within specified bounds
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";


        do
        {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value within the range [" + low + "-"+ high + "]: ");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double, not " + trash);
            }

        }while(!done);


        return retVal;
    }

    /**
     * gets a y or n from the user ( yes or no ) and returns the equal
     * @param pipe sacnner to use input
     * @param prompt tells user what to enter
     * @return true or false based on y or n
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retVal = false;
        String YNResponse = "";
        boolean done = false;


        do
        {
            System.out.print(prompt + ": ");
            YNResponse = pipe.nextLine();

            if(!YNResponse.matches("[YyNn]"))
            {
                System.out.println("You must enter [Y/N]: ");

            }
            else
            {
                done = true;
                switch (YNResponse)
                {
                    case "Y":
                    case "y":
                        retVal = true;
                        break;
                    case "N":
                    case "n":
                        retVal = false;
                        break;
                }
            }


        }while(!done);

        return retVal;
    }
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retVal = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": " );
            retVal = pipe.nextLine();
            if (retVal.matches(regEx)){
                done = true;}
            else
            {
                System.out.println("You must enter a matching expression bruhhh "  + "not " + retVal);
            }
        }while(!done);


        return retVal;
    }

}