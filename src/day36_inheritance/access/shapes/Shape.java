package day36_inheritance.access.shapes;

public class Shape {
    String name;

    public Shape(String name) {
        super();
        this.name = name;

    }
    // This an area method - general method.
    public double area (){
        return 10.0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }

    public double perimeter() {
        return 0.0;

    }
}
