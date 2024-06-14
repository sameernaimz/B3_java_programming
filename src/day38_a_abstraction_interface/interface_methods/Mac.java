package day38_a_abstraction_interface.interface_methods;

import java.sql.SQLOutput;

public interface Mac {
    // we can have 4 things in Interface
    // Everything in interface has "public" access modifiers
    //#1 public static final variables -CONSTANTS
    String NAME = "MAC";
    String OS = "IOS";

    //#2 - Abstract method
    void turnOn(); // public abstract

    //Q: how do i have a method in interface with BODY / CODE BLOCK
    //A : 2 options -1) static method, 2) default method

    //#3 -1 - static method
    public static void company() {
        System.out.println("Apple");
        System.out.println("HQ is in LA");
        System.out.println("New Release normally is in Nov");

    }
        //4 -2 ) default method
        // NOTE : "Default" here is NOT ACCESS MODIFIER
        public default void faceTime() {
            System.out.println("Opening Facetime");
            System.out.println("Calling someone");
        }
    }

