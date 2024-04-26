package AccountNumber;
//    Declare a variable account number (String). You will check if these account numbers are valid.
//        		-If the account number begins with a “2” the account number should be 7 characters long
//            			Print: "Valid 7-digit account number"
//            			Otherwise: "Invalid 7-digit account number"
//        		-If the account number begins with a “5” the account number should be 10 characters long
//            			Print: "Valid 5-digit account number"
//            			Otherwise: "Invalid 5-digit account number"
//        		-If the account number does not begin with a 2 or a 5
//            			Print "Invalid account number"
import java.util.Scanner;
    public class AccountNumber {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String accountNumber = key.next();


        if (accountNumber.startsWith("2") && accountNumber.length() == 7) {
            System.out.println( "Valid 7-digit account number");
    } else if (accountNumber.startsWith("2") && accountNumber.length() != 7) {

        }else if

}
