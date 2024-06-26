package day42_b_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarOutputStream;

public class HashMapObject {
    public static void main(String[] args) {

        //Map works with KEY - VALUE
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(3, "three");
        map.put(10, "ten");
        map.put(5, "five");

        System.out.println(map); // Insertion order in HashMap is random

        //Q: How do we read key/value from map
        System.out.println(map.get(10)); //  This is NOT index. It is the KEY Object
        String value = map.get(3); // This returns the value assigned to KEY (3) -- > "three"
        System.out.println(value);

        //Q: hOW DO I REMOVE THE KEY/VALUE
        map.remove(1);
        System.out.println(map);

        //Q: How can I check if the specific KEY is in the Mao
        //A : ContainsKey(KEY);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(3));

        System.out.println(map.containsValue("five"));
        System.out.println(map.containsValue("10"));
        //System.out.println(map.containsValue(10)); //since containsValue(Object obj) method a

        // HashMap CAN ACCEPT NULL --> AS KEY AND AS VALUE
        map.put(null, null);
        System.out.println(map);


        map.put(5, "fivefive"); // Since KEY in map, does NOT allow duplicates, it will update the value of the KEY if it already exist
        System.out.println(map);

        map.put(null, "java"); // null KEY already existed, so I updated VALUE
        System.out.println(map);

        map.put(null, "api"); // null KEY already existed, so I updated VALUE
        System.out.println(map);


        map.put(3, "March");
        System.out.println(map);

        map.put(7, "March"); // Dupicate VALUEs are ok but duplicate KEYs are not ok
        System.out.println(map);


// This is holding Map as a VALUE inside anther Map
        System.out.println();

        Map <String, Map<String, String>> infoPeopleAndCountry = new HashMap<>();

        Map <String, String> mapOne = new HashMap<>();
        mapOne.put("Tom", "Jerry");
        mapOne.put("Mickey", "Mouse");

        Map <String , String> mapTwo = new HashMap<>();
        mapTwo.put("Turkey", "Ankara");
        mapTwo.put("Azerbaijan", "Baku");

        infoPeopleAndCountry.put("people", mapOne);
        infoPeopleAndCountry.put("countries", mapTwo);
        System.out.println(infoPeopleAndCountry);
        //infoPeopleAndCountry.put(3, map); //can NOT add it because it is <Integer, String>
        System.out.println(  infoPeopleAndCountry.get("countries")  );
        System.out.println(  infoPeopleAndCountry.get("countries").get("Turkey")  );


    }
}
