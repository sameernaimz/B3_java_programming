package day11_if_statements;

public class AmazonPrime {
    public static void main(String[] args) {
        double price = 25.99;
        boolean hasPrime = false;


        // Outer IF
        if (hasPrime) {
            System.out.println("Eligible for 2 days shipping.");



        }  else {

            // INNER IF
            if (price >= 25) {
                System.out.println("Eligible for regular free shipping");
            } else {

                System.out.println("Not eligible for free shipping. Shipping fee: 3.99");
                price = price + 3.99;
            }

        }


        System.out.println("The final price is $" + price);

    }

}
