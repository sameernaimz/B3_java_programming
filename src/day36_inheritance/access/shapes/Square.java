package day36_inheritance.access.shapes;

public class  Square extends Shape {
    int side;


    public Square( int side) {
        super("Square");
        this.side = side;

    }
    @Override
    public double area (){
        return side * side;
    }
    @Override
    public double perimeter(){
        return side * 4;
    }

    @Override
    public String toString(){
        return "Info about " + name + ": \nArea: " + area() + "\nPerimeter: " + perimeter() + "\nSide: " + side;
    }
    }

