package day38_a_abstraction_interface.animal;

import day37_a_abstraction.Language.Language;

public class Parrot extends Bird implements Flyable, Language {
    @Override
    public void useWings() {
        System.out.println("Parrot is using wings to fly");
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating seeds");
    }

    public void fly() {
        System.out.println("Parrot is flying");
    }
    @Override
    public void hi() {
        System.out.println("Parrot is hiing");
    }

    @Override
    public void bye() {
        System.out.println("BYE BYE BYE BYE ");
    }
}
