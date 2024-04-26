package day16_loops;
import  java.util.Scanner;
public class MoveFirstWord {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("please, enter a sentence");
        String sentence = key.nextLine().trim(); // java is a Fun langauge



        // Take the part from sentence  - > .substring(0, indexOfFirstSpace)
        //                      How do I get indexOfFirstSpace - > .indexOf(" ");


        //int indexOfFirstSpace = sentence.indexOf(" ");
        //String firstWord = sentence.substring(0,  indexOfFirstSpace);

        String firstWord = sentence.substring(0,  sentence.indexOf(" "));

        //String restOfSentence = sentence.substring ( sentence.indexOf(" ")).trim();  // is a fun language

        String restOfSentence = sentence.substring ( sentence.indexOf(" ") + 1 );



        System.out.println(restOfSentence + " " +firstWord); // Java is a fun language Java

    }
}
