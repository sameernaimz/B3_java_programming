package day44_maps_and_functions.buildn_functions;

import java.util.function.Predicate;

public class usePredicate {
    public static Predicate<String> isPalidrome = (str) -> {
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);

    };
    public static Predicate<Integer> isPrime = (number) -> {
        int counter = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                counter++;

            }
        }
        if (counter == 2) {
            return true;
        } else {
            return false;
        }

    };
}
