package day36_inheritance.access.b;

import day36_inheritance.access.a.First;

import java.sql.SQLOutput;

// Different package - Different class - but there INHERITANCE
public class Fourth extends First {
    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.one); // Since one has public access modifer,l can access from package
     //   System.out.println(obj.two);
      //  System.out.println(obj.three);
       // System.out.println(obj.four);

        Fourth obj2 = new Fourth();
        System.out.println(obj2.one); // since one has public access modifier can access from anywhere in the package
        System.out.println(obj2.two); // Since two has protected access modifier, and Since there IS-A, Since, accessible members from Parent can Inherit to Child
       // System.out.println(obj2.three);
      //  System.out.println(obj2.four):
    }
}
