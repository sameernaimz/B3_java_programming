package day28_arraylist;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        nums.add(100);
        System.out.println(nums);

        // it will dfind the index of the first match
        System.out.println(nums.indexOf(100));

        System.out.println(nums.indexOf(400));

        int index = nums.indexOf(500);
        System.out.println(index);


    }
}
