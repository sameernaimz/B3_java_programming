package day31_custom_classes;

public class Phone {
    String name;
    String brand;
    int memory;
    double version;


    public Phone (String name) {
        this.name =name; // phone1.name = name;
    }
    public Phone (String name,String brand, int memory, double version) {
        this.name =name; // phone1.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;
    }

    public Phone (String name,String brand) {
        this.name = name; // phone1.name = name;
        this.brand = brand;
    }
    @Override
    public String toString() {

        String str = name;

        if (brand != null) {  // if it is not default value
            str += " - " + brand;
        }

        if (memory != 0) {
            str += " - " + memory;
        }

        if (version != 0.0){
            str += " - " + version;
        }

//        return "Phone{" +
//                "name='" + name + '\'' +
//                ", brand='" + brand + '\'' +
//                ", memory=" + memory +
//                ", version=" + version +
//                '}';


        return str;
    }
}
