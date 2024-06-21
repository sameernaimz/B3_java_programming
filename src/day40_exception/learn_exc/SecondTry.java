package day40_exception.learn_exc;

public class SecondTry {
    public static void main(String[] args) {
        try {


            //String s = "loop";
            String s = null;
            System.out.println(s.length());

            int[] a = {1, 2, 3, 4, 5};
            System.out.println(a[0]);
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException catched");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException catched");
        }

    }
}
