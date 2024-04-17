package day09_a_scanner;
import java.util.Scanner;
public class YourInfo {
    /*
    Ask the user to enter their age (byte),
    ask them to enter their favorite number (long),
    and ask them to enter their favorite book
    Print all the values from the inputs
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you favorite book: ");
        String bookName = input.nextLine();

        System.out.print("Enter your age");
        byte age = input.nextByte();

        System.out.print("Enter your favorite number");
        long favoriteNum = input.nextLong(); // enter -= return
        ;

        System.out.println("information:");
        System.out.println("\t"+ age);
        System.out.println("\t"+ favoriteNum);
        System.out.println("\t"+ bookName);


    }
}
