package day37_a_abstraction.gym;

public class Gym {
    public static void main(String[] args) {
        // Exercise obj1 = new Exercise("Running");

     Running obj1 = new Running("Marathon");
     obj1.performExercise();
        System.out.println(obj1.burnCalories(10));
     Pullups OBJ2 = new Pullups("Crosfit");
     OBJ2.performExercise();
        System.out.println(OBJ2.burnCalories(10));
    }
}
