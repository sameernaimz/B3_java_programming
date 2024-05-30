package day31_custom_classes;

import java.util.concurrent.Callable;

public class UseCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(car1);

        // car.model = 30; // since instannce method we cannot reach cLASS NAME
        car1.model= "Tesla";
        car1.year = 2020;
        car1.fuelLevel = 80;
        car1.color = "red";
        System.out.println();
        System.out.println(car1);

        System.out.println();
        car1.drive();
        car1.drive();
        System.out.println(car1.fuelLevel);

        System.out.println();
        car1.fillTank();
        System.out.println(car1.fuelLevel);
    }
}
