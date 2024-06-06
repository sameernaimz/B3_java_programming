package day33_b_encapsulation.access_modifers;

public class AccessModifiers {
    public int a; // INSTANCE VARIABLE - PUBLIC ACCESS MODIFIER
    int b; // INSTANCE VARIABLE - DEFAULT ACCESS MODIFIER
    private int c; // INSTANCE VAR - public access modifier

    public static int x; // STATIC Variable - public access modifier
    static int y; // STATIC VARIABLE - Default access modifier
    private static int z; // STATIC VARIABLE - private access modifier
    //In the SAME CLASS - SAME PACKAGE (aUTOMATICALLY
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

    }
    }
