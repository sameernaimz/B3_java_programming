package day36_inheritance.static_hide;

public class Game {
    public static void main(String[] args) {

        Sports.cheer();
        System.out.println();
        Sports.cheer();
        // if there is no same method declared in the child call ,it will sti;; ccall the parent
        // If there is same method declared in the child class, it will be depending on whether you are using Parent class to call or Child class
        // - if you use child class to call the same method,
    }
}
