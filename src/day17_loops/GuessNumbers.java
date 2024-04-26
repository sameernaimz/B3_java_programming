package day17_loops;

import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[] args) {
        Scanner key  = new Scanner(System.in);
        int secretNumber = 40;
        int userGuess;

        do {
            System.out.print("Guess a number from 1 to 100: ");
            userGuess = key.nextInt();

            if (userGuess > secretNumber) {
                System.out.println(userGuess + " is higher. Guess again.");
            } else if (userGuess < secretNumber) {
                System.out.println(userGuess + " is less. Guess again.");
            }

        } while (userGuess != secretNumber);
        System.out.println("You guessed correctly.");
    }
}
