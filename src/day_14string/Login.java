package day_14string;
import java.util.*;
public class Login {
    public static void main(String[] args) {
        String expectedPassword = "loopcamp!";
        String expectedUsername = "JAVA";

        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter your username");
        String usernameFromUser = key.next();
        usernameFromUser = usernameFromUser.toLowerCase();

        System.out.println("Please, enter your password");
        String passwordFromUser = key.next();
/*

            check if the password is more than 8 characters long
            valid system password: "loopcamp"

            -> if the entered password matches the system password
                logged in

                otherwise print:

                invalid password

            check if the username is matching
         */

        if (passwordFromUser.length() > 8
                && expectedPassword.equals(passwordFromUser)
                && expectedUsername.equalsIgnoreCase(usernameFromUser) ){ // JAVA vs java
            System.out.println("LOGGED IN");

    }
}
