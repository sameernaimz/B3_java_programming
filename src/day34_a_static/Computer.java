package day34_a_static;
/*
    Computer - static

    class name: computer:
        instance variables:
            price, brand, color, ...

        static variables: hasScreen, hasBattery, hasMemory

        make objects of the class in a main method and access both instance and static members from proper references

 */
public class Computer {
    // Instance variables - each object has its own Copy
    double price;
    String brand;
    String color;
    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    static {
        System.out.println("Running static block");
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;
        // price = 50; --> static accepts only static

    }

public Computer (double price, String brand, String color) {
    System.out.println("Running Constructor");
    this.price = price; //comp1.price = 500.00
    this.brand = brand;
    this.color = color;

}

}
