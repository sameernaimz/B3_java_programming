package day40_exception.learn_exc;

public class FirstTry {
    public static void main(String[] args) {
        System.out.println("First print out");

        String str = "loopcamp";
        //               0-7
        try {
            System.out.println(str.charAt(9));
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }

        System.out.println("Last print out");
    }
}
