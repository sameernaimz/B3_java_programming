package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {
        Integer [] arr ={1,2,3, 4, 5, 6, 7, 8, 9};
        Arrays.asList(arr); // Converted the array into a Collection type / Collection Data Structure (ArrayList)
        //
        ArrayList <Integer> l1 = new ArrayList<>(Arrays.asList(arr)); // created an ArrayList with values from array which was converted into collection type
        System.out.println(l1);
        //creating an ArrayList with some INITIAL vales
        ArrayList <Integer> l2 = new ArrayList<>(Arrays.asList(12,453,65,23,87,4,23,6));
        System.out.println(l2);

        ArrayList <String> l3 = new ArrayList<>(Arrays.asList("Java", "Python", "C#", "C++"));
        System.out.println(l3);
    }
}
