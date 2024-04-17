package day09_a_scanner;

import java.util.Scanner;
public class CompareNumbers {

    public static void main(String[] args) {
        // 2 -= we declare the scanner refrence and assign an object to it.
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter 1st number:");
        int num1  = input.nextInt();
        System.out.println("please, enter 2nd number");
        int num2  = input.nextInt();
        boolean arenumsequal = num1 == num2;
        System.out.println("The numbers are equal?" + arenumsequal);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("The number you entered");
    }


}