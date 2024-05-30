package day31_custom_classes;

public class ThiKeyword {

    // instance variable
    int a = 100;
    //          local variable
    public ThiKeyword (int a) {
        a = a;
        // how can I make a difference between LOCAL and INSTANCE variable if they are SAME
        System.out.println(a); // this is local variable --> a
        System.out.println(this.a); // this is INSTANCE variable -- > a
        this.a = 400;

    }
}
