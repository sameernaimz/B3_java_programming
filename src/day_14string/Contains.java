package day_14string;

import java.sql.SQLOutput;

public class Contains {
    public static void main(String[] args) {

        String weather = "today it was above 70";

        System.out.println(weather.contains("it was"));
        System.out.println(weather.contains("s"));
        System.out.println(weather.contains("a"));

        System.out.println(weather.contains("it was"));
        System.out.println(weather.contains("today"));
        System.out.println(weather.contains("today. it 70"));

        System.out.println(weather.contains("Today") && weather.contains("70"));
        System.out.println(weather.contains("Today && 70"));

    }
}
