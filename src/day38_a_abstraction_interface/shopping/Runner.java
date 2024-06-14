package day38_a_abstraction_interface.shopping;

import java.sql.SQLOutput;

public  class Runner {
    public static void main(String[] args) {
        // Can I Create Object of shopping, Shipping, OnlineShopping
        // No, because Shopping is abstract class
        // NO, because Shipping is interface

        // Can I make object of  Target
        Target target = new Target();
        target.price = 10;
        System.out.println(target.price);
        target.buyItem();
       target.returnItem();
       //target. PayForShipping
        System.out.println("---------------");

        Amazon amazon = new Amazon();
        //amazon.price = 100;
        amazon.price = 100;
        System.out.println(amazon.price);
        amazon.buyItem();
        amazon.viewCart();
        amazon.returnItem();
        amazon.payForShipping(true);
        System.out.println(amazon.COUNTRY); // Not good practice
        System.out.println(Shipping.COUNTRY); // Good way to use
        System.out.println(Amazon.COUNTRY);  // Good way to use
        System.out.println(OnlineShopping.COUNTRY);  // Good way to use

    }
}
