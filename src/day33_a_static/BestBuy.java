package day33_a_static;

public class BestBuy {
    //INSTANCE VARIABLE - THEY BELONG TO OBJECT
    String location;

    //STATIC VARIABLE - THEY BELONG TO CLASS
    static String headquarters = "Richfield, United, States";
    static int numOfCompc = 100;
    static String specialDay = "Wednesday";

    public BestBuy (String location) {
        this.location = location;

    }
        // INSTANCE METHOD
    public void openStore() {
        System.out.println("Opening the location in " + location);
    }
    public static void reStock () {
        System.out.println("Today is" + specialDay + "special day and we are restocking");
        numOfCompc = 200;

    }
}
