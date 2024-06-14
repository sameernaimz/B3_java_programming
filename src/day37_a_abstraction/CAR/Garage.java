package day37_a_abstraction.CAR;

public class Garage {
    public static void main(String[] args) {

       // car obj1 = new car(); // WE CANNOT CREATE THE OBJECT OF ABSTRACT CLASS
       // obj1.start();

        Toyota obj2 = new Toyota();
        obj2.start();

        Honda obj3 = new Honda();
        obj3.start();

        // Both Toyota and Honda are CONCRETE classes
        // Because they're not ABSTRACT Class , we had to implement abstracted

        //ElectricCar obj4 = new Electric Car(); // We CANNOT create the object
        System.out.println();

        Tesla obj5 = new Tesla();
        obj5.start();
        // .start(); //It was Defined in car but implented in teslac class
        obj5.charge();
        //. charge(); // it was DEFINED in ElectricCar class but implemented in Tesla Class

        // Tesla is a non
        }
    }

