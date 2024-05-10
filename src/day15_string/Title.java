package day15_string;
import java.util.Scanner;
public class Title {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String name = key.nextLine().toLowerCase();

        if (name.startsWith("mr.") || name.startsWith("mister") ) {
            System.out.println("Hello Sir.");

        } else if (name.startsWith("ms.") || name.startsWith("miss,") || name.startsWith("madam")) {
            System.out.println("Hello MA'AM.");
        } else if (name.startsWith("dr.")) {
            System.out.println("hello doctor.");
        }
        if (name.endsWith("sr.")) {
            System.out.println("Nice to meet you Senior");
        } else if (name.endsWith("jr.")){
            System.out.println("Nice to meet you Junior");
        }
    }
}
