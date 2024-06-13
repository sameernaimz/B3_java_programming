package day36_inheritance.final_examples;

public class Main {
    public static void main(String[] args) {

        new Parent().walk();
        new Child().walk();


        A obj1 = new A();
        System.out.println(obj1.a);
        B obj2 = new B();
        System.out.println(obj2.b);
        //C obj3 = new C();
        //System.out.println(obj3.a);

    }
}

class Parent {
    public final void walk() {
        System.out.println("Parent walking");
    }
    // final method - CANNOT BE Overridden in child class. We restrict it.
    /// with this restriction, we force all the child class objects to use the same implementation of walk();
}
class Child extends Parent {}
//    @Override
 //   public void walk() {
 //   System.out.println("Child walking");
 //   }
class A {
    int a;
    String b;

    public void tst(){

    }
}


final class B extends A{

}

//class C extends B{
//

