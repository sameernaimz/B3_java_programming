package day06_a_arithmetic_operators;

public class CastingExamples {
    public static void main (String [] args);

    int num1 = 40;
    float num2 = num1; //int is smaller than float, IMPLICIT / AUTOMATIC casting happens
    System.out.println(num1)
    System.out.println(num2)

    float num3 = 10.5F;
    short num4 = (short)num3; // short is smaller than float. We neec casting-= Casting -= EXPLICIT CASTING/MANUAL Casting-=narrowing casting -= DATA LOSS
    System.out.println(num3);

}
