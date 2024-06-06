package day33_b_encapsulation.traffic;

public class Road {
    public static void main(String[] args) {


        //TrafficLight light = new TrafficLight();
        //light.color = "red";
        //System.out.println(light.color);

        // light.color = "Purple";

        TrafficLight light = new TrafficLight("Yellow");
        System.out.println(light.getColor());

        TrafficLight light2 = new TrafficLight("Green");
        System.out.println(light.getColor());
        light2.setColor("Green");
        System.out.println(light2.getColor());

    }
}
