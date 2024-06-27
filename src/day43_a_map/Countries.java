package day43_a_map;
import java.util.*;
import java.util.Map;

public class Countries {
    public static void main(String[] args) {

        // Map Works with ----> KEY: VALUE
        // KEY: VALUE (ENTRY) -> DATA HAS TO BE PRIMITIVE
        //String, "String,String,String"
        // I created a HashMap that has:
        // KEY of string type (countries)
        // VALUE of ArrayList of String(cities)
        Map<String,ArrayList<String>> countries = new HashMap<>();
        countries.put("USA",new ArrayList<>(Arrays.asList("New York","New Jersey","Virginia", "boston")));
        countries.put("France",new ArrayList<>(Arrays.asList("Lyon","Paris")));
        countries.put("canada", new ArrayList<>(Arrays.asList("Toronto","Vancouver","ontario")));


        //How do i Print the Map
        System.out.println(countries);

        System.out.println("--------------------");
        // Print all cities which has "i" in it
        for (String eachListOfCities : countries.keySet()){  // this will loop through the all KEYS
            System.out.println(countries.get(eachListOfCities));

            for ( String eachCity : countries.get(eachListOfCities)){ // this will loop through the element of each ArrayList value
                if(eachCity.contains("i")){
                    System.out.println(eachCity);
                }
            }
        }


        System.out.println("--------------------");
        for (ArrayList <String> eachList : countries.values()){

            for (String eachCity : eachList){

                if (eachCity.contains("i")){
                    System.out.println(eachCity);
                }
            }

        }


        System.out.println("--------------------");
        // Let ask a user which city they want to visit?
        System.out.println("Which city do you want to visit?");
        Scanner input = new Scanner(System.in);
        String userWishCity = input.nextLine();



        //if the city is in our tour, we can say: "We have a flight on Sunday".
        for ( ArrayList <String> cityList : countries.values()){

            if (cityList.contains(userWishCity)){
                System.out.println("We have a flight on Sunday to " + userWishCity);
            }



        }
            }
        }


