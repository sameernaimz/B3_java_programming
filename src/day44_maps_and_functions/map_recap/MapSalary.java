package day44_maps_and_functions.map_recap;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSalary {
    public static void main(String[] args) {

        Map<String, Double> map = new HashMap();
        map.put("JeyhuN", 110_000.0);
        map.put("gEDI", 120_000.0);
        map.put("elina", 105_000.0);
        map.put("OlexandrS", 130_000.0);
        map.put("OlwxandrM", 100_000.0);
        map.put("Andrew", 125_000.0);
        map.put("Laura", 135_000.0);
        map.put("Ayaz", 140_000.0);

        // Find the person and yhr salary who is making the HIGHEST SALARY and LOWEST SALARY
        // MAX SALARY: $name - $$salary
        // MIN SALARY : $name - $$salary

        String namForHighestSalary = "";
        double maxSalary = 0.0;

        String namForLowestSalary = "";
        double minSalary = Double.MAX_VALUE; // 1.7976931348623157E308


        for(String eachName : map.keySet()) {

           // System.out.println("Each Name : " + eachName);
          //  System.out.println("Each related salary : " + map.get(eachName));
          //  System.out.println();

            double salaryForEachName = map.get(eachName);

            if(salaryForEachName > maxSalary) {
                maxSalary = salaryForEachName;
                namForHighestSalary = eachName;
            }
            if(salaryForEachName < minSalary) {
                minSalary = salaryForEachName;
                namForLowestSalary = eachName;
            }
        }
        System.out.println("MAX SALARY: " + namForHighestSalary + "-$" + maxSalary);
        System.out.println("MIN SALARY: " + namForLowestSalary + "-$" + minSalary);

        // Find for these data, how many people make salary between 130k and 160k (Both Inclusive)
        // $number of people makes salary between 130K AND 160K
        int counter = 0;

        for(Double eachSalary :map.values()) {
            if(eachSalary >= 130_000.00 && eachSalary <= 160_000) {
                counter++;


            }
        }
        System.out.println(counter + "of people makes salary between 130K AND 160K");

        System.out.println("-----------------------");
        // Find me the names who make salary less than 130K
        // $name1, $name2 ... makes salary less than 130K
        List<String> names = new ArrayList();
        for( String eachName:map.keySet()) {
            if(map.get(eachName) < 130_000.00) {
                names.add(eachName);

            }
        }
        System.out.println(names.toString().replace("[", "").replace("]", "") + "makes salary less than 130K");
        System.out.println("-----------------------");
        // Increase salary for everyone by 10K$ in the data structure (map)
        System.out.println("Before increase: "+ map.values());
        for( String eachName : map.keySet()) {
            map.put(eachName, map.get(eachName) + 10_000.0);

        }
        System.out.println("After Increase: "+ map.values());
    }
}