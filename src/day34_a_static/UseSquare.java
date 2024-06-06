package day34_a_static;

public class UseSquare {
    public static void main(String[] args) {

        Square obj = new Square(5);
//      Obj.size = 5; // since size variable is private, cannot access directly

        System.out.println(obj.getSide());
        obj.setSide(11);
        System.out.println(obj.getSide() );
        System.out.println(obj);
    }
}
