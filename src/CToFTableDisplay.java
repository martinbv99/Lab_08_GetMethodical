import java.util.Scanner;

public class CToFTableDisplay
{
    public static void main(String[] args)
    {
        Scanner poop = new Scanner (System.in);
        double celsius = 0;
        double faren = 0;

        celsius = SafeInput.getDouble(poop,"Enter the temperature value in celcius");
        faren = CtoF(celsius);

        System.out.println("Celcius\t\tFahrenheit");
        System.out.println("________________________");

        System.out.printf("%6.2f\t\t%6.2f\n",celsius, faren);


    }
    public static double CtoF (double Celsius)
    {
        return (Celsius * 9/5) + 32;
    }

}

