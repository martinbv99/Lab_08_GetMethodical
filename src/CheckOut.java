import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        double price = 0;
        double totalCost = 0;
        boolean answer = false;

        do {

            price = SafeInput.getRangedDouble(in, "Enter the price of your item [00.50 - 10.00]", 0.5, 10.0);
            System.out.println("The price of your item is " + price);
            totalCost += price;
            answer = SafeInput.getYNConfirm(in, "Add another item? [Y/N]");



        }
        while (answer);
        System.out.printf("The total cost of all items is " + totalCost);
        System.out.print(", Thank you for using this program!");

    }
}
