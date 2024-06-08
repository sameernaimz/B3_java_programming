package day36_inheritance.static_hide;

import org.w3c.dom.ls.LSOutput;

public class CallMethod {
    public static void main(String[] args) {


        A obj1 = new A();
        obj1.instanceMethod();
        A.staticMethod();

        System.out.println();
        B obj2 = new B();
        obj2.instanceMethod();
        B.staticMethod();
    }
}