package day35_inheritance.recap;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Hello", 6); // small, medium, large
        //p1.size = "Hello"; // Since it is encapsulated, cannot reach directly
        System.out.println(p1);
        // small, medium, large , xlarge
       // p1.size = "hello"; // since it encapsulated, cannot reach directly

        Pizza p2 = new Pizza("Medium", 6);
        System.out.println(p2);
    }
}


