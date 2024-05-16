package day17_loops;
import java.util.Scanner;;
public class ShoppingList {
    public static void main(String[] args) {

        Scanner key = new Scanner (System.in);
        String list = "Shopping list";
        String userAnswer;
        do {
            System.out.println("please, enter the name of the item:");
            String userItem = key.nextLine();
            list = list + "\n\t" + userItem;

            System.out.println("DO YOU WANT TO ADD MORE ITEM");
            userAnswer = key.nextLine();

        } while ( userAnswer.equalsIgnoreCase("yes")) || userAnswer.equalsIgnoreCase("y");
        System.out.println(list);
    }
}
