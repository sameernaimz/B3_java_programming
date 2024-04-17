package day09_a_scanner;
import java.util.Scanner;
public class WorkStatus {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);

        System.out.print("Enter your first name: ");
        System.out.println("Enter your first name: ");
        String firstName = input.next();
        String lastName = input.next();

        System.out.print("Are you employed [TRUE/FALSE]");
        boolean isEmployed = input.nextBoolean();

        System.out.println("Are you a student [TRUE/FALSE]");
        boolean isStudent = input.nextBoolean();
        ;

        String personInfo = firstName + " " + lastName + " information: \n\tIs employed: " + isEmployed + "\n\tIs a student: " + isStudent;

        System.out.println(personInfo);

    }
}
