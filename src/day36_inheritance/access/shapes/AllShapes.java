package day36_inheritance.access.shapes;

public class AllShapes {
    public static void main(String[] args) {

        Circle obj1 = new Circle(4.5);
        System.out.println(obj1.area());
        System.out.println(obj1);

        System.out.println();

        Square obj2 = new Square(6);
        System.out.println(obj2.area());
        System.out.println(obj2);

    }
}
