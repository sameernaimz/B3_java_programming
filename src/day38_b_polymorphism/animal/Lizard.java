package day38_b_polymorphism.animal;

public class Lizard extends Reptile {
    String skinColor;

   @Override
    public void eat() {
        System.out.println("Lizard is EATING");
    }
}
