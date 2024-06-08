package day36_inheritance.static_hide;

public class Soccer extends Sports {

   // @Override - static methods do NOT get Overridden
    public static void cheer() {
        System.out.println("Cheering from the Parent Class");

    }
    /*
    Note:
    it looks like we are overriding  but we are NOT, because the method is - static
    we aare hiding the cheer() method from parent class
     */
}
