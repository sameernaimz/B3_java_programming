package day37_a_abstraction.gym;

public class Pullups extends Exercise {

    public Pullups(String name) {
        super(name);
    }

    public void performExercise() {
        System.out.println("Doing pull ups" + name);
    }
    public int burnCalories (int minutes) {
        return minutes * 15;
    }
}
