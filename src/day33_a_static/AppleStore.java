package day33_a_static;

import org.w3c.dom.ls.LSOutput;

public class AppleStore {
    public static void main(String[] args) {


        iPhone phone = new iPhone("Iphone 14 pro", 1099.00);
        System.out.println(phone);

        iPhone phone2 = new iPhone("iphone 15 pro max", 1199.00);
        System.out.println(phone2);

        System.out.println(iPhone.company);
        System.out.println(iPhone.os);
    }
}