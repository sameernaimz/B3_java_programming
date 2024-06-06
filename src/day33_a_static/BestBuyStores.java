package day33_a_static;

import java.sql.SQLOutput;

public class BestBuyStores {
    public static void main(String[] args) {


        BestBuy store1 = new BestBuy("Fairfax, VA");
        BestBuy store2 = new BestBuy("Bergenfield, NY");
        BestBuy store3 = new BestBuy("bOSTON, MA");

        System.out.println(BestBuy.headquarters);
        System.out.println(store1.headquarters);
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);

        System.out.println();

        store1.headquarters = "TYSONS 123 TEST ST VA, UNITED STATES";
        System.out.println(BestBuy.headquarters);
        System.out.println(store1.headquarters);
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);

        System.out.println();
        System.out.println(store2.location);
        store3.headquarters = "Chantillu, 987 Check DR, VA United States";
        store3.location = "Manhattan, NY";
        System.out.println(store1.location);
        System.out.println(store2.location);
        System.out.println(store3.location);

        System.out.println(store1.headquarters); // we can still call static by object reference but ioit is not good practice.
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);
        System.out.println(BestBuy.headquarters); //

        System.out.println("-----------------");
        store1.openStore();
        store2.openStore();
        store3.openStore();

        System.out.println("------------");
        BestBuy.reStock();
        store1.reStock(); // not good practice
        System.out.println(store1.numOfCompc);
        System.out.println(store2.numOfCompc);
        System.out.println(store3.numOfCompc);

    }
}
