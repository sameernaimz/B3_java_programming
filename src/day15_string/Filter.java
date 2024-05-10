package day15_string;
import java.util.Scanner;
public class Filter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter a message: ");
        String msg = input.nextLine();
        msg = msg.trim();
        String originalMsg = msg; // We have this container to hold the original message after trimmed. So, we can show it in the print statement
        msg = msg.toLowerCase();


        System.out.println("You entered: " + msg);



        boolean hasBadWords = msg.contains("java is bad") || msg.contains("quit") || msg.contains("have fun") || msg.contains("crying");

        if (hasBadWords) {
            System.out.println("Message failed to sent");
        } else {
            System.out.println("\"" +originalMsg + "\" was sent!");
        }

        System.out.println("You entered: " +  msg );
    }
}
