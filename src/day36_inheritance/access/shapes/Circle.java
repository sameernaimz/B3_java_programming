package day36_inheritance.access.shapes;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        super("circle");
        this.radius = radius;
    }

    public double area() {
        return radius * radius * 3.14;
    }



    @Override
    public double perimeter() {
        return 2 * radius * 3.14;
    }

    @Override
    public String toString() {
        return "Info about" + name + ": \nArea: " + area() + "\nPerimeter: " + perimeter() + "\nRadius : " + radius;

    }
}
