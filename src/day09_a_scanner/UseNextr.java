package day09_a_scanner;
import java.util.Scanner;
public class UseNextr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is today");
        String day = input.nextLine();

        System.out.println("Enter your first name");
        String firstName = input.next();

        String address = input.nextLine();

        System.out.println("Enter your last name");

        String lastName = input.next();
        input.nextLine();

        System.out.println("Enter your address");

        System.out.println("Enter job title");
        String jobTitle = input.nextLine(); // Here we did not need to handle it because it is required for any OTHER Scanner methods if they before nextLine();


        System.out.println("Today:" + day);
        System.out.println("First Name:"+ firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("Job Title: " + jobTitle);

        //
    }
}
