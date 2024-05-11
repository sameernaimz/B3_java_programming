package day24_methods;

import java.util.Scanner;

public class Age {

    public static void getAge (int birthYear) {
        System.out.println("age:" + (2024 - birthYear));
    }

    public static void main(String [] args) {

        getAge(2000);

        int year = 1990;
        getAge(year);

        Scanner key =  new Scanner(System.in);
        System.out.println("when were you born");
        getAge(key.nextInt());
    }
}
