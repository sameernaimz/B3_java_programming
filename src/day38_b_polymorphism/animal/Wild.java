package day38_b_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {

        //All possible reference / object - Lizard
        // rREFERENCES Itself
        Lizard l1 = new Lizard();
        l1.eat();
        l1.name = "Lizard";
        l1.numOfLegs = 10;
        System.out.println(l1.name);
        System.out.println(l1.numOfLegs);
        System.out.println(l1.skinColor);
        System.out.println();
        //2- all possible reference/ object - Reptile
        Reptile r1 = new Reptile();
        r1.eat();
        r1.name = "Reptile";
        System.out.println(r1.name);

        //Refrence - Parent
        Reptile r2 = new Lizard();
        r2.eat();
        r2.name = "Lizard";
        r2.numOfLegs = 12;
        // r2.skinColor = "Camo2"; // Reptile reference does not have access to var
        System.out.println(r2.name);
        System.out.println(r2.numOfLegs);
        System.out.println();

        //  Reference - Grand Parent
        Animal r3 = new Lizard();
        r3.eat();
        r3.name = "Lizard";

        //All possible reference / object - Reptile
        //Reference Itself- Reptile
        //Reference Parent- Animal
        // Animal r1 = new Reptile();
        // r1.numOfLegs = 20;

        /**
         * We created 3 objects of Lizzard
         *  1 - Reference was ITSELF - Lizzard
         *  2 - Reference was Parent class - Reptile
         *  3 - Reference was GRAN Parent class - Animal
         */

    /*    // Reference Super/Parent
        Animal l2 = new Lizard();
        // reach the eat() from parent but run the version from object
        // if child does not have overriden version of eat(), then it will run the one from
        l2.eat();





        Animal r2 = new Reptile();
        r2.eat();
        // the reference side DETERMINES the accessibility
        //Refrence Super/Parent
        Animal a1 = new Lizard();

        String str = new String("Hi");
        Object o = new String("Bye");
        */

    }
}
