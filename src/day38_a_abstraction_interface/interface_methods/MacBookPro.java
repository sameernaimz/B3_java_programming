package day38_a_abstraction_interface.interface_methods;

public class MacBookPro implements Mac {

    @Override
    public void turnOn() {
        System.out.println("Turning on macbook");
    }
    class Runner {
        public static void main(String[] args) {



            //System.out.println(MacbookPro.NAME); // Still Good - You can use Child class name to reach static variables inherited from parent interface
            //System.out.println(MacbookPro.OS); // Still Good - You can use Child class name to reach static variables inherited from parent interface

            System.out.println(Mac.NAME); // Better to call with interface name
            System.out.println(Mac.OS); // Better to call with interface name



            Mac.company();
            //Mac.faceTime(); //default method needs to be called from object
            //Mac.turnOn(); // not valid. Since in Mac interface, there is no implementation of turnOn() method, cannot call it


            MacBookPro obj = new MacBookPro();
            obj.turnOn();
            obj.faceTime();
            //obj.company();  //static methods from INTERFACE, are not inherited, so they cannot be accessed from objects. only by interface can be accessed


        }


        }
    }

