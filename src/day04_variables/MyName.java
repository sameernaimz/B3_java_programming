package day04_variables;

public class MyName {
    public static void main (String [] args) {
        char first = 's';
        char second = 'a';
        char third = 'm' ;
        char fourth = 'e' ;

        System.out.println(first);
        System.out.println("Second =" + second);
        System.out.println("third = " + third);
                System.out.println("fourth = " + fourth);

        System.out.println();

        System.out.println(first + second + third + fourth );  //int

        String name = "" + first + second + third + fourth ;
        System.out.println(name);

        char letter1 = 1243;
        System.out.println(letter1);
        char letter2 = 43904;
        System.out.println(letter2);


    }
}
