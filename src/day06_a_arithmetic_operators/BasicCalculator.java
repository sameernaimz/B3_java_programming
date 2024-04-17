package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main (String [] args) {

        double num1 = 7; // the values datatype is int. Since we assigned it into double variable, it was converted AUTOMATICALLY into double.
        double num2 = 5;

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double remainder = num1 % num2;  //module --- >  7 / 5 = whatever is not DIVISIBLE will be the REMAINDER

        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " % " + num2 + " = " + remainder);


        num1 = 13;
        num2 = 5;
        remainder = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + remainder);   //module --- >  13 / 5 = whatever is not DIVISIBLE will be the REMAINDER

/*
        13 / 5 = 2.6
        13 % 5 = 3
            5 + 5 + 3
 */


        int n1 = 7;
        int n2 = 5;
        int result = n1 / n2;
        System.out.println(result); // 1.4 -- > 1





    }
}

