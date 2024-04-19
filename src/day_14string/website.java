package day_14string;

import java.util.Scanner;
/*
    Ask the user to enter a website
    check if it is a valid website

    - it is valid if it begins with:
        www.

    - it is valid if the end is:
        .com
        .edu
        .gov
        .net

      in cases it is not valid, tell the reason why

 */
public class website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String url = input.next().toLowerCase(); // WWw.loopcamp.io

        boolean isValidStart = url.startsWith("www.");
        boolean isValidEnd = url.endsWith(".com")  || url.endsWith(".edu") || url.endsWith(".gov") || url.endsWith("Net") || url.endsWith("io"); // www.google.com

        if(isValidStart && isValidEnd) {
            System.out.println("IT IS A VALID WEBSITE");

        } else {
            System.out.println("IT IS INVALID WEBSITE");

            if (isValidStart){
                System.out.println("it esd invalid start");

            }

            if(isValidEnd) {
                System.out.println("it was invalid end");

            }
        }

    }

}
