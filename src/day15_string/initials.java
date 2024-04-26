package day15_string;
import java.util.Scanner;
public class initials {
    public static void main(String[] args) {

            Scanner key = new Scanner(System.in);
            System.out.print("Please, enter your first name: ");
            String firstName = key.next().toUpperCase().trim(); // _tom -- > TOM, Tom --- > TOM
            System.out.print("Please, enter your last name: ");
            String lastName = key.next().toUpperCase().trim();

            char first = firstName.charAt(0);
            char last = lastName.charAt(0);

            System.out.println("" + first + last);
        }
}
