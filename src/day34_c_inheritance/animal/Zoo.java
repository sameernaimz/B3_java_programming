package day34_c_inheritance.animal;

public class Zoo {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.type = "general Animal";
        a1.numberOfLegs = 0;
        a1.walk();
        //a1.roar(); // Invalid- parent class cannot access child class members.
        //a1.bark(); // Invalid - Parent class cannot access Child class members

        dog dog1 = new dog();
        dog1.type = "German Shepard";
        dog1.walk(); // Child class can access to paRENT Class members
        dog1.bark(); // Child class can access its own member
        //dog1.roar(); //  Invalid because neither Dog not animal class has method called roar()


        Lion lion1 = new Lion();
        lion1.type = "Arctic Lion";
        lion1.walk();
        //lion1.bark();

    }
}
