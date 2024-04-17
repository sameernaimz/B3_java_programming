package day08_scanner_logical_operators;

public class OrPractice {
    public static void main(String[] args) {
        int apple = 5;
        int oranges = 10;

        System.out.println(apple > 1 || oranges < 5);
        //                  t/f
        System.out.println(apple > 10 || oranges == 10);

        System.out.println(apple > 10 && oranges == 10);
        // since this is && and FIRST part is false, I actually do not need to check the 2nd side.
        // Because, only true && true can give TRUE
        //                  false && true
        //                  false


    }
}
