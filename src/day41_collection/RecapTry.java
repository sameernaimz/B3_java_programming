package day41_collection;

import java.util.ArrayList;

public class RecapTry {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("api");
        list.add("ci/cd");
        try {
            System.out.println(list.get(1));
            String s = null;
            s.toLowerCase();


        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

            //e.printStackTrace();
            System.out.println("Index Out of BoundsException");
        } catch (NullPointerException e) {
            System.out.println("No Object found");
        }
        System.out.println(list);


        System.out.println("Done");

        try {
            Thread.sleep(2);
        } catch (InterruptedException | IllegalArgumentException e) {
            System.out.println("Number is wrong");

        } finally {
            System.out.println("This will always run");
        }
        System.out.println("FINAL");
    }

}
