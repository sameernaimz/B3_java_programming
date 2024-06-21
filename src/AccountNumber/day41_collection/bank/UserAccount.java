package AccountNumber.day41_collection.bank;

import org.w3c.dom.ls.LSOutput;

import javax.security.auth.login.AccountNotFoundException;

public class UserAccount {
    public static void main(String[] args) {

        Bank account1 = new Bank();
        account1.balance = 1_000;
        try {
            account1.withdraw(600);
            System.out.println(account1.balance); //400

            account1.withdraw(500);
            System.out.println(account1.balance); //-100
        } catch (NotEnoughBalanceException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        System.out.println(account1.balance);
        System.out.println("Continue...");
        try {
            account1.login("loopcamp", "Test123@");

        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());

        }
        System.out.println("DONE");
    }
}
