package day44_maps_and_functions.buildn_functions;

import java.util.function.Predicate;

public class CallPredicateMethods {
    public static void main(String[] args) {
        boolean b = usePredicate.isPalidrome.test("racecar");
        System.out.println(b);
        System.out.println(usePredicate.isPalidrome.test("APPLE"));
        System.out.println(usePredicate.isPrime.test(7));

        System.out.println(usePredicate.isPrime.test(8));
    }
    }
