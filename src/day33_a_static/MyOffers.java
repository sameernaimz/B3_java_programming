package day33_a_static;

import day32_custom_classes.Offer;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer first = new Offer("Texas", "Google", 125_000, true, 15);
        System.out.println(first);

        ArrayList <Offer> offerList = new ArrayList<>(); // Created an ArrayList that will hold offer objects

        offerList.add(first); // added the first object of Offer in to ArrayList Offer

        offerList.add(new Offer("New York" , "Amazon", 130_000.00, true,15));
        //ADDED ANOPTHER OBJECT INTO ARRAYLIST OF OFFER DIRECTLY.

        System.out.println("-----------------");
        System.out.println(offerList);

        Offer [] MOREOFFERS = {
                new Offer ("chicaago", "Apple", 140_000, false, 10),
                new Offer ("chicaago", "tESLA", 140_000, false, 20),
                new Offer ("chicaago", "facebook", 140_000, false, 20),
        };
        System.out.println(Arrays.toString(MOREOFFERS));


        System.out.println("-0----------");
        offerList.addAll(Arrays.asList(MOREOFFERS));
        System.out.println(offerList);

        //Can you store offers which is equalv or more than 130_000 into another ArrayList
        ArrayList <Offer> salaryMoreList = new ArrayList <> (offerList);
        salaryMoreList.removeIf(eachOffer -> eachOffer.salary < 130000);
        System.out.println("List of Offers with more salaries");
        System.out.println(salaryMoreList);



        // Can you find the Full Time offers
        ArrayList <Offer> fullTimeList = new ArrayList <> (offerList);
        fullTimeList.removeIf(each -> !each.isFullTime);
        System.out.println("List of oOffers with Full Time:");
        System.out.println(fullTimeList);


    }
}
