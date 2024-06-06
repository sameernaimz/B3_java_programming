package day34_c_inheritance.animal.person;

public class School {
    public static void main(String[] args) {

        Person p = new Person();
        p.name = "general name";
        p.age = 0;
        p.talk();
        //p.study(); // Parent class cannot reach anythinh from child

        Student s1 = new Student();
        s1.name = "Winnie"; // Child class can access to Parent class members
        s1.age = 18; // Child class cab access to parent class members
        s1.talk(); // Child class can access to Parent class members
        s1.study(); // Child class can access to own members
        s1.isHappy = true;
    }

    }
