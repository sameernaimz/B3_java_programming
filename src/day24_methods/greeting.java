package day24_methods;

import java.util.Scanner;


public class greeting {
    public static void hello (String name) {
        System.out.println("hello" + name + "!. HOW ARE YOU?");

    }
    public static void main(String[] args) {

        hello("Tom");
        hello("jake");

        Scanner key = new Scanner(System.in);
        System.out.println("please, enter your name: ");
        String name = key.nextLine();

        hello(name);

    }
}
