package day24_methods;


public class MyMatchClass {

    public static void add (int num1, int num2) {
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
    }

    public static void minus (int num1 , int num2) {
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
    }
    public static void multiply (double num1, double num2) {
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
    }
    public static void divide (double num1, double num2){
        System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
        if(num2 == 0) {
            System.out.println("cannot divide by 0");
        } else {
            System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
        }


    }
    public static void main(String[] args) {

    }
}
