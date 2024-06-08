package day36_inheritance.access.b;
// Different package, Different class
import day36_inheritance.access.a.First;

public class Third {
    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.one);// Since one has public access modifier, can be accessed
       // System.out.println(obj.two); // since two has protected Access modifier, and since there is no IS-A relation between Third class and Fist class and since these two classes are in two different packages cannot access
      //  System.out.println(obj.three); // since three has default access modifier, can access from anywhere in the package.
       // System.out.println(obj.four); // since four has private access modifier , can access from Only same PACKAGE

        Third obj2 = new Third();
        //Since there is no relation between the class which has members called one, two ,
        //Since third class has no members called one, two , three , four, we can not access
        //obj2.one;
        //obj2.two;
        //obj2.three;
        //obj2.four;

    }
}
