package day32_custom_classes;

public class ChainExample {
    public ChainExample (double d) {
        this();
        System.out.println("fourth");
    }
    public ChainExample () {
        System.out.println("first");

    }

    public ChainExample(int i) {
        this();
        System.out.println("Second");
    }

    public ChainExample (String str) {
        this(4);
        System.out.println("Third");
    }


}
