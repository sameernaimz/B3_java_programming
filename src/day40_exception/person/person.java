package day40_exception.person;

public class person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(name == null || name.isEmpty()) {
           // System.out.println("cannot assing");
            throw new Exception("Name cannot be empty");
        } else {
            this.name = name;
        }

    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) {
            throw new IllegalArgumentException("Age must be between 0 and 100");
        }
        this.age = age;
    }
}
