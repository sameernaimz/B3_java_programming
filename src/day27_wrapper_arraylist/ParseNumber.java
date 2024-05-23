package day27_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {
        String year = "2024";

        // normal concatenation
        System.out.println("Current Year:" + year);
        System.out.println("Next year will be: " + (year + 1));
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        Scanner key = new Scanner(System.in);
        System.out.println("Enter your message in this format: i am $x years old");
        String str = key.nextLine();

        String age = str.split("")[2];
        int ageInNum = Integer.parseInt(age);
        System.out.println("In 5 years, I will be" + (ageInNum)); // "30" ---- > // I am 30 years old -- > ["I", "am", "30", "years", "old"] [2]

        //System.out.println("In 5 years, I will be " + (age+5) + " years old"); //305
        System.out.println("In 5 years, I will be " + (ageInNum+5) + " years old");
    }
}
