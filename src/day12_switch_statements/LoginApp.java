package day12_switch_statements;
import java.util.Scanner;
public class LoginApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int actualPin = 4444;
        int actualSSN = 2314;

        System.out.print("Please enter your pincode: ");
        int userInputPin = input.nextInt();
        System.out.print("please, enter the last 4 digits of your SSN: ");
        int userInputSSN = input.nextInt();

        if (userInputPin == actualPin && userInputSSN == actualSSN) {
            System.out.println("Authentication is Successful!");
        } else {
            System.out.println("Authentication is Failed!");


            if (actualPin != userInputPin) {
            System.out.println("Incorrect pin");

            }

            if(actualSSN != userInputSSN) {
                System.out.println("Incorrect SSN");
            }
        }
    }

}
