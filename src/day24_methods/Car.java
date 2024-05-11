package day24_methods;
/*
unlock car
open the door
sit in the car
close the door
put the seatbelt on
start the engine
put into drive and go
 */
public class Car {
    public static void unlockCar () {
        System.out.println("Unlocking the car");
    }

    public static void openDoor () {
        System.out.println("Unlocking the car");

    }
    public static void getInTheCar () {
        System.out.println("Sitting in the car");
        System.out.println("closing the door");
    }
    public static void getReady () {
        System.out.println("Put the seatbelt on");
        System.out.println("check the mirrors");
        System.out.println("put the music on");
        System.out.println("put the navigation");
    }
    public static void startCar() {
        System.out.println("Starting car");
    }
    public static void driveAndGo () {
        System.out.println("Putting gear into D");
        System.out.println("Press gas to go forward");
    }
    public static void goInHurry (){
        unlockCar();
        openDoor();

        getInTheCar();

        getReady();

        startCar();
        driveAndGo();
        System.out.println("|-=-=");
        goInHurry();
        goInHurry();
    }

    public static void main(String[] args) {
        unlockCar();
        unlockCar();
        unlockCar();
        openDoor();

        getInTheCar();

        getReady();
        driveAndGo();
    }
}

