package day42_a_collection.classroom;

public class Student {
    String name;
    double age;
    int id;

    public Student(String name, double age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
