package day09_a_scanner;

import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner Object declaration
        // Scanner input = input is the object reference name

        System.out.println("please, enter A number");

        //2 we get value of console
        int userNumber  = input.nextInt(); // return input as int
        System.out.println("You entered: " + userNumber);



    }
}
