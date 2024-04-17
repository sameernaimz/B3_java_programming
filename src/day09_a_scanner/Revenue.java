package day09_a_scanner;
import java.util.Scanner;
public class Revenue {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the price of the line: ");
        double price = keyboard.nextDouble();
        System.out.print("Enter the quantity of the time: ");
        int quantity = keyboard.nextInt();

        double revenue = price * quantity;
        System.out.println("The revenue is $" + revenue);

    }
}
