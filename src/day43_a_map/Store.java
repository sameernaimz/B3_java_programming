package day43_a_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Map <String,Double> store = new HashMap();
        store.put("Water",1.0);
        store.put("Coffee",2.0);
        store.put("Apple",3.0);
        store.put("Bread",4.0);
        store.put("Milk",5.0);

        /*
           Store inventory
           Item: $itemName for $$price
           ........
         */
        System.out.println("Store Inventory");

        for(String eachItem : store.keySet()){ // we uused .KeySEt() method to get all the KEYs and loop through them to get each key
            System.out.println("\tItem: " + eachItem + "for $ " + store.get(eachItem)); // In print statement, we used each KEY that we are getting each cycle

        }
        System.out.println("------------------");
        // OPTION 2
        System.out.println("Store Inventory");
        for(Map.Entry<String,Double> eachPair : store.entrySet()){
            System.out.println("\tItem: " + eachPair.getKey() + "for $ " + eachPair.getValue());
        }
        System.out.println("------------------");

        // How to get all the values?
        System.out.println(store.values()); // will return all the values as Collection

        System.out.println("------------------");
        System.out.println("What item do you want? ");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        System.out.println(store.containsKey(item)? item + "Is in stock for $" + store.get(item):item + "Not in stock");
    }
}
