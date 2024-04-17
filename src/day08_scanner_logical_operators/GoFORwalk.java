package day08_scanner_logical_operators;

public class GoFORwalk {
    public static void main(String[] args) {
        //want to go for a walk
        // we will go for a walk if it is not raining and the weather is about 70


            boolean isRaining  = false;
            int temperature  = 80;

            System.out.println("Go for a walk: " +  (!isRaining && temperature > 70 )  );


        }
    }

