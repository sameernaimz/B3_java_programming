package day31_custom_classes;

public class UseMarker {
    public static void main(String[] args) {


//        Marker marker1 = new Marker();
 //       marker1.type = "Dry color";
 //       marker1.brand = "Sharpie";
 //       marker1.color = "blue"

        Marker marker1 = new Marker("Dry Color", "Sharpie", "Black");
        System.out.println(marker1);

        System.out.println();
        Marker marker2 = new Marker("Oil color", "EXPO", "red");
        System.out.println(marker2);

    }
}
