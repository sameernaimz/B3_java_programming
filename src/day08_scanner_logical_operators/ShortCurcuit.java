package day08_scanner_logical_operators;

public class ShortCurcuit {
    public static void main(String[] args) {

        //  System.out.println(5/0);
        System.out.println(true || 5/0 == 0); // short circuit or --= ||
        System.out.println(true || 5/0 == 0); // short circuit or --= ||
        //

        System.out.println (false && 5/0 == 0);


        int a = 0;
        System.out.println(false && a++ == 5);
        System.out.println(a);

        System.out.println(true && a++ == 5);
        System.out.println(a);

        int b = 0;
        System.out.println(false & b++ == 5);
        System.out.println(b);
    }
}
