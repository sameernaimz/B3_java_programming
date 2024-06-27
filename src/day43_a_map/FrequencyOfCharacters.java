package day43_a_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String word = "loopcamp";
        frequencyOfCharacters(word);
    }
    /*
    l-1
    o-2
    p-2
    c-1
    a-1
    m-1
     */
    public static void frequencyOfCharacters(String word) {
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < word.length(); i++) { // loop through word and get each char
            char eachChar = word.charAt(i);
            if (!map.containsKey(eachChar)) {
                map.put(eachChar, 1);
            } else { // if KEY already has it
                map.put(eachChar, map.get(eachChar) + 1);
            }
           //


        }
        System.out.println(map);
    }
}
