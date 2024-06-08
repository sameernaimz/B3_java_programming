package day36_inheritance.final_examples;

public class FinalExample {

    // INSTANCE VARIABLES
    // final int z; // if variable is "Final" it MUST have initial value. Either directly assigned
  final  int a = 5;
    final int b;


    public static final String planet = "Earth";

    // if variable is "static final" - it is also called CONSTANT variable

    // You can also initialize the "public static final String PLANET" in the static block instead of on declaration.
    //static {
    //    PLANET = "Earth";
    //}

    // Other CONSTANT VARIABLE samples
    //Math.PI;
    //Integer.MAX_VALUE;

    public FinalExample(int b) {
        this.b = b;
    }
}
