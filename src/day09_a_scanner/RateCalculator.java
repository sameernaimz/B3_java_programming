package day09_a_scanner;
import java.util.Scanner;
public class RateCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your salary? $");
        double salary = input.nextDouble();

        System.out.print("how many hours do you work in a week?");
        int hoursInWeek = input.nextInt();

        double hourlyRate = salary / (hoursInWeek + 52);

        System.out.println("With the annual salary of" + salary + " and working for " + hoursInWeek + " hours in a week, you hourly rate is $" + hourlyRate);

    }
}
