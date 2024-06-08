package day36_inheritance.access.a;
// Same package _ Different class
public class second {
    public static void main(String[] args) {

        First obj = new First();
        System.out.println(obj.one); // since one has public access modifier,
        System.out.println(obj.two); // Since two has protected access modifier, can access from anywhere in the same package
        System.out.println(obj.three);// Since three has  default access modifier, can access from anywhere in the packager
        // System.out.println(obj.four); // since four has private access modifier cannot reach package

        second oj2 = new second();
        //Since there is no relation between the class which has members called one, two, three, four, we can not access
        //Since Second class has no members called one, two, three, four, we can not access
        //obj2.one;
        //obj2.two;
        //obj2.three;
        //obj2.four;,



    /*





     */
    }
}