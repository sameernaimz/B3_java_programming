package day03_comments_escape_sequence;

public class Quotes {
    public static void main (String [] args) {

        System.out.println("test");

        /*
            Q: How can you out/run/execute this

            I like "java" programing.
         */

        System.out.println("I like \"java\" programming");
                System.out.println("\"This is a double quote\""); // "this is a double quote"

        /*
            Q: How About if i want to print the following

            The Car has on/off button
         */
        System.out.println("The car has on\\\\offbutton"); // on/"off

        // For For forward slash we do not need any escape sequence
        System.out.println("The password can be true/false");

    }
}
