package day24_methods;

public class VoidVsReturn {
    public static void main(String[] args) {

       // String str = sayHello(); // void method cannot reassign
        sayHello();
        sayHello2();

    }

    public static void sayHello () {
        System.out.println("HELLO");
    }

    public static String sayHello2 () {
        String result = ("hello");
        return result;
    }
}
