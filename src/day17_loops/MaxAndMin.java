package day17_loops;
import  java.util.Scanner;
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner key =new Scanner(System.in);

        int n = 1;
        int userNum;

        int max =  2_147_483_647;
        int min = 2_147_483_647;
        while(n <= 5) {
            System.out.println("please enter a number:");
            key.nextInt();

            n++;

        }
    }
}
