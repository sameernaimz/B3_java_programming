package day38_b_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {

        //All possible reference / object - Lizard
        //Itself
        Lizard l1 = new Lizard();
        l1.eat();
        l1.name = "Lizard";
        System.out.println(l1.name);

        //2- all possible reference/ object - Reptile
        Reptile r1 = new Reptile();
        r1.eat();
        r1.name = "Reptile";
        System.out.println(r1.name);


        // Reference Super/Parent
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
    }
}
