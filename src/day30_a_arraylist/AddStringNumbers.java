package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumbers {

    public static ArrayList<Integer> sumFromString (ArrayList <String> numsToSum) {

        ArrayList<Integer> sums = new ArrayList<>();
        for (String each : numsToSum) {
            int sumOfEach = 0;
            for (String eachLetter : each.split("")) {
                sumOfEach += Integer.parseInt(eachLetter);
            }
            sums.add(sumOfEach);
        }
        return sums;
    }

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>(Arrays.asList("123","34","513"));
        sumFromString(list);
    }


    }

