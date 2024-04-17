package day12_switch_statements;
import java.util.Scanner;
public class Browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your browser: ");
        String browserType = input.next();

        switch (browserType) {

            case "Chrome" :
            System.out.println("Opening google in Chrome browser.");
            break;
            case "Fairfox" :
                System.out.println("Opening google in fairfox browser.");
                break;
            case "Safari" :
            case "safari" :
                System.out.println("opening in Safari Browser.");
                break;
            default:
                System.out.println("We do not have" + browserType + "Browser type or it is invalid one");
        }

    }
}
