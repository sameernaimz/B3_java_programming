package day15_string;
import java.util.Scanner;
public class LongestWithA {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter three words:");
        String word1 = key.next();
        String word2 = key.next();
        String word3 = key.next();

        int wordOneLength = word1.length();
        int wordTwoLength = word2.length();
        int wordThreeLength = word3.length();

        if(wordOneLength > wordTwoLength && wordTwoLength > wordThreeLength) {
            System.out.println(word1 +"is biggest  and has the \"a\" in it");

        } else if (  word2.contains("a") && wordTwoLength > wordOneLength && wordTwoLength > wordThreeLength) {
            System.out.println(word2 + " is biggest and has the \"a\" in it");
        } else if ( word3.contains("a") && wordThreeLength > wordOneLength && wordThreeLength > wordTwoLength ) {
            System.out.println(word3 + " is biggest and has the \"a\" in it");
        } else {
            System.out.println("There is no single biggest word or biggest word does not have \"a\" in it");
        }


    }
}

